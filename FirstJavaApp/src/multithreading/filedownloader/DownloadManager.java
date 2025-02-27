package multithreading.filedownloader;

import java.util.ArrayList;
import java.util.List;

public class DownloadManager {
    private List<FileDownloader> downloaders = new ArrayList<>();
    private List<Thread> threads = new ArrayList<>();

    public void addDownload(String url, String fileName) {
        FileDownloader downloader = new FileDownloader(url, fileName);
        Thread thread = new Thread(downloader);
        downloaders.add(downloader);
        threads.add(thread);
        thread.start();
    }

    public void pauseDownload(int index) {
        downloaders.get(index).pause();
    }

    public void resumeDownload(int index) {
        downloaders.get(index).resume();
    }

    public void stopDownload(int index) {
        downloaders.get(index).stop();
    }
}

