import java.util.*;
public class SIEM {
    ArrayList<SIEM> Logs =new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int ID;
    String IP;
    SIEM(int Severity1,int Severity2,int Severity3,int ID,String IP){
        this.ID=sc.nextInt();
        this.IP=sc.nextLine();
    }
}
class failedLogin extends SIEM{
    SI
    int LoginseverityScore;

}
class portScan extends SIEM{
    int PortseverityScore;

}
class malwareAlert extends SIEM{
    int MalwareseverityScore;
}
