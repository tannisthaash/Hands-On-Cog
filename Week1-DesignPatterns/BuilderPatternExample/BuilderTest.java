package BuilderPatternExample;

public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder(
                "Intel i9", 32, 1000)
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        Computer officePC = new Computer.Builder(
                "Intel i5", 16, 512)
                .setBluetooth(true)
                .build();

        System.out.println("Gaming PC:");
        gamingPC.showConfiguration();

        System.out.println("\nOffice PC:");
        officePC.showConfiguration();
    }
}