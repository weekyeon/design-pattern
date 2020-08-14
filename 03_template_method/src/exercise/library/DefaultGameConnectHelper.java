package exercise.library;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    //하위 클래스 구현

    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드 과정");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("id, pwd 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인 과정");
        //서버에서 유저 이름을 가지고 유저의 나이를 알 수 있다.
        //나이와 현재 시각을 확인하고 성인이 아니고 10시가 지났다면
        //권한이 없는 것으로 한다.
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계!");
        //접속 단계에서 필요한 정보 넘겨줌
        return info;
    }
}
