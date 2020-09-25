package grcy.sda.patterns.behavioral.command;

public class MyFile {
    private String fileName;
    private String content;

    public MyFile(String fileName) {
        this.fileName = fileName;
    }

    public String createFile(String content) {
        this.content = content;
        return "Create file:" + fileName + " with content: " + content;
    }

    public String updateFile(String content) {
        this.content += " | " + content;
        return "Update file:" + fileName + " with new content:" + content;
    }

    public String getContent() {
        return content;
    }

}
