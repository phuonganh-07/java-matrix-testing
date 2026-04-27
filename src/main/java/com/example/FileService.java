package com.example;

import java.io.File;

public class FileService {

  public boolean checkFileExistsHardcoded(String folder, String filename) {
    String path = folder + "\\" + filename;
    System.out.println("Checking path: " + path);
    File file = new File(path);
    return file.exists();
  }

  public static void main(String[] args) {
    System.out.println("He thong dang chay tren: " + System.getProperty("os.name"));
  }
}