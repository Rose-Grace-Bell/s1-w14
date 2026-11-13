public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(10000000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
      for(int i =1; i<4; i++){
         SimMonty m = new SimMonty(i);
         int countRuns = 0;
         myWinTotal = 0;
         while(countRuns<numGames){
            myWinTotal+=m.playGame();
            countRuns++;
         }
         System.out.println((myWinTotal * 1.0)/numGames);
    }
    }
    
    
}      
