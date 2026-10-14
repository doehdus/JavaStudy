import java.util.Scanner;

class Student{
    private int studentId;
    private String name;
    private String major;
    private int number;

    void setStudentId(int studentId){
        this.studentId = studentId;
    }
    int getStudentId(){
        return studentId;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setMajor(String major){
        this.major = major;
    }
    String getMajor(){
        return major;
    }

    void setNumber(int number){
        this.number = number;
    }
    int getNumber(){
        return number;
    }
}

class Homework2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for(int i = 0; i < students.length; i++){
            System.out.print("학생의 학번, 이름 전공, 전화번호를 입력하세요: ");

            int studentId = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int number = sc.nextInt();

            students[i] = new Student();

            students[i].setStudentId(studentId);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setNumber(number);
        }
        System.out.println("\n입력된 학생의 정보는 다음과 같습니다.");

        for(int i = 0; i<students.length; i++){
            Student s = students[i];

            String phone = "0" + s.getNumber();
            char[] phoneArray = phone.toCharArray();

            String formattedNum =
                    new String(phoneArray, 0, 3) + "-" +
                            new String(phoneArray, 3, 4) + "-" +
                            new String(phoneArray, 7, 4);


            System.out.print((i+1) + "번째 학생: ");
            System.out.println(s.getStudentId() + " " + s.getName() + " " + s.getMajor() + " "+ formattedNum);
        }


    }
}