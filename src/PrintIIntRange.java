import java.util.Scanner;

class InRange {
    int value;
    Scanner scanner;

    InRange(Scanner scanner) {
        this.scanner = scanner;
    }
    boolean isInRange(int min, int max) {
        return (value >= min && value <= max) ? true : false;
    }
    void printAnswer(){
        System.out.println(value);
    }
    void readInt(){
        System.out.println("정수를 입력하세요: ");
        value = scanner.nextInt();
    }
}

public class PrintIIntRange {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        InRange inRange = new InRange(scanner);
        inRange.readInt();

        if(inRange.isInRange(0,100)){
            inRange.printAnswer();
        }
        else{
            System.out.println("잘못입력");
        }

    }
}
