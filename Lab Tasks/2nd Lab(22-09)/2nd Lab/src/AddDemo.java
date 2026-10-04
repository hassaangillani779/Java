public class AddDemo {
    public static int add(int a, int b){
        int sum= a+b;
        System.out.println("a+b= " +sum);
        return sum;
    }
    public static void main(String[] args){
        int a=56;
        int b=76;

        System.out.print("a+b= " + add(a,b));
    }
}
