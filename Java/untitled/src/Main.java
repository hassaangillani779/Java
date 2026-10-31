 class Employee {
    String name;
    Employee(String name){
        this.name=name;
    }
    void showRole(){
        System.out.println(name+ " is an employee.");
    }


}
class Manager extends Employee{
    Manager(String name){
     super(name);
    }
    @Override
    void showRole(){
        System.out.println(name+ " is a manager.");
    }

}
public class Main {
    public static void main(String[] args) {
        Employee em = new Employee("Ali");
        Manager m = new Manager("Ahmed");
        em.showRole();
        m.showRole();
    }
}