import java.util.Scanner;

class Event {
    Scanner sc= new Scanner(System.in);
    private int ID;
    private String IP;

    //Getters
    int getID(){
        return ID;
    }
    String getIP(){
        return IP;
    }

    //Constructor
    Event(int ID,String IP){
        this.ID=ID;
        this.IP=IP;
    }

    //Setters

    public void setID(int ID) {
        System.out.println("Enter ID: ");
        ID=sc.nextInt();
        this.ID = ID;

    }

    public void setIP(String IP) {

        this.IP = IP;
    }



    //Labeling the Severity
    String getLabel(){
        if (calcSeverity()>=70){
            return "HIGH";
        }else if(calcSeverity()>=40){
            return "MEDIUM";
        }
        return "LOW";
    }

    //Severity Calculation
    int calcSeverity(){
        return 0;
    }

}

//Login Attempts
class FailedLogin extends Event{
    private int attempts;
    int getAttempts(){
        return attempts;
    }
    FailedLogin(int ID, String IP, int attempts){
        super(ID,IP);
        this.attempts=attempts;
    }

    @Override
    int calcSeverity(){
        int score=attempts*5;
        if(score>100)
            return 100;
        else
            return score;
    }
}

//Port Scanning Class
class PortsScanned extends Event{
    private int portsScanned;
    int getPortsScanned(){
        return portsScanned;
    }
    PortsScanned(int ID,String IP, int portsScanned){
        super(ID, IP);
        this.portsScanned=portsScanned;
    }
    @Override
    int calcSeverity(){
        int score=portsScanned/10;
        if(score>100)
            return 100;
        else
            return score;
    }
}

//Malware Alert
class MalwareAlert extends Event{
    private boolean Spreading;
    boolean isSpreading(){
        return Spreading;
    }
    MalwareAlert(int ID, String IP, boolean isSpreading){
        super(ID, IP);
        this.Spreading=isSpreading;
    }
    @Override
    int calcSeverity(){
        if(Spreading){
            return 95;
        }
        return 70;
    }
}


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Event[] events= new Event[67];


        for (Event e : events) {
            System.out.println(e.getID() + " " + e.getIP() + " " + e.calcSeverity() + " " + e.getLabel());
        }


    }
}
