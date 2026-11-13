import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;
    private int t;
    
    public SimContestant (Random randoms, int type) {
        myRandoms = randoms;
        t = type;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = myRandoms.nextInt(3) + 1;//do this ...;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor) {
    if(t==1)//gay
         return myInitialGuess;
    else if(t==2){ //random
        int g = openedDoor;
        while(g == openedDoor){
            g = myRandoms.nextInt(3) + 1;
        }
        return g;
    } else{ //always swithc
        int g = 6-(openedDoor+myInitialGuess);
        return g;
    }
    }
}
