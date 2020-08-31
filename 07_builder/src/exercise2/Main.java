package exercise2;

public class Main {

    public static void main(String[] args) {

        /*
            1. Cpu / Ram / Storage 값 입력 받기
         */
        Computer computer1 = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .build();

        System.out.println(computer1);

        /*
            2. Cpu / Ram 값 입력 받기
         */
        Computer computer2 = ComputerBuilder
                .start()
                .setCpu("i5")
                .setRam("16GB")
                .build();

        System.out.println(computer2);

        /*
            3. 이렇게도 쓸 수 있음
         */
        Computer computer3 = ComputerBuilder
                .startWithCpu("i3")
                .setRam("8GB")
                .build();

        System.out.println(computer3);

    }
}
