package figures;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
            return super.toString() +
                    "   radius= " + radius;

    }

    @Override
    public double calcArea(){
        final float PI = 3.1415f;
        if (radius<=0){
            return 0;
        } else {
            return (radius * radius * 2 * PI);
        }
    }
}
