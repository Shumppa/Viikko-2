package main;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void status() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + "km/h");
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void accelerate(int kasvu) {
        if (kasvu > 0) {
            speed += kasvu;
        } else {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }

    public void decelerate(int vahennys) {
        if (vahennys > 0) {
            if (speed - vahennys < 0) {
                speed = 0;
            } else {
                speed -= vahennys;
            }
        } else {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
    }
}
