package exercise.library;

public abstract class AbstGameConnectHelper {

    //보안 단계
    protected abstract String doSecurity(String string);

    //인증 단계
    protected abstract boolean authentication(String id, String password);

    //권한 단계
    protected abstract int authorization(String userName);

    //접속 단계
    protected abstract String connection(String info);

    //템플릿 메소드
    public String requestConnection(String encodedInfo){

        //보안 과정 --암호화 된 String을 복호화(디코드)
        String decodedInfo = doSecurity(encodedInfo);

        //인증 과정 --반환된 것을 가지고 id, pwd 할당
        String id = "aaa";
        String password = "bbb";

        if(!authentication(id, password)){
            throw new Error("아이디와 암호가 일치하지 않습니다.");
        }

        //권한 과정 --
        String userName = "userName";
        int i = authorization(userName);

        switch (i){
            case -1:
                throw new Error("셧다운");
            case 0:
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("유료 회원");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            case 3:
                System.out.println("권한 없음");
                break;
            default:
                //기타 사항 : 확장성을 위해 생성
                break;
        }

        return connection(decodedInfo);
    }

}
