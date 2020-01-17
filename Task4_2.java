import java.util.Scanner;

public class Task4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для преобразования: ");
        int num = sc.nextInt();
        String line = "";
        final int SYSTEM_TO_CHANGE = 16;

        do{
            line = divisionByTwoLeft(num,SYSTEM_TO_CHANGE) + line;
            num = num/SYSTEM_TO_CHANGE;
        } while (num > 0);


        line = divisionByTwoLeft(num,SYSTEM_TO_CHANGE) + line;
        System.out.println("Результат: " + line);
    }

    public static String divisionByTwoLeft(int num, int divisor){
        int result = num%divisor;
        return Integer.toString(result);
    }
}
