package BuilderPatternExample;

public class Computer {

    private String CPU;
    private int RAM;
    private int Storage;
    private boolean GraphicsCard;
    private boolean Bluetooth;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GraphicsCard = builder.GraphicsCard;
        this.Bluetooth = builder.Bluetooth;
    }

    public void showConfiguration() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + Storage + " GB");
        System.out.println("Graphics Card: " + GraphicsCard);
        System.out.println("Bluetooth: " + Bluetooth);
    }

    public static class Builder {

        private String CPU;
        private int RAM;
        private int Storage;
        private boolean GraphicsCard;
        private boolean Bluetooth;

        public Builder(String CPU, int RAM, int Storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.Storage = Storage;
        }
        public Builder setGraphicsCard(boolean GraphicsCard) {
            this.GraphicsCard = GraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean Bluetooth) {
            this.Bluetooth = Bluetooth;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}