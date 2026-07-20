package week4;

public class Main {
    
    public static void main(String[] args) {
        Dog dog = new Dog("poodle", 3, "Shih Tzu");

        System.out.println("----------- Dog -----------");
        dog.showInfo();
        dog.showBreed();
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.excrete();
        
        System.out.println();
        
        Cat cat = new Cat("jiejie", 2, "White");
        System.out.println("----------- Cat -----------");
        cat.showInfo();
        cat.showcolor();
        cat.meow();
        cat.eat();
        cat.sleep();

        System.out.println();

        // ทดสอบสร้างและใช้งาน Panda
        Panda panda = new Panda("Bao Bao", 3, "Bamboo");
        System.out.println("----------- Panda -----------");
        panda.showInfo();
        panda.showFavoriteFood();
        panda.grunt();
        panda.eat();
        panda.sleep();

        System.out.println();

        // ทดสอบสร้างและใช้งาน Dolphin
        Dolphin dolphin = new Dolphin("Falafinn", 5, 35.5);
        System.out.println("----------- Dolphin -----------");
        dolphin.showInfo();
        dolphin.showSwimmingSpeed();
        dolphin.clickSound();
        dolphin.eat();
        dolphin.sleep();
    }
}
    