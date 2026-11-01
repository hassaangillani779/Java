import java.util.Scanner;
class Student{
    private int ID;
    private double CGPA;
    private String name;

    public int getID(){
        return ID;
    }

    public double getCGPA(){
        return CGPA;
    }

    public String getName(){
        return name;
    }

    Student(int ID, double CGPA, String name){
        this.ID=ID;
        this.CGPA=CGPA;
        this.name=name;
    }
}




public class Main1{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.print("For how many students you want to store data? ");
        n=sc.nextInt();
        sc.nextLine();
        Student [] S=new Student[n];

        System.out.println();
        double maxGpa=0;
        int bestIndex=0;
        for (int i=0; i<n; i++){
            System.out.println("Enter the name of the student: ");
            String name=sc.nextLine();
            System.out.println("Enter Student ID: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter CGPA: ");
            double cgpa=sc.nextDouble();
            sc.nextLine();
            S[i]=new Student(id,cgpa,name);
            if(S[i].getCGPA()>maxGpa){
                maxGpa=S[i].getCGPA();
                bestIndex=i;
            }
        }
        for(int i=0; i<n; i++){
            System.out.println("Name: "+S[i].getName());
            System.out.println("ID: "+S[i].getID());
            System.out.println("CGPA: "+S[i].getCGPA());
            System.out.println("-------------------");
        }
        System.out.println("------Best Student------");
        System.out.println("Index: "+bestIndex);
        System.out.println("ID: "+S[bestIndex].getID());
        System.out.println("Name: "+S[bestIndex].getName());
        System.out.println("CGPA: "+S[bestIndex].getCGPA());
    }
}