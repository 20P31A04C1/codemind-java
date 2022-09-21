import java.util.*;
class sample
{    
    public static void main(String[] args) {
    float celsius, fahrenheit;
    Scanner sc = new Scanner(System.in);
    fahrenheit= sc.nextFloat();
    celsius = ((fahrenheit-32)*5)/9;
    System.out.format("%.2f",celsius);
}
}