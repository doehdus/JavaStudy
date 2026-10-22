import java.util.Scanner;

public class Ticket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if(input.compareTo("prime") == 0) {
            System.out.println("11000원입니다.");
        }
        else if(input.compareTo("standard")==0){
            System.out.println("10000원입니다.");
        }
        else if(input.compareTo("economy")==0){
            System.out.println("9000원입니다.");
        }
        else{
            System.out.println("좌석 종류를 잘못 입력했습니다.");
        }

        sc.close();

    }


}
