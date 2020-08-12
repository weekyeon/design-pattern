package study;

public class DelegateEx {

    InterfaceEx interfaceEx;

    public DelegateEx(){

        this.interfaceEx = new InterfaceExImpl();

    }

    //Delegate
    public void funcAA(){
        interfaceEx.funcA();
        interfaceEx.funcA();
    }

}
