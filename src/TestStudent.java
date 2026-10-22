class StudentIs{
    String name;
    double gpa;
    int incomeLevel;

    StudentIs(String name, double gpa, int incomeLevel){
        this.name = name;
        this.gpa = gpa;
        this.incomeLevel = incomeLevel;
    }
    String getName(){
        return name;
    }
    double getGpa(){
        return gpa;
    }
    int getIncomeLevel(){
        return incomeLevel;
    }
}

public class TestStudent {
    public static void main(String[] args){
        StudentIs[] s= new StudentIs[3];

        s[0] = new StudentIs("김규상", 4.1, 3);
        s[1] = new StudentIs("김민재", 3.71, 5);
        s[2] = new StudentIs("김용하", 3.93, 7);

        int i;
        String result;
        for(i=0; i<3; i++){
            result = ((s[i].gpa>=3.5)&&(s[i].incomeLevel<=5) ? " 장학생 후보입니다" : " 장학생 후보가 아닙니다");
            System.out.printf("%s 학생은" + result +"\n", s[i].getName());
        }
    }
}
