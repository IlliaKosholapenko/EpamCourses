public class Task2_3 {
    public static void main(String[] args){
        int money_Amount = 10000;
        int months = 6 ;
        int percentage_Per_Year = 12 ;
        float money_Res = money_Amount*(percentage_Per_Year*0.01f);
        System.out.println("Сумма прибыли : " + money_Res*months);
    }
}
