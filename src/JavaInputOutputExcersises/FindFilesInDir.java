package JavaInputOutputExcersises;

import java.io.File;

public class FindFilesInDir {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        File file = new File("Main.java");
        //System.out.println(file.getAbsolutePath());
        File directoryPath = new File("/Users/brendons/IdeaProjects/BootCampNovember/src");
        System.out.println("List of files and directories in the specified directory:");
        for (String fileNames : directoryPath.list()) {
            System.out.println(fileNames);
        }
    }
}
