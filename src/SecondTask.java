import java.util.Scanner;

public class SecondTask {
    public void getNumberOfPoints() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of a circle: ");
        double r = scanner.nextDouble();

        System.out.print("Enter an even number of elements: ");
        int n = scanner.nextInt();

        double[] A = new double[n]; // Масив для зберігання координат точок

        // Зчитуємо координати точок з консолі
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a" + (i + 1) + ": ");
            A[i] = scanner.nextDouble();
        }

        // Підрахунок кількості точок, що належать кругу
        int count = countPointsInCircle(r, A);

        System.out.println("Number of points belonging to a circle with a radius " + r + ": " + count);
    }

    // Метод для підрахунку кількості точок, які належать кругу
    private static int countPointsInCircle(double r, double[] A) {
        int count = 0;

        for (int i = 0; i < A.length; i += 2) {
            double x = A[i];
            double y = A[i + 1];
            double distanceSquared = Math.pow(x, 2) + Math.pow(y, 2); // Квадрат відстані до точки від початку координат

            if (distanceSquared == Math.pow(r, 2)) {
                count++;
            }
        }
        return count;
    }
}
