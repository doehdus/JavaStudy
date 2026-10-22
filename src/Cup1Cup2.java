
import java.util.Scanner;

public class Cup1Cup2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("cup1과 cup2의 물을 채우시오");

        int cup1 = sc.nextInt();
        int cup2 = sc.nextInt();

        // Check the total amount of water
        if ((cup1 + cup2) % 2 != 0) {
            System.out.println("두 컵의 물의 양을 같게 만들 수 없습니다.");
        } else {

            // Transfer water until both cups are equal
            while (cup1 != cup2) {
                if (cup1 > cup2) {
                    cup1--;
                    cup2++;
                } else {
                    cup1++;
                    cup2--;
                }

                System.out.printf("cup1: %d, cup2: %d%n", cup1, cup2);
            }

            System.out.println("cup1과 cup2의 물의 양이 같습니다.");
        }

        sc.close();
    }
}
