package grcy.sda.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class FileOperationPerformer {

    private final List<FileOperation> fileOperationHistory = new ArrayList<>();

    public String execute(FileOperation fileOperation, String content) {
        fileOperationHistory.add(fileOperation);
        return fileOperation.performOperation(content);
    }

    public List<FileOperation> getFileOperationHistory() {
        return fileOperationHistory;
    }
}
