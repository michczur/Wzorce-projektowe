package grcy.sda.solid.lsp.fixed;

public class File implements FileReadable, FileWritable {
    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {
        System.out.println("Writing data : " + data);
    }
}
