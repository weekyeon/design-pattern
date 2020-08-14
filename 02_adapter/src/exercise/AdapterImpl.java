package exercise;

public class AdapterImpl implements Adapter {

    @Override
    //public Double twiceOf(Float num) { return Math.twoTime(num.doubleValue()); }
    public Double twiceOf(Float num) { return Math.doubled(num.doubleValue()); }

    @Override
    public Double halfOf(Float num) {
        System.out.println("Log:::: 절반 함수 호출");
        return Math.half(num.doubleValue());
    }
}
