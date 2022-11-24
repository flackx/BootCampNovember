package JavaInputOutputExcersises;

import java.io.File;

public class CheckIfDirHasPerm {
    public static void main(String[] args) {
        File file = new File("/Users/brendons/IdeaProjects/BootCampNovember/src/CheckIfDirHasPerm.java");
        filehasperms(file);
    }
    public static void filehasperms(File x){
        if (x.canRead()) {
            System.out.println("The directory or file can be read");
        } else {
            System.out.println("The directory or file cannot be read");
        }
        if (x.canWrite()) {
            System.out.println("The directory or file can be written");
        } else {
            System.out.println("The directory or file cannot be written");
        }
        if (x.canExecute()) {
            System.out.println("The directory or file can be executed");
        } else {
            System.out.println("The directory or file cannot be executed");
        }
    }
}
