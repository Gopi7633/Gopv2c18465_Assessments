package FileHandling;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File Obj = new File("D:\\Assessments\\fileHandling\\CreateNewFile\\NewTextFile.txt");
        if (Obj.exists()) {
            System.out.println("File name: " + Obj.getName());

            System.out.println("Absolute path: " + Obj.getAbsolutePath());

            System.out.println("Writeable: " + Obj.canWrite());

            System.out.println("Readable " + Obj.canRead());

            System.out.println("File size in bytes " + Obj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
