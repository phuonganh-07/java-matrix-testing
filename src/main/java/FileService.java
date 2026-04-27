import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

public class FileService {

  public boolean checkFileExistsHardcoded(String folder, String filename) {
    String path = folder + "\\" + filename;
    File file = new File(path);
    return file.exists();
  }

  public boolean checkFileExistsSafe(String folder, String filename) {
    Path path = Paths.get(folder, filename);
    return path.toFile().exists();
  }

  public static void main(String[] args) {
    System.out.println("He thong dang chay tren: " + System.getProperty("os.name"));
  }
}