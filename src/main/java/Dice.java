import java.util.Random;

public class Dice {
    public static int diceNum;
    public Dice(int numDice) {
        this.diceNum = numDice;
    }
    public static int tossAndSum(){
        Random rand = new Random();
        int randomSum = 0;
        for(int i = 1; i <= diceNum; i++){
            randomSum += rand.nextInt(6) + 1;
        }
        return randomSum;
    }


}