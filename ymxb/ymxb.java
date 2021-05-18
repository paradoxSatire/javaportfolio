import java.util.*;
class ymxb{

    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a slope value:\t");
        float m = scan.nextFloat();
        System.out.print("Please enter an x coordinate:\t");
        float x = scan.nextFloat();
        System.out.print("Please enter a y-intercept:\t");
        float b = scan.nextFloat();
        float y = (m*x)+b;
        System.out.println("The y coordinate is " + y);
    }
}