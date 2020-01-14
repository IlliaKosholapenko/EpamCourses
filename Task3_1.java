public class Task3_1 {
    public static void main(String[] args) {
        String star = "*";
        final int LINES_TOTAL = 13;
        int star_num;
        int lines_left = LINES_TOTAL;
        int middle = (lines_left/2)+1;
        while (lines_left > 1 ){

            if (lines_left >= middle) {
                star_num = LINES_TOTAL-lines_left;
                while (star_num >0){
                    System.out.print(star + " ");
                    star_num--;
                }
                System.out.println();

            } else {
                star_num = 1;
                do {
                    System.out.print(star + " ");
                    star_num++;
                } while (lines_left > star_num);
                System.out.println();


            }
            lines_left--;
        }


    }
}
