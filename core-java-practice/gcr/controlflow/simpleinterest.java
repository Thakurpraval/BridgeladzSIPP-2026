import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleinterest = (principal * rate * time)/100;
        System.out.println("Simple Interest is "+ simpleinterest);
        sc.close();
    }
    
}