import java.util.*;
public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your base is");
            int base = sc.nextInt();
        System.out.println("Your exponent is");
            int exponent = sc.nextInt();

            double power = Math.pow(base , exponent);
            System.out.println("Power of number is "+ power);
            sc.close();


    }

}