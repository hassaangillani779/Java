import java.util.*;
public class Track {
    public static void main(String[] args ){
        int[] numbers=new int[6];
        int max=0;

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<6; i++){
            System.out.print("Enter the "+(i+1)+ " number: ");
            numbers[i]=sc.nextInt();
            max=numbers[0];
        }
       for (int i=1; i<6; i++ ){
           if (numbers[i]>max){
               max=numbers[i];
           }
       }

        System.out.println("The max number is: "+max);


    }
}
