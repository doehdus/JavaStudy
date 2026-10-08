package classwork.day4;

import java.util.Scanner;

public class TestPrintNumInRange {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PrintNumInRange printNumInRange = new PrintNumInRange(scanner);
        printNumInRange.readInt();
        if(printNumInRange.isInRange(1,100)){
            printNumInRange.printInt();
        }
        else{
            System.out.println("1~100범위 밖 정수가 입력되었습니다.");
        }
    }
}
