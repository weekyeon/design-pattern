package study.concrete;

import study.framework.Item;
import study.framework.ItemCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator itemCreator;
        Item item;

        itemCreator = new HpCreator();
        item = itemCreator.create();
        item.use();

        itemCreator = new MpCreator();
        itemCreator.create();
        item.use();
    }
}
