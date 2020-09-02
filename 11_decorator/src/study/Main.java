package study;

import study.abst.Coffee;
import study.concrete.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Coffee americano = new Americano();

        boolean done = false;
        while(!done){
            System.out.println("아메리카노 가격 : "+americano.getTotalPrice());
            System.out.println("1. 샷 추가 700원");
            System.out.println("2. 헤이즐넛 시럽 추가 300원");
            System.out.println("3. 바닐라 시럽 추가 500원");
            System.out.println("0. 종료");
            switch (sc.nextInt()){
                case 0: done = true;
                    break;
                case 1:
                    americano = new Espresso(americano);
                    break;
                case 2:
                    americano = new HazelnutsSyrup(americano);
                    break;
                case 3:
                    americano = new VanillaSyrup(americano);
                    break;
            }
        }
        System.out.println("총 음료 가격 : "+americano.getTotalPrice());
        sc.close();
    }
}
