public class Task3_5 {
    public static void main(String[] args) {
        String star = "*";
        String space = " ";

        final int LINES_TOTAL = 13;
        final int MIDDLE = (LINES_TOTAL/2)+1;
        int lines_left = LINES_TOTAL;
        int space_num;
        int star_num;

        while (lines_left>0){
            if (lines_left > MIDDLE) {
                star_num = LINES_TOTAL - lines_left + 1;
            } else {
                star_num = MIDDLE - lines_left + 1;
            }
            space_num = MIDDLE - star_num;

            while (space_num > 0){
                System.out.print(space);
                space_num--;
            }

            while (star_num >0){
                System.out.print(" " +star);
                star_num--;

            }

            System.out.println();
            lines_left--;
        }

    }
}
