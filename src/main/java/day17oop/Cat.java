package day17oop;

public class Cat extends Animal{

    public void meow() {
        System.out.println("Cats meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override   //annotation denir buna trde notasyon. Override kurallarının java tarafından kontrol edilmesini sağlıyor.
    public void drink() {
        System.out.println("Cats drink");
    }
}
