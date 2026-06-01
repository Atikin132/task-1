import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIO2Copier implements FileCopier {
    @Override
    public void copy(String source, String destination) throws CopyException {
        try {
            Path sourcePath = Paths.get(source);
            Path destinationPath = Paths.get(destination);
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new CopyException("NIO2 Copy Exception: " + e.getMessage());
        }
    }
}
