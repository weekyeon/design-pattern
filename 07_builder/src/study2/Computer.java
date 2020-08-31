package study2;

public class Computer {
    // 생성해야 하는 객체
    private String cpu;
    private String ram;
    private String storage;

    /**
     *
     * @param cpu 컴퓨터 CPU 정보
     * @param ram 컴퓨터 RAM 정보
     * @param storage 컴퓨터 저장소 정보
     */
    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
