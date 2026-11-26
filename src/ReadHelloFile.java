import java.util.Scanner;
import java.io.File;
import java.util.concurrent.ExecutionException;

public class ReadHelloFile {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("hello.txt"));
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(Exception e){ e.printStackTrace();}
    }
}
