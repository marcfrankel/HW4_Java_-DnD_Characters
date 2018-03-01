public class Game {

    public static void main(String[] args) {
        Character test = new Fighter("Marc", 4, 2, 1, 4, 3);
        Character dummy = new Fighter("Donald Drumpf", 1, 2, 1, 4, 3);

        System.out.println(test.toString());
        System.out.println(dummy.toString());
        test.attack(dummy);
        test.attack(dummy);

        System.out.println(dummy.getHealth());

    }
}