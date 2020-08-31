package deep_shallow;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cat navi = new Cat();
        navi.setName("나비");
        navi.setAge(new Age(2017));

        // 얕은 복사
        Cat maru = navi;
        maru.setName("마루");
        navi.setAge(new Age(2018));
        System.out.println("---------- 얕은 복사 ----------");
        System.out.println(navi.getName()+"는 "+navi.getAge().getYear()+"년생 (Hash code : "+navi.hashCode()+")");
        System.out.println(maru.getName()+"는 "+maru.getAge().getYear()+"년생 (Hash code : "+maru.hashCode()+")");

        // 깊은 복사
        Cat sandy = navi.catCopy();
        sandy.setName("샌디");
        navi.setAge(new Age(2019));
        System.out.println("---------- 깊은 복사 ----------");
        System.out.println(navi.getName()+"는 "+navi.getAge().getYear()+"년생 (Hash code : "+navi.hashCode()+")");
        System.out.println(sandy.getName()+"는 "+sandy.getAge().getYear()+"년생 (Hash code : "+sandy.hashCode()+")");

        // 깊은 복사 시 주의할 점
        Cat rami = navi.catCopy();
        rami.setName("라미");
        rami.getAge().setYear(2020);
        System.out.println("----- 깊은 복사 시 주의할 점 -----");
        System.out.println(navi.getName()+"는 "+navi.getAge().getYear()+"년생");
        System.out.println(rami.getName()+"는 "+rami.getAge().getYear()+"년생");

        System.out.println("-----------------------------------");
        System.out.println("navi.hashCode() : "+navi.hashCode());
        System.out.println("rami.hashCode() : "+rami.hashCode());
        System.out.println("navi.getAge().hashCode() : "+navi.getAge().hashCode());
        System.out.println("rami.getAge().hashCode() : "+rami.getAge().hashCode());

    }
}
