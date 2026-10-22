import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private int phoneNumber;

    // Student ID
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    // Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Major
    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    // Phone number
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        // Input student information
        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.print("학생의 학번, 이름 ");
            int studentId = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            String phone = sc.next();

            // Convert String to int
            int phoneNumber = Integer.parseInt(phone);

            // Save student information
            students[i].setStudentId(studentId);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNumber(phoneNumber);
        }

        // Print student information
        for (int i = 0; i < 3; i++) {

            // Convert int to String
            String phone = Integer.toString(
                    students[i].getPhoneNumber());

            // Restore zero and insert hyphens
            String formattedPhone = "0" +
                    phone.substring(0, 2) + "-" +
                    phone.substring(2, 6) + "-" +
                    phone.substring(6);

            System.out.println(
                    students[i].getStudentId() + " " +
                            students[i].getName() + " " +
                            students[i].getMajor() + " " +
                            formattedPhone
            );
        }

        sc.close();
    }
}
