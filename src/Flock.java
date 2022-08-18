import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

//    public void addFirst(Quackable quacker){
//        quackers.add(quacker);
//        quacker.quack();
//        quacker.quack();
//    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        Quackable quacker = (Quackable)iterator.next();
        quacker.quack();
        quacker.quack();
        quacker.quack();
        while (iterator.hasNext()) {
            Quackable quacker1 = (Quackable)iterator.next();
            quacker1.quack();
        }
    }
}