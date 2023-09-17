import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter task: ");
        Scanner in = new Scanner(System.in);
        int tasks = in.nextInt();
        FirstTask first = new FirstTask();
        SecondTask second = new SecondTask();
        ThirdTask third = new ThirdTask();
        FourthTask fourth = new FourthTask();
        switch (tasks) {
            case 1:
                first.getValuesOfMathExpression();
                break;
            case 2:
                second.getNumberOfPoints();
                break;
            case 3:
                third.renderMatrixByMaxEl();
                break;
            case 4:
                fourth.removeDuplicateLetters();
                break;
        }
    }


}