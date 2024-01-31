package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // nullpointerException

        System.out.println("data = " + data);
    }
}
