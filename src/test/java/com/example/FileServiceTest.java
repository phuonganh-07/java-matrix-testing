package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.io.IOException;

public class FileServiceTest {

  @Test
  void testFilePathMatrix() throws IOException {
    FileService service = new FileService();
    String tempDir = System.getProperty("java.io.tmpdir");
    String fileName = "test_matrix_bug.txt";

    File tempFile = new File(tempDir, fileName);
    tempFile.createNewFile();

    assertTrue(service.checkFileExistsHardcoded(tempDir, fileName),
        "Loi! Khong tim thay file do sai dinh dang duong dan tren OS nay.");

    tempFile.delete();
  }
}