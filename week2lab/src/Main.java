public class Main {
    public static void main(String[] args) {
        DiceShaker shaker = new RandomSingleDiceShaker();
        DiceShaker doubleShake = new DoubleDiceShaker();
        DiceShaker fixedShake = new FixedSingleDiceShaker();
        AbstractDiceShaker cShaker = new ConcreteSingleDiceShaker();
        AbstractDiceShaker cDoubleShake = new ConcreteDoubleDiceShaker();
        System.out.format("Shake %d%n", shaker.next());
        System.out.format("DoubleShake %d%n", doubleShake.next());

        System.out.format("ConcreteShake %d%n", cShaker.next());
        System.out.format("ConcreteDoubleShake %d%n", cDoubleShake.next());
        System.out.format("fixedShake %d%n", fixedShake.next());



        while(fixedShake.hasNext()){
            int shake = fixedShake.next();
            System.out.println(shake);
        }
    }
}