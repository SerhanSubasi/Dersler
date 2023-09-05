package day16staticoop;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.drink();
        c1.eat();
        c1.meow();

        Dog c2 = new Dog();

        c2.drink();
        c2.eat();
        c2.Bark();

        Bird c3 = new Bird();

        c3.drink();
        c3.eat();
        c3.tweet();
    }
}
