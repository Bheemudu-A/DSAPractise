package multithreading.filedownloader;

import java.io.*;
import java.net.URL;

public class FileDownloader implements Runnable {
    private String fileURL;
    private String fileName;
    private volatile boolean paused = false;
    private volatile boolean running = true;

    public FileDownloader(String fileURL, String fileName) {
        this.fileURL = fileURL;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try (BufferedInputStream in = new BufferedInputStream(new URL(fileURL).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while (running && (bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                synchronized (this) {
                    while (paused) {
                        wait();
                    }
                }
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        paused = true;
    }

    public synchronized void resume() {
        paused = false;
        notify();
    }

    public void stop() {
        running = false;
    }
}

