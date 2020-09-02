package study.abst;

abstract public class AbstAddCustom implements Coffee {

    private Coffee coffee;
    public AbstAddCustom(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getTotalPrice() {
        return coffee.getTotalPrice();
    }
}
