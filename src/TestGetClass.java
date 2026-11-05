class CoffeeBean {
    String species = "Coffee";
    void print() {
        System.out.println(species);
    }
    void setSpecies(String s) {
        species = s ;
    }
}

class Arabica extends CoffeeBean {
}

class Robusta extends CoffeeBean {
    String species = "Robusta";
}

public class TestGetClass {
    public static void main(String[] args) {
        CoffeeBean c = new CoffeeBean();
        System.out.println("c의 클래스는: " + c.getClass());
        Arabica a = new Arabica();
        System.out.println("a의 클래스는: " + a.getClass());
        Robusta r = new Robusta();
        System.out.println("r의 클래스는: " + r.getClass());
    }
}