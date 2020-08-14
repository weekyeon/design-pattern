package study.framework;

public abstract class ItemCreator {

    //아이템 생성
    public Item create(){
        Item item;

        //템플릿 메소드와 같은 형태
        //Step1
        requestItemsInfo();
        //Step2
        item = createItem();
        //Step3
        createItemLog();

        return item;
    }

    //아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청
    abstract protected void requestItemsInfo();

    //아이템 생성 후 아이템 생성 정보 로그를 남깁니다.
    abstract protected void createItemLog();

    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();
}
