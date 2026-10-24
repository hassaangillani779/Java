import java.util.Scanner;
import java.util.ArrayList;
class Event {
    private int ID;
    private String IP;
    String getLabel(){
        if (calcSeverity()>70){
            return "HIGH";
        }else if(calcSeverity()>=40){
            return "MEDIUM";
        }
        return "LOW";
    }
    int getID(){
        return ID;
    }
    String getIP(){
        return IP;
    }
    Event(int ID,String IP){
        this.ID=ID;
        this.IP=IP;
    }
    int calcSeverity(){
        return 0;
    }

}
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
        ArrayList <Event> e1= new ArrayList<>();
        e1.add(new FailedLogin(75,"598.43.53",76));
        e1.add(new PortsScanned(980,"897.98.45.7",578));
        e1.add(new MalwareAlert(45,"23.43.53.4",false));

        for (Event e : e1) {
            System.out.println(e.getID() + " " + e.getIP() + " " + e.calcSeverity() + " " + e.getLabel());
        }


    }
}
