public class Attributes {
    String name;
    int age;
    static void profile(String name,int age){
        if (age>=55){
            System.out.println("You are getting old "+name+" Damn it!");
        } else if (age>=45) {
            System.out.println(name+ " You are too old for this.Aha!");
        } else if (age<=44) {
            System.out.println(name+ " You are a young man boy.");
        }

    }
    public static void main(String[] args){
        Attributes a1= new Attributes();
        a1.name="Ali";
        a1.age=46;
        profile(a1.name,a1.age);
    }
}
