package oop1;

import java.util.Scanner;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();
        Scanner sc = new Scanner(System.in);

        int v =0;






        //music on!
        if(data.mainCon==0) {
            data.on();

            if(data.volume==0) {
                System.out.println(" 볼륨값을 입력해주세요");
                v = sc.nextInt();
                sc.nextLine();
                for(int i=0; i <v;i++){
                    data.add();
                }

            }

            data.mainCon+=1;

        }
         if(data.mainCon==1){
            data.off();
            //System.out.println("음악 플레이어 전원을 끕니다!!");

            data.mainCon-=1;
        }


        //음악 플레이어 종료


        //볼륨 업



        //볼륨 소리 다운
       data.minus();
       data.minus();

        //음악 플레이어 상태확인





    }
      /*  static void on(MusicPlayerData data){
            data.isOn = true;
            System.out.println("음악 플레이어를 시작합니다");
        }
*//*
        static void off(MusicPlayerData data){
            data.isOn=false;
            System.out.println("음악 플레이어를 종료합니다");
        }


        static void volumeDown(MusicPlayerData data){
            data.volume--;
            System.out.println("소리를 내립니다"+data.volume);
        }

        static void statusMusic(MusicPlayerData data){
            System.out.println(data.volume);
            System.out.println("음악 플레이어 상태확인");
        }


*/
}
