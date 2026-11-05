public class Parent {
    private String name;
    public Parent(String n) {
        System.out.println("Parent constructor");
        name = n;
    }
    public String getName() { return name; }
    public void setName(String n) { name = n; }
}

class Child extends Parent {
    private int value;
    public Child(String n, int v) {
        super(n);  // Parent(String n) 호출
        System.out.println("Child constructor");
        value = v;
    }
    public int getValue() { return value; }
    public void setValue(int v) { value = v; }
}
