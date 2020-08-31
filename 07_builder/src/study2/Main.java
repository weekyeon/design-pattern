package study2;

public class Main {

    public static void main(String[] args) {

        // 예를 들어, 매개변수의 순서를 달리하거나 타입을 달리할 경우
        // 제대로 동작하지 않게 됨
        // 매개변수가 적은 경우 Doc을 잘 작성해주면 되지만
        // 매개변수가 많은 경우 Doc을 잘 작성해주어도 비효율적
//        Computer computer = new Computer("256g ssd", "i7", "8g")

        Computer computer = ComputerBuilder
//                .start()
                .startWithCpu("i7")
//                .setCpu("i7")
                .setRam("8g")
                // 디폴트값 출력
//                .setStorage("256g ssd")
                .build();

        System.out.println(computer.toString());

    }
}
