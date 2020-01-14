public class Task3_3 {
    public static void main(String[] args) {
        String star = "*";
        String space = " ";

        final int LINES_TOTAL = 7;
        int lines_left = LINES_TOTAL;
        int space_num;
        int star_num;

        while (lines_left > 0){
            star_num = LINES_TOTAL - lines_left;
            space_num = LINES_TOTAL - star_num;

            while (space_num > 0){
                System.out.print(space+space);
                space_num--;
            }
            while (star_num > 0){
                System.out.print(" " +star);
                star_num--;

            }

            System.out.println();
            lines_left--;
        }
    }
}
