package exercise3;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("i7", "16GB", "256GB SSD")
                .setBluetoothEnabled(true)
                .build();

        System.out.println(computer);
    }
}
