package exercise;

public class GameCharacter {

    //접근점
    private Weapon weapon;

    //weapon을 왜 만들까
    //weapon의 기능을 사용해야 하기 때문!

    //교환 가능
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if(weapon == null){
            System.out.println("맨손 공격");
        }else{
            //delegate
            //어떤 무기를 들고 있는지에 따라 공격 형태가 변경된다.
            //attack()은 어떤 무기를 들고 있는지 모른다.
            //어떤 무기를 들고 있는지는 weapon이 할 것!
            weapon.attack();
        }
    }

}
