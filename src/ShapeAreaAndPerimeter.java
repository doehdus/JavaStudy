public class ShapeAreaAndPerimeter {
    public static void main(String[] args) {
        AbstractShape[] shapes = new AbstractShape[2];

        shapes[0] = new ARectangle(100, 50);
        shapes[1] = new ACircle(50);
        // 버전 1 코드
        for (AbstractShape shape : shapes) {
            if (shape instanceof ARectangle) {
                ARectangle ar = (ARectangle) shape;
                System.out.printf("%s area: %.2f\n",
                        ar.getClass(), ar.getArea());
            } else if (shape instanceof ACircle) {
                ACircle ac = (ACircle) shape;
                System.out.printf("%s area: %.2f\n",
                        ac.getClass(), ac.getArea());
            }
        }
    }
}
