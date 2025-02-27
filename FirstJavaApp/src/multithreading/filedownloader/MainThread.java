package multithreading.filedownloader;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        DownloadManager manager = new DownloadManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add Download\n2. Pause Download\n3. Resume Download\n4. Stop Download\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter File URL:");
                    String url = scanner.nextLine();
                    System.out.println("Enter file name to save as:");
                    String fileName = scanner.nextLine();
                    manager.addDownload(url, fileName);
                    break;
                case 2:
                    System.out.println("Enter index of download to pause:");
                    int pauseIndex = scanner.nextInt();
                    manager.pauseDownload(pauseIndex);
                    break;
                case 3:
                    System.out.println("Enter index of download to resume:");
                    int resumeIndex = scanner.nextInt();
                    manager.resumeDownload(resumeIndex);
                    break;
                case 4:
                    System.out.println("Enter index of download to stop:");
                    int stopIndex = scanner.nextInt();
                    manager.stopDownload(stopIndex);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

