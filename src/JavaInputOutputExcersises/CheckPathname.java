package JavaInputOutputExcersises;

import java.io.File;

public class CheckPathname {
    public static void main(String[] args) {
        File file = new File("/Users/brendons/IdeaProjects/BootCampNovember/src/CheckPathname.java");
        if (file.exists()) {
            System.out.println("The file or directory exists");
        } else {
            System.out.println("The file or directory does not exist");
        }
    }
}
