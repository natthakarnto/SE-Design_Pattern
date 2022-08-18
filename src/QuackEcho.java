import java.sql.SQLOutput;

public class QuackEcho implements Quackable {
    Quackable duck;

    public QuackEcho(Quackable duck){
        this.duck = duck;
    }

    public void quack(){
        duck.quack();
        System.out.printf("Echo: ");
        duck.quack();
    }
}
