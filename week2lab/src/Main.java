public class Main {
    public static void main(String[] args) {
        DiceShaker shaker = new RandomSingleDiceShaker();
        DiceShaker doubleShake = new DoubleDiceShaker();
        System.out.format("Shake %d%n", shaker.next());
        System.out.format("Shake %d%n", doubleShake.next());
    }
}