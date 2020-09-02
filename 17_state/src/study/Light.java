package study;

public class Light{

    // Light(Context)는 상태값을 가지고 있어야 함
    protected LightState lightState;

    // offState(ConcreteState)
    private LightState offState = new LightState() {
        @Override
        public void on() {
            System.out.println("Light ON");
            lightState = onState;
        }

        @Override
        public void off() {
            System.out.println("Nothing");
        }
    };

    // onState(ConcreteState)
    private LightState onState = new LightState() {
        @Override
        public void on() {
            System.out.println("Nothing");
        }

        @Override
        public void off() {
            System.out.println("Light OFF");
            lightState = offState;
        }
    };

    // 상태 초기값 설정
    public Light() {
        lightState = offState;
    }

    // Light action()
    public void on(){
        lightState.on();
    }

    // Light action()
    public void off(){
        lightState.off();
    }
}

// LightState(State)
interface LightState{
    void on();
    void off();
}

