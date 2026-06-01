import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class NIOCopier implements FileCopier {
    @Override
    public void copy(String source, String destination) throws CopyException {
        try (FileInputStream fileInputStream = new FileInputStream(source);

             FileOutputStream fileOutputStream = new FileOutputStream(destination)) {
            FileChannel sourceChannel = fileInputStream.getChannel();
            FileChannel destinationChannel = fileOutputStream.getChannel();

            long bytesTransferred = 0;
            long size = sourceChannel.size();

            while (bytesTransferred < size) {
                bytesTransferred += sourceChannel.transferTo(bytesTransferred, size - bytesTransferred, destinationChannel);
            }

        } catch (IOException e) {
            throw new CopyException("NIO Copy Exception: " + e.getMessage());
        }

    }
}
