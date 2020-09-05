package grcy.sda.solid.lsp.fixed;

public class Test {
    public static void main(String[] args) {
        FileWritable writable = new File();
        writable.write("aaa".getBytes());

        FileReadable readable = new File();
        readable.read();
        readable = new ReadOnlyFile();
        readable.read();

        //LSP polega na tym żeby wywołanie metody na dowolnej implementacji interfejsu dawało
        //jakiś wynik (nie wyjątek)
    }
}
