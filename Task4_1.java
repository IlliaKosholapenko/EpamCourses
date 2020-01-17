import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");
        String line = sc.nextLine();
        int counter = 0;
        String unique_line = "";

        while(counter < line.length()){
            unique_line += findUniqueSymbol(counter,line);
            counter++;
        }
        System.out.println("Уникальные символы в строке: " + unique_line);
    }

    public static String findUniqueSymbol(int counter, String line){
        char symbol = line.charAt(counter);
        String result = "";
        if (line.indexOf(symbol) == line.lastIndexOf(symbol)){
            result += symbol ;
        }
        return result;
    }
}
