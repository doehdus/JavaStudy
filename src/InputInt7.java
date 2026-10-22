import java.util.Scanner;

public class InputInt7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num < 100) {
            num = sc.nextInt();

            if (num == 0) {
                continue;
            } else if (num < 100) {
                System.out.println(num);
            }
        }

    }
}
