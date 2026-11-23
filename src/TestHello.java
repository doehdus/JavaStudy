abstract class Hello{
    private String toWhom;

    public Hello(String whom){ toWhom = whom;}
    public String getWhom() { return toWhom; }
    public abstract void sayHello();
}

public class TestHello {
    public static void main(String[] args){
        Hello[] hArray = new Hello[3];
        hArray[0] = new HelloFrench("js1");
        hArray[1] = new HelloSpanish("js2");
        hArray[2] = new HelloKorean("js3");
        for (Hello hello : hArray){ hello.sayHello();}
    }
}

class HelloFrench extends Hello {
    public HelloFrench(String toWhom) { super(toWhom); }
    @Override
    public void sayHello() { System.out.println("Bonjour " + getWhom()); }
}

class HelloSpanish extends Hello {
    public HelloSpanish(String toWhom) { super(toWhom); }
    @Override
    public void sayHello() {
        System.out.println("Hola a todos " + getWhom());
    }
}

class HelloKorean extends Hello {
    public HelloKorean(String toWhom) { super(toWhom); }
    @Override
    public void sayHello() {
        System.out.println("안녕하세요 " + getWhom());
    }
}
