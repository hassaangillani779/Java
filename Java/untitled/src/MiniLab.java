import java.util.*;
public class MiniLab {
    static final String Suspicious="234.43";
    Scanner sc = new Scanner(System.in);
    ArrayList<Device> deviceList = new ArrayList<>();

    void trackSuspicious() {
        for (Device e : deviceList) {
            if (e.getIp().startsWith(Suspicious)) {
                e.flag();
            }
        }
    }

    void addDevice() {
        String name;
        String ip;
        String yes;
        System.out.print("Enter the name of new device: ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Enter the IP address: ");
        ip=sc.nextLine();
        while(!isValidIP(ip)){
            System.out.print("Invalid IP! Please try again...");
            System.out.println();
            System.out.print("Enter IP address: ");
            ip=sc.nextLine();
        }
        System.out.println();
        System.out.print("Has the device been breached before(Yes/No): ");
        yes = sc.nextLine();
        Device newDevice = new Device(name, ip);
        if (yes.equalsIgnoreCase("yes")) {
            newDevice.flag();
        }
        deviceList.add(newDevice);
    }

    boolean isValidIP(String ip){
        String[] parts= ip.split("\\.");
        if (parts.length!=4){
            return false;
        }
        for (String p : parts){
            try {
                int n=Integer.parseInt(p);
                if(n<0 || n>255)
                    return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

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


    public static void main(String[] args) {
        MiniLab lab = new MiniLab();
        lab.addDevice();
        lab.trackSuspicious();
        System.out.println("\t----------------");
        lab.addDevice();
        lab.trackSuspicious();
        lab.printDevice();

    }
}

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
