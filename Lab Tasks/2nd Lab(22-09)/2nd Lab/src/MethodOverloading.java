public class MethodOverloading {
    public static int add (int a, int b){
        int sum =a+b;
        System.out.println("Function one sum is: " +sum);
        return sum;
    }
    public static double add(double a, double b){
        double sum= a+b;
        System.out.printf("Function 2 sum is: " +sum);
        return sum;
    }
    public static void main(String[] args){
        int a=57, b=42;
        double c=78.5, d=43.5;
        add(a,b);
        add(c,d);

    }
}
