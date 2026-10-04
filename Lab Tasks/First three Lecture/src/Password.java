public class Password {
    public static void calculateRisk(int strongPassword, int malLinks){
        if (strongPassword>=8){
            if (malLinks<3){
                System.out.println("Congratulations!You have good security measures.");
            }
        }else {
            System.out.println("Warning!!Improve your security.");
        }
    }
    public static void main(String[] args){
        int password=1234345656;
        int links=1;

        calculateRisk(password,links);

        password=345;
        links=8;

        calculateRisk(password,links);
    }

}
