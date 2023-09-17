import java.util.Scanner;

public class ThirdTask {
    public void renderMatrixByMaxEl() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмірність матриці n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Знаходимо максимальний елемент матриці і його індекси
        int maxElement = matrix[0][0];
        int maxRowIndex = 0;
        int maxColIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRowIndex = i;
                    maxColIndex = j;
                }
            }
        }

        // Перестановка рядків
        int[] tempRow = matrix[0];
        matrix[0] = matrix[maxRowIndex];
        matrix[maxRowIndex] = tempRow;

        // Перестановка стовпчиків
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][maxColIndex];
            matrix[i][maxColIndex] = temp;
        }

        // Виводимо матрицю з максимальним елементом у лівому верхньому куті
        System.out.println("Матриця з максимальним елементом у лівому верхньому куті:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
