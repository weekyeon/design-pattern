package exercise3;

public class Computer {

    // 필수 인자값
    private String cpu;
    private String ram;
    private String storage;

    // 선택 인자값
    private boolean isBluetoothEnabled;

    // private 생성자
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // getter 메소드만 가짐
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    // static 내부 클래스
    public static class ComputerBuilder {

        private String cpu;
        private String ram;
        private String storage;

        private boolean isBluetoothEnabled;

        // 필수 인자값은 생성자로 받음
        public ComputerBuilder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        // 선택 인자값은 메소드로 받음
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            // 메소드 리턴값은 빌더 객체 자신
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
