package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;
        
        //music on!

        isOn = true;
        System.out.println("음악 플레이어 시작");

        //볼륨 업
        volume++;
        System.out.println(volume);
        volume++;
        System.out.println(volume);

        //볼륨 소리 다운
        volume--;

        System.out.println(volume);
        volume--;

        System.out.println(volume);
        System.out.println("음악 플레이어 상태확인");
        
        if(isOn= false){
            System.out.println("종료");
        }

    }
}
