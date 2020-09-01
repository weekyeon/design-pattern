package study.system;

class SubSystem02 {
// default 접근제한
    public SubSystem02() {
        System.out.println(getClass().getSimpleName()+" 호출");
    }
    public void process(){
        System.out.println(getClass().getSimpleName()+" 프로세스 호출");
    }
}
