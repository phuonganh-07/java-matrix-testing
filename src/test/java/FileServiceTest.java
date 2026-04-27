import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import java.io.File;
import java.io.IOException;

public class FileServiceTest {

  @Test
  void testFilePathMatrix() throws IOException {
    FileService service = new FileService();
    String tempDir = System.getProperty("java.io.tmpdir");
    String fileName = "test_matrix.txt";

    File tempFile = new File(tempDir, fileName);
    tempFile.createNewFile();

    String manualPath = tempDir + "\\" + fileName;
    System.out.println("Checking path: " + manualPath);

    assert service.checkFileExistsHardcoded(tempDir, fileName) : "Failed on non-compatible OS!";

    tempFile.delete();
  }
}