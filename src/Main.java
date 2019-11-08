import company.incorporated.zirhsan.DecoratorPattern.Accessory;
import company.incorporated.zirhsan.DecoratorPattern.Component;
import company.incorporated.zirhsan.DecoratorPattern.Suit;
import company.incorporated.zirhsan.SuitGenerator;

public class Main {

    public static void main(String[] args) {
        SuitGenerator simulation = new SuitGenerator();

        try {

            for (Suit suit : Suit.values())
            {
                Component CreatedEquipment = simulation.generateSuit(suit);
                System.out.println("\nTotal weight " + CreatedEquipment.weight());
                System.out.println("\nTotal cost: " + CreatedEquipment.cost());
                System.out.println("------------------------------------------");
                for (int i = 0; i < 3; i++) {
                    for (Accessory accs : Accessory.values()) {
                        CreatedEquipment = simulation.addAccessories(CreatedEquipment, accs);
                        System.out.println("\nTotal weight " + CreatedEquipment.weight());
                        System.out.println("\nTotal cost: " + CreatedEquipment.cost());
                        System.out.println("------------------------------------------");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
