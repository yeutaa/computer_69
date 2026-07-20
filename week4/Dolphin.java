package week4;

public class Dolphin extends Animal {
    private double swimmingSpeed; // ความเร็วในการว่ายน้ำ (km/h)

    public Dolphin(String name, int age, double swimmingSpeed) {
        super(name, age);
        this.swimmingSpeed = swimmingSpeed;
    }

    // เสียงร้องหรือพฤติกรรมเฉพาะของโลมา
    public void clickSound() {
        System.out.println(name + " says: คลื้กๆ ติ๊ดๆ! (Echolocation sound)");
    }

    public void showSwimmingSpeed() {
        System.out.println("Swimming speed: " + swimmingSpeed + " km/h");
    }
}