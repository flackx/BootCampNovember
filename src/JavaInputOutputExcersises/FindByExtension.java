package JavaInputOutputExcersises;

import java.io.File;

public class FindByExtension {
    public static void main(String[] args) {
        File directoryPath = new File("/Users/brendons/IdeaProjects/BootCampNovember/src/JavaInputOutputExcersises");
        String extension = ".java";
        System.out.println("List of files and directories in the specified directory:");
            for (String fileNames : directoryPath.list()) {
                if (fileNames.endsWith(extension)) {
                    System.out.println(fileNames);
                }
            }
    }
}
