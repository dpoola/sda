public class Main {
    public static void main(String[] args) {
        DiceShaker shaker = new RandomSingleDiceShaker();
        DiceShaker doubleShake = new DoubleDiceShaker();
        DiceShaker fixedShake = new FixedSingleDiceShaker();
        System.out.format("Shake %d%n", shaker.next());
        System.out.format("Shake %d%n", doubleShake.next());
        System.out.format("Shake %d%n", fixedShake.next());

        while(fixedShake.hasNext()){
            int shake = fixedShake.next();
            System.out.println(shake);
        }
    }
}