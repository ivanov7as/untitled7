import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Ричард", 5, false);
        allCats[1] = new Cat("Барсик", 10, false);
        allCats[2] = new Cat("Васька", 20, false);


        Plate plate = new Plate(100);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite < plate.food) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Кот " + allCat.name + " поел");
            } else {
                System.out.println("Кот " + allCat.name + " не поел");
            }
        }
        plate.info();
        System.out.println("Сколько еды добавить еще в тарелку?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}