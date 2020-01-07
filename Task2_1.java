import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше число : ");
        int num = scan.nextInt();

        int reverseNum = num % 100 % 10 * 100   +   num % 100 - num % 100 % 10   +   num/100;
        System.out.println( "Обратное число = " + reverseNum);
        System.out.println("Разница обратного к введенному числу = " + (reverseNum - num));
    }
}
