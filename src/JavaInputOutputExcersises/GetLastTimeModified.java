package JavaInputOutputExcersises;

import java.io.File;
import java.util.Date;

public class GetLastTimeModified {
    public static void main(String[] args) {
        File file = new File("/Users/brendons/IdeaProjects/BootCampNovember/src/JavaInputOutputExcersises/GetLastTimeModified.java");
        System.out.println("Last modified date: " + new Date(file.lastModified()));
    }
}
