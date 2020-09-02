package study.concrete;

import study.abst.Coffee;

public class Americano implements Coffee {
    @Override
    public int getTotalPrice() {
        return 3200;
    }
}
