public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 10},
                {2, 4, 7, 8},
                {3, 6, 9}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}