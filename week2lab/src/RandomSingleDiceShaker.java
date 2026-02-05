import java.util.Random;

public class RandomSingleDiceShaker implements DiceShaker{
    private static final Random random = new Random();

    @Override
    public int next(){
        //nextInt Returns a pseudorandom value between 0 (inclusive) and the specified value (exclusive), so we need to add one to get a range of 1 to 6.
        random random.nextInt(6)+1;
    }
}
