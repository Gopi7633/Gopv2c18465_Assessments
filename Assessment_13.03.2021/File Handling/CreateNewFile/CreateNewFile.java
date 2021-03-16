import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args){
        try{
            File obj = new File("NewTextFile");
            if (obj.createNewFile()){
                System.out.println("NewTextFile is created sucessfully");
            }else {
                System.out.println("The NewTextFile is already created");
            }
        }catch (IOException e){
            System.out.println("An error as occurred");
            e.printStackTrace();
        }
    }
}
