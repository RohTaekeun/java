package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1.Data = " + data);

         data = new Data();
        System.out.println("2.Data = "+data); //선언으로 주소값 생김

        data = null;
        System.out.println("3.Data = "+data);
    }
}
