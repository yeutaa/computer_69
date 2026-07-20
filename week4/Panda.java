package week4;

public class Panda extends Animal {
    private String favoriteFood;

    public Panda(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    // เสียงร้องหรือพฤติกรรมเฉพาะของแพนด้า
    public void grunt() {
        System.out.println(name + " says: ฮึดๆ! (Panda noises)");
    }

    public void showFavoriteFood() {
        System.out.println("Favorite food: " + favoriteFood);
    }
}