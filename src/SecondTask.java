import java.util.Scanner;

public class SecondTask {
    public void getNumberOfPoints() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter r: ");
        double r = scanner.nextDouble();

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double[] A = new double[2 * n]; // Масив для зберігання координат точок

        // Зчитуємо координати точок з консолі
        for (int i = 0; i < 2 * n; i++) {
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
            double distanceSquared = x * x + y * y; // Квадрат відстані до точки від початку координат

            if (distanceSquared <= r * r) {
                count++;
            }
        }
        return count;
    }
}
