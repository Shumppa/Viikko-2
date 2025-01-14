package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();

        Car car = new Car(brand, model, 0);
        Car newCar = null;

    boolean exit = false;
    while(!exit) {
        System.out.println("1) Näytä auton tila");
        System.out.println("2) Muokkaa auton merkkiä ja mallia");
        System.out.println("3) Kiihdytä autoa");
        System.out.println("4) Hidasta autoa");
        System.out.println("0) Lopeta ohjelma");


        if(sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch(i) {
                case 1:
                    car.status();
                    break;
                case 2:
                    System.out.print("Anna uusi auton merkki: ");
                    String newbrand = sc.nextLine();
                    System.out.print("Anna uusi auton malli: ");
                    String newmodel = sc.nextLine();

                    newCar = new Car(newbrand, newmodel, 0);
                    car = newCar;
                    break;
                case 3:
                    System.out.print("Kuinka monta km/h haluat kiihdyttää?");
                    stringInput = sc.nextLine();
                    int kasvu = Integer.parseInt(stringInput);
                    car.accelerate(kasvu);
                    break;
                case 4:
                    System.out.print("Kuinka monta km/h haluat hidastaa?");
                    stringInput = sc.nextLine();
                    int vahennys = Integer.parseInt(stringInput);
                    car.decelerate(vahennys);
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;
                }
            }

        }
        sc.close();
	    }

}
