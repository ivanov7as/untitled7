import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Ричард", 5, false);
        allCats[1] = new Cat("Барсик", 20, false);
        allCats[2] = new Cat("Васька", 20, false);


        Plate plate = new Plate(50);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Кот " + allCat.name + " покушал!");
            } else {
                System.out.println("Кот " + allCat.name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм еды добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}