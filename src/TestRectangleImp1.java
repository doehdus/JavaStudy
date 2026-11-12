interface IShape{
    public double getArea();
    double getPerimeter();
}

class RectangleImp1 implements IShape{
    private double width, height;
    public RectangleImp1(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+height);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
}

class TestRectangleImp1{
    public static void main(String[] args){
        IShape r = new RectangleImp1(10.,20.);
        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
    }
}