import java.util.Scanner;

public class ClockAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        double angle = calculateClockAngle(time);

        System.out.println(angle);
    }

    public static double calculateClockAngle(String time) {
        String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        // Calculate the angle of the hour hand
        double hourAngle = (hour % 12 + minute / 60.0) * 30;

        // Calculate the angle of the minute hand
        double minuteAngle = minute * 6;

        // Calculate the absolute difference between the two angles
        double angle = Math.abs(hourAngle - minuteAngle);

        // Calculate the minimum angle (either clockwise or anti-clockwise)
        angle = Math.min(angle, 360 - angle);

        return angle;
    }
}
