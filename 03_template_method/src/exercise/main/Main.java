package exercise.main;

import exercise.library.AbstGameConnectHelper;
import exercise.library.DefaultGameConnectHelper;

public class Main {

    public static void main(String[] args) {
        
        AbstGameConnectHelper abstGameConnectHelper = new DefaultGameConnectHelper();
        abstGameConnectHelper.requestConnection("아이디 암호 등 접속 정보");

    }
    
    
}
