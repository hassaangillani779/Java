import java.util.*;
public class Claculator {
    Scanner sc=new Scanner(System.in);

    int add(int a, int b){
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        return a+b;
    }
    int add(int a, int b, int c){
        System.out.println("Enter three numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        return a+b+c;
    }
    double add(double a, double b){
        System.out.println("Enter two floating point numbers: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        return a+b;
    }
    public static void main(String[] args){
        Claculator cal=new Claculator();
        int a=0,b=0,c=0;
        double d=0,e=0;

        System.out.println(cal.add(a,b));
        System.out.println(cal.add(a,b,c));
        System.out.println(cal.add(d,e));



    }

}
