package study;

public class SystemSpeaker {

    // 하나만 있어야 하기 때문에 static 접근제한자
    static private SystemSpeaker instance;

    // 만약 볼륨값이 있다면
    private int volume;

    // 다른 곳에서 생성할 수 없어야 하므로 private
    private SystemSpeaker(){
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if(instance == null){
            // 인스턴스 초기화
            // 실제로는 시스템 스피커와 통신할 수 있는 작업이 들어갈 것
            instance = new SystemSpeaker();
            System.out.println("객체 생성 완료");
        }else{
            System.out.println("객체가 이미 생성됨");
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
