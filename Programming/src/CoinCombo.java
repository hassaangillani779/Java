import java.util.*;
public class CoinCombo {
    public static void main(String[] args){
        final int Toss=50000;
        Random rng= new Random();
        int c1,c2,c3,c4,c5,c6;
        int Maxcombo;
        boolean head=false, tails=false;
        int heads=0,tail=0;

       for (int i=0; i<Toss; i++){
           boolean isHead=rng.nextBoolean();
           if(isHead)
               heads++;
           else
               tail++;
       }
    }
}
