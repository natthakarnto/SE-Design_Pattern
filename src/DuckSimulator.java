public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
//        1. Adapter Pattern เพิ่ม PigeonAdapter
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redheadDuck = new RedheadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//        Quackable pigeon = new PigeonAdapter(new Pigeon());

//        2. Decorator Pattern เพิ่ม Echo และนำ 2 Decorator มารวมกัน
//        Quackable mallardDuck = new QuackCounter(new MallardDuck());
//        Quackable redheadDuck = new QuackEcho(new RedheadDuck());
//        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
//        Quackable rubberDuck = new QuackEcho(new QuackCounter(new RubberDuck()));

//        3. เพิ่ม Abstract Factory Pattern แบบที่ใช้ทั้ง Counter และ Echo Decorator
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();

//        4. เพิ่ม Composite Pattern เพิ่มจ่าฝูง Quack 3 ครั้ง
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeon);

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
//        simulate(pigeon);

        //Flock flockOfMallards = new Flock();

        //Quackable mallardOne = duckFactory.createMallardDuck();
        //Quackable mallardTwo = duckFactory.createMallardDuck();
        //Quackable mallardThree = duckFactory.createMallardDuck();
        //Quackable mallardFour = duckFactory.createMallardDuck();

        //flockOfMallards.add(mallardOne);
        //flockOfMallards.add(mallardTwo);
        //flockOfMallards.add(mallardThree);
        //flockOfMallards.add(mallardFour);

        //flockOfDucks.add(flockOfMallards);

//        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " +
                QuackCounter.getQuacks() +
                " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}