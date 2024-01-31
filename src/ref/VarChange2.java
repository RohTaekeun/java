package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        Data dataB = dataA;

        System.out.println(dataA);
        System.out.println(dataB); //참조값만 대입 해서 비교
        System.out.println(dataA.value);
        System.out.println(dataB.value); // 인스턴스 값을 가져와 읽으므로 같은값

        dataB.value = 30;

        System.out.println(dataA.value);
        System.out.println(dataB.value); // 참조값은 같다






    }
}
