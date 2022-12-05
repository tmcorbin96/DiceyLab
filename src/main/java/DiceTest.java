import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void testDice(){
        Dice dice = new Dice(2);
        ArrayList<Integer> randomSum = new ArrayList<Integer>();
        int counter = 0;

        for(int i = 0; i < 100; i++){
            randomSum.add(Dice.tossAndSum());
        }
        for(int i = 0; i < randomSum.size(); i++){
            if (i<2 || i > 12) {
                break;
            }
            else {

            }
            counter++;

            Assert.assertTrue(counter == 100);
        }
    }

    @Test
    public void constructorTest(){
        int expected = 2;
        Dice dice = new Dice(2);
        int actual = dice.diceNum;
        Assert.assertEquals(expected, actual);

    }

}