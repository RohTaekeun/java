package oop1;

public class MusicPlayerData {
    int volume = 0;
    boolean isOn = false;

    int mainCon = 0;


    void add(){
        volume++;
        System.out.println("볼륨증가 !! 현재 소리값은 : "+ volume);
    }

    void minus(){
        volume--;
        System.out.println("볼륨감소 !! 현재 소리값은 : "+ volume);
    }
    
    void on(){
        isOn=true;
        System.out.println("음악 플레이어 전원을 켭니다!!");
    }

    void off(){
        isOn=false;
        System.out.println("음악 플레이어 전원을 끕니다!!");
    }


}

