package classwork.day4;

public class TestRecursiveSum {
    long sum(int n){
        if(n == 1){return 1;}
        else { return n + sum(n-1);}
    }

    public static void main(String[] args){
        TestRecursiveSum sum = new TestRecursiveSum();
        System.out.println(sum.sum(100));
    }
}
