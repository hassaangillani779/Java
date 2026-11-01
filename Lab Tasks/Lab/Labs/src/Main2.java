import java.util.Scanner;
class Employee{
    private String name;
    private int baseSalary;

    public String getName(){
        return name;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
    Employee(String name, int baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }

    int calculateSalary(){
        return baseSalary;
    }

}

class Manager extends Employee{
    private int bonus;

    public int getBonus(){
        return bonus;
    }
    Manager(String name, int baseSalary,int bonus){
        super(name,baseSalary);
        this.bonus=bonus;
    }
    @Override
    int calculateSalary(){
        return getBaseSalary()+bonus;
    }
}
class Intern extends Employee{
    Intern(String name, int salary){
        super(name, salary);
    }
    @Override
    int calculateSalary(){
        return getBaseSalary()/2;
    }
}

public class Main2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees you want to register: ");
        int n=sc.nextInt();
        sc.nextLine();
        Employee[] Staff=new Employee[n];
        int maxSalary=0;
        int maxIndex=0;
        for (int i=0; i<n; i++){
            System.out.println("What is the tittle:(Intern=1, Employee=2,Manager=3) ");
            int title=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the name: ");
            String name=sc.nextLine();
            System.out.println("Enter base salary: ");
            int sal=sc.nextInt();
            sc.nextLine();
            if(title==1){
                Staff[i]=new Intern(name,sal);
                System.out.println(Staff[i].calculateSalary());
            }else if(title==2){
                Staff[i]=new Employee(name,sal);
                System.out.println(Staff[i].calculateSalary());
            }else if(title==3){
                System.out.println("Enter bonus: ");
                int bonus=sc.nextInt();
                sc.nextLine();
                Staff[i]=new Manager(name,sal,bonus);
                System.out.println(Staff[i].calculateSalary());
            }else {
                System.out.println("Invalid number.Enter a number between 1 and 3.");
                i--;
                continue;
            }

            if(Staff[i].calculateSalary()>maxSalary){
                maxSalary=Staff[i].calculateSalary();
                maxIndex=i;
            }
        }
        System.out.println("Highest Salary is: "+maxSalary+ " and located at index: "+maxIndex);
        System.out.println("Name of the highest paid employee is: "+Staff[maxIndex].getName());

        if (n>0) {
            for (int i = 0; i < n; i++) {
                System.out.println("Name: " + Staff[i].getName());
                System.out.println("Salary: " + Staff[i].calculateSalary());
                System.out.println("--------------------------------");
            }
        }else {
            System.out.println("No employees to show: ");
        }

    }
}
