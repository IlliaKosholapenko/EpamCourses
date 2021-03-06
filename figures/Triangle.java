package figures;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   a= " + a +
                "   b= " + b +
                "   c= " + c;
    }

    @Override
    public double calcArea() {
        if (a>b+c || b>a+c || c>a+b || a<0 || b<0 || c<0){
            return 0;
        }
        double p = (a+b+c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
