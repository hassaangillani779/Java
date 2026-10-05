import java.util.*;
public class MiniLab {
    //Chose a spefic subnet mask to be flagged
    static final String SUSPICIOUS="234.43.";
    //Assigned 50 as the maximum length for device name
    static final int LENGTH=50;
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> deviceList = new ArrayList<>();

    //Tracks Suspicious predefined Ip
    void trackSuspicious() {
        for (Device e : deviceList) {
            if (e.getIp().startsWith(SUSPICIOUS)) {
                e.flag();
            }
        }
    }

    //Adds new device in the arraylist
    void addDevice() {
        String name;
        String ip;
        String IsIt;
        System.out.print("Enter the name of new device: ");
        name = sc.nextLine();
        while (!isValidName(name)){
            System.out.print("Invalid name! Please try again...");
            System.out.println();
            System.out.print("Enter the name of the new device: ");
            name=sc.nextLine();
        }
        System.out.print("Enter the IP address: ");
        ip=sc.nextLine();
        //Is ip address in the true format
        while(!isValidIP(ip)){
            System.out.print("Invalid IP! Please try again...");
            System.out.println();
            System.out.print("Enter IP address: ");
            ip=sc.nextLine();
        }
        System.out.println();
        System.out.print("Has the device been breached before(Yes/No): ");
        IsIt = sc.nextLine();
        Device newDevice = new Device(name, ip);
        //Check if the device was breached before
        if (IsIt.equalsIgnoreCase("yes")) {
            newDevice.flag();
        }
        deviceList.add(newDevice);
    }

    //IP validation method
    boolean isValidIP(String ip){
        String[] parts= ip.split("\\.");
        if (parts.length!=4){
            return false;
        }
        for (String p : parts){
            try {
                int n=Integer.parseInt(p);
                if(n<0 || n>255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    //Name validation method
    boolean isValidName(String name){
        if (name.isBlank()){
            return false;
        }
        if(name.length()>LENGTH){
            return false;
        }
        return true;
    }

    //Display method
    void printDevice() {
        for (Device e : deviceList) {
            System.out.println("\t========Device Details========");
            System.out.println("Device name is: " + e.getName());
            System.out.println("Device IP is: " + e.getIp());
            if (e.isCompromised()) {
                System.out.println("Device is compromised!");
            } else {
                System.out.println("Device is good to go.");
            }
        }
        System.out.println("\t=================================");
    }

    //If the user wants to exit or add more devices
    boolean stay(){
        String wish;
        System.out.print("Do you want to add a new device? ");
        wish=sc.nextLine();
        System.out.println();
        if (!wish.equalsIgnoreCase("yes")){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        MiniLab lab = new MiniLab();
        while(lab.stay()) {
            lab.addDevice();
            lab.trackSuspicious();
            System.out.println("\t----------------");
        }
        lab.printDevice();

    }
}

//A class with protected data
class Device{
    private String name;
    private String ip;
    private boolean compromised=false;
    String getName(){
        return name;
    }
    String getIp(){
        return ip;
    }
    boolean isCompromised() {
        return compromised;
    }
    void flag(){

        compromised=true;

    }
    Device(String name, String ip){
        this.name=name;
        this.ip=ip;
    }

}
