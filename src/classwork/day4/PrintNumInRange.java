package classwork.day4;

import java.util.Scanner;

public class PrintNumInRange {
    int value;
    Scanner scanner;

    PrintNumInRange(Scanner scanner) {this.scanner = scanner;}
    boolean isInRange(int min, int max){
        if(min<=value && value<=max) return true;
        else return false;
    }

    void printInt(){System.out.println(value);}
    void readInt(){
        System.out.print("정수를 입력하세요: ");
        value = scanner.nextInt();
    }
}
