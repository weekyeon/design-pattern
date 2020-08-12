package exercise;

public class Main {

    /*
        신작 게임의 캐릭터와 무기 생성
        무기의 종류는 두 가지 : 칼, 검, 도끼
     */

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        //무기값==null==맨손 공격
        gameCharacter.attack();

        //무기 설정
        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Ax());
        gameCharacter.attack();
    }
    /*
        Weapon
            - Strategy Interface
        Ax, Knife, Sword
            - Strategy
        GameCharacter
            - Client
     */
}
