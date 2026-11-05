import java.util.Scanner;

// 아이디와 비밀번호를 검사하는 클래스
class Login {
    String id = "admin";
    String password = "1234";

    // 로그인 검사 메서드
    boolean checkLogin(String inputId, String inputPw) {
        return id.equals(inputId) && password.equals(inputPw);
    }
}

// 메인 클래스
public class Login1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        while (true) {
            System.out.print("ID: ");
            String inputId = sc.nextLine();

            System.out.print("Password: ");
            String inputPw = sc.nextLine();

            // Login 클래스의 메서드 호출
            if (login.checkLogin(inputId, inputPw)) {
                System.out.println("Login");
                break;
            } else {
                System.out.println("아이디 또는 비밀번호가 틀렸습니다. 다시 입력하세요.");
            }
        }

        sc.close();
    }
}