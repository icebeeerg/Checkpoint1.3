public class CheckHub {

    public static void main (String[] args) {

        int rows = 4;
        int cols = 4;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
