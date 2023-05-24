import java.util.Scanner;

public class Raindrops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int number = scanner.nextInt();

        String raindropString = convertToRaindrop(number);

        System.out.println(raindropString);
    }

    public static String convertToRaindrop(int number) {
        StringBuilder raindrop = new StringBuilder();

        if (number % 3 == 0) {
            raindrop.append("Pling");
        }
        if (number % 5 == 0) {
            raindrop.append("Plang");
        }
        if (number % 7 == 0) {
            raindrop.append("Plong");
        }

        if (raindrop.length() == 0) {
            raindrop.append(String.valueOf(number));
        }

        return raindrop.toString();
    }
}
