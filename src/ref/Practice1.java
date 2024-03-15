package ref;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 상품의 개수를 입력해주세요");
        int c = scanner.nextInt();
        scanner.nextLine();
        ProductOrder orders[] = new ProductOrder[c];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1)+"번째 상품을 입력 합니다!!");

            System.out.println(" 상품명 : ");
            String name = scanner.nextLine();

            System.out.println(" 가격 : ");
            int price = scanner.nextInt();

            System.out.println(" 수량 : ");
            int quantity = scanner.nextInt();

            scanner.nextLine();
            orders[i] = createOrder(name,price,quantity);

        }
        printOrder(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 합계는 "+totalAmount);


    }

    static ProductOrder createOrder(String name,int price , int quantity){
        ProductOrder po = new ProductOrder();
        po.productName = name;
        po.price = price;
        po.quantity = quantity;

        return po;


    }
    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 :" + order.productName+ " || 가격 :"+order.price+" || 수량 : "+order.quantity +" || 해당 항목의 합계 는 "+(order.price*order.quantity));

        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder po : orders) {
            totalAmount += po.price * po.quantity;
        }
        return totalAmount;
    }
}
