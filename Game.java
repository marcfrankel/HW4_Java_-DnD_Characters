public class Game {

    public static void main(String[] args) {
        Character test = new Fighter("Marc", 4, 2, 1, 4, 3);

        System.out.println(test.toString());
        test.levelUp();
        test.setWisdom(10);
        System.out.println(test.toString());

    }
}