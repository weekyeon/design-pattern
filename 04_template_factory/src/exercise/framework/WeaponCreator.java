package exercise.framework;

public abstract class WeaponCreator {

    public Weapon factoryMethod(){
        Weapon weapon;

        requestWeaponList();
        equipWeapon();
        weapon = attack();

        return weapon;
    }

    //소유한 무기 리스트를 가져옴
    abstract protected void requestWeaponList();

    //무기 장착
    abstract protected void equipWeapon();

    //공격
    abstract protected Weapon attack();

}
