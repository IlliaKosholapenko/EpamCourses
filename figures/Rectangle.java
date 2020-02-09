package figures;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   width= " + width +
                "   height= " + height;

    }



    @Override
    public double calcArea() {
        if( width<0 || height<0){
            return 0;
        } else {
            return width * height;
        }
    }
}
