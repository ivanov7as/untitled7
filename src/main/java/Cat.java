import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    public String name;
    public boolean fullness;

    public Cat(String name, boolean fullness) {
        this.name = name;
        this.fullness = fullness;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(ThreadLocalRandom.current().nextInt(4) + 3);
        System.out.println("Кот" + name + "съел" + ThreadLocalRandom.current().nextInt(4) + 3 + "корма" );
    }
}
