import java.util.Random;

public class DoubleDiceShaker implements DiceShaker{
    @Override
    public int next() {
        return new RandomSingleDiceShaker().next()
                + new RandomSingleDiceShaker().next();
    }
    @Override
    public boolean hasNext(){
        return true;
    }

}
