import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите к-во киллограмов : ");
        float funt_weight ;
        funt_weight = scan.nextFloat();
        float kilo_Weight = (funt_weight * 0.4536F);
        System.out.println("Полученый вес: " + (int)kilo_Weight +" килограмм " +( kilo_Weight - (int)kilo_Weight )*1000+ " грамм");
    }
}
