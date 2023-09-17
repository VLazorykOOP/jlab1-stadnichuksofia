import java.util.Scanner;
public class FirstTask {
    public void getValuesOfMathExpression() {
        Scanner in = new Scanner(System.in);
        System.out.println("\tTask 1 \n 1)x,y-double => double\n 2)x,y-int => double\n 3)x,y-double => int\t");
        int task = in.nextInt();
        double result = 0.0;
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter y: ");
        double y = in.nextDouble();
        switch (task) {
            case 1:
                result = (x * y) + (Math.pow(x + y, 3) / (Math.pow(x, 2) + Math.pow(y, 2))) * (x - y);
                break;
            case 2:
                int intx = (int) x;
                int inty = (int) y;
                result = (intx * inty) + (Math.pow(intx + inty, 3) / (Math.pow(intx, 2) + Math.pow(inty, 2))) * (intx - inty);
                break;
            case 3:
                int intResult = (int) ((x * y) + (Math.pow(x + y, 3) / (Math.pow(x, 2) + Math.pow(y, 2))) * (x - y));
                System.out.println("Result is: " + intResult);
                break;
        }
        if (task != 3) {
            System.out.println("Result is: " + result);
        }
    }
}
