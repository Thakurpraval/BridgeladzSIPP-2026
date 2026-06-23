import java.util.*;
public class rectanglearea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double area = 2 * (length * breadth);
        System.out.println("Area of rectangle is"+ area);
        sc.close();
    }
}     