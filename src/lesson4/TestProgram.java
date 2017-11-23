package lesson4;

public class TestProgram {
    public static void main(String[] args) {
        Bee bee = new Bee(10, "black", new AttackImpl("5;5", "sting"));
        bee.attack();
        bee.move();

        Bee defaultBee = new Bee(13, "yellow-black");
        System.out.println(defaultBee.getSize());
        System.out.println(defaultBee.getColor());
    }
}
