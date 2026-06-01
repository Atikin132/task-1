import java.io.*;

public class IOCopier implements FileCopier{

    @Override
    public void copy(String source, String destination) throws CopyException{
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {

            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
        catch (IOException e) {
            throw new CopyException("IO Copy Exception: " + e.getMessage());
        }
    }
}
