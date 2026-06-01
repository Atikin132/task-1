package task1;

public interface FileCopier {
    void copy(String source, String destination) throws CopyException;
}
