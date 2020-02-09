package figures;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = {
                new Rectangle("red", 22, 34.5),
                new Rectangle("white", 0,0),
                new Rectangle("black", 123,8.34),
                new Rectangle("green", 12,90),
                new Circle("yellow", -21),
                new Circle("lilac", 444),
                new Circle("violet", 0.2),
                new Triangle("rose", 5,8,4),
                new Triangle("brown", 24, 8.4, 9)};



        showAll(figures);
        System.out.println( "Сумма всех фигур: " + countAllAreas(figures));
        System.out.println( "Сумма фигур заданного типа: " + countAllAreas(figures, "Rectangle"));
    }


    public static void showAll(Shape[] arr){
        for(Shape elem: arr){
            double area = elem.calcArea();
            if (area == 0){
                System.out.println(elem + " Such " + elem.getClass().getSimpleName() + " doesn't exist");
            } else {
            System.out.println(elem + "  area = " + area);
            }
        }
    }

    public static double countAllAreas( Shape[] arr){
        double sum = 0;
        for (Shape elem :arr){
            double area = elem.calcArea();
            sum += area;
        }
        return sum;
    }

    public static double countAllAreas( Shape[] arr, String figure){
        double sum = 0;
        for (Shape elem :arr){
            if (elem.getClass().getSimpleName().equals(figure)) {
                double area = elem.calcArea();
                sum += area;
            }
        }
        return sum;
    }


}
