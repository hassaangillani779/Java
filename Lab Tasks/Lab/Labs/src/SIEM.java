import java.util.*;
public class SIEM {
    Scanner sc=new Scanner(System.in);
    int ID;
    String IP;
    SIEM(int ID,String IP){
        this.ID=sc.nextInt();
        this.IP=sc.nextLine();
    }
    void severityScore()
}
class failedLogin extends SIEM{
    int LoginseverityScore;

}
class portScan extends SIEM{
    int PortseverityScore;

}
class malwareAlert extends SIEM{
    int MalwareseverityScore;
}
