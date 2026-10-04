import java.util.*;
public class Coin {
    public static void main(String[] args){
        final int Toss=50000;
        Random rng= new Random();

        int heads=0 , tails=0;
        int currentCombo=0, maxCombo=0;
        boolean previous=false;
        String max_Combo="";

        for (int i=0; i<Toss; i++){
        boolean isHeads=rng.nextBoolean();
        if (isHeads) heads++;
        else tails++;

        if(i>0 && isHeads==previous){
            currentCombo++;
        }else{
            currentCombo=1;
        }
          if (currentCombo>maxCombo){
              maxCombo=currentCombo;
              max_Combo= isHeads ? "Heads" : "Tails";
          }
          previous=isHeads;
        }
        System.out.println("Total Tosses: " +Toss);
        System.out.println("Heads= "+heads);
        System.out.println("Tails= "+tails);
        System.out.println("Maxcombo= "+maxCombo+ "Max combo side: "+max_Combo);

    }
}
