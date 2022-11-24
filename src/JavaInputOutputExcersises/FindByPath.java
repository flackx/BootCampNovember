package JavaInputOutputExcersises;

import java.io.File;

public class FindByPath {
    public static void main(String[] args) {
        File myfile = new File("/Users/brendons/IdeaProjects/BootCampNovember/src/JavaInputOutputExcersises/FindByPath.java");
        if (myfile.exists()) {
            System.out.println("File name: " + myfile.getName());
            System.out.println("Absolute path: " + myfile.getAbsolutePath());
            System.out.println("Writeable: " + myfile.canWrite());
            System.out.println("Readable " + myfile.canRead());
            System.out.println("File size in bytes " + myfile.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
