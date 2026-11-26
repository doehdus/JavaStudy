import java.util.*;
import java.io.*;

public class NumScanner2 {
    public static void main(String[] args){
        Scanner sc = null;
        try{
            sc = new Scanner(new File("numbers.txt"));
            int n = sc.nextInt();
            System.out.println(n);
        }
        catch (FileNotFoundException e){
            System.out.println("numbers.txt 파일이 존재하지 않습니다.");

        }
        catch (InputMismatchException e){
            System.out.println("다음 데이터가 정수값이 아닙니다.");
        }
        catch(NoSuchElementException e){
            System.out.println("읽을 데이터가 없습니다");
        }
        finally{
            if(sc != null){
                System.out.println("finally 블록에서 Scanner를 닫습니다.");
                sc.close();
            }
        }
    }
}
