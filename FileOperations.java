import java.io.*;
import java.util.Scanner;

public class FileOperations {
    
    // Method to copy a binary file
    public static void copyFile(String sourcePath, String destPath) {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {
             
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    // Method to delete a file
    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Method to update (overwrite) data in a file
    public static void updateFile(String filePath, String newData) {
        try (FileWriter writer = new FileWriter(filePath, false)) {
            writer.write(newData);
            System.out.println("File updated successfully!");
        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }
    }

    // Method to insert (append) data into a file
    public static void insertDataIntoFile(String filePath, String data) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(data);
            System.out.println("Data inserted successfully!");
        } catch (IOException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an operation:");
        System.out.println("1. Copy File");
        System.out.println("2. Delete File");
        System.out.println("3. Update File");
        System.out.println("4. Insert Data into File");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        switch (choice) {
            case 1:
                System.out.print("Enter source file path: ");
                String source = scanner.nextLine();
                System.out.print("Enter destination file path: ");
                String dest = scanner.nextLine();
                copyFile(source, dest);
                break;
            case 2:
                System.out.print("Enter file path to delete: ");
                String deletePath = scanner.nextLine();
                deleteFile(deletePath);
                break;
            case 3:
                System.out.print("Enter file path to update: ");
                String updatePath = scanner.nextLine();
                System.out.print("Enter new content: ");
                String newData = scanner.nextLine();
                updateFile(updatePath, newData);
                break;
            case 4:
                System.out.print("Enter file path to insert data: ");
                String insertPath = scanner.nextLine();
                System.out.print("Enter data to insert: ");
                String insertData = scanner.nextLine();
                insertDataIntoFile(insertPath, insertData);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
