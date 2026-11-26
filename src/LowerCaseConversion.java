import java.io.FileReader;
import java.io.BufferedReader;

public class LowerCaseConversion {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("hello.txt");
            BufferedReader f = new BufferedReader(fr);
            int data;

            while((data = f.read()) != -1){
                char ch = Character.toLowerCase((char) data);
                System.out.print(ch);
            }
            f.close();
            System.out.println("\n");

            BufferedReader fd =  new BufferedReader(new FileReader("hello.txt"));
            String line = fd.readLine();
            while((line != null)){
                System.out.println(line.toLowerCase());
                line = fd.readLine();
            }
            f.close();

        }
        catch(Exception e){ e.printStackTrace();}
    }
}
