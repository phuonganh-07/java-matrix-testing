package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
  public boolean checkFileExistsSafe(String folder, String filename) {
    Path path = Paths.get(folder, filename);
    System.out.println("Checking safe path: " + path.toString());
    return path.toFile().exists();
  }

  public static void main(String[] args) {
    System.out.println("He thong dang chay tren: " + System.getProperty("os.name"));
  }
}