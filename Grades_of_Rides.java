import java.util.Scanner;

public class RideGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hurlFactor = scanner.nextInt();
        int spinFactor = scanner.nextInt();
        int speedFactor = scanner.nextInt();

        int grade = calculateGrade(hurlFactor, spinFactor, speedFactor);

        System.out.println(grade);
    }

    public static int calculateGrade(int hurlFactor, int spinFactor, int speedFactor) {
        if (hurlFactor > 50 && spinFactor > 60 && speedFactor > 100) {
            return 10;
        } else if (hurlFactor > 50 && spinFactor > 60) {
            return 9;
        } else if (spinFactor > 60 && speedFactor > 100) {
            return 8;
        } else if (hurlFactor > 50 && speedFactor > 100) {
            return 7;
        } else if (hurlFactor > 50 || spinFactor > 60 || speedFactor > 100) {
            return 6;
        } else {
            return 5;
        }
    }
}
