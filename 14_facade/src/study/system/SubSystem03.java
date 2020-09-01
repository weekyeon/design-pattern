package study.system;

class SubSystem03 {
// default 접근제한
    public SubSystem03() {
        System.out.println(getClass().getSimpleName()+" 호출");
    }
    public void process(){
        System.out.println(getClass().getSimpleName()+" 프로세스 호출");
    }
}
