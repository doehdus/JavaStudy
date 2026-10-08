package classwork.day4;

public class Sum1 {
    int sum = 0;
    int getSum(){return sum;}
    int add(int num){
        if(num <= 50){return sum;}
        else if (num>100){sum += num;}
        printSum();
        return sum;
    }
    void printSum(){ System.out.println(getSum());}
}
