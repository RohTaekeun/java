package ref;

import java.util.Scanner;

public class practiceTwice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주문 개수를 입력해주세요");
        int c = scanner.nextInt();
        scanner.nextLine();

        ProductOrder orders[] = new ProductOrder[c];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1)+"번째 주문을 입력해주쇼");

            System.out.println("상품명 : ");
            String name = scanner.nextLine();

            scanner.nextLine();
            System.out.println("가격 :");
            int price = scanner.nextInt();

            System.out.println("수량 : ");
            int quantity = scanner.nextInt();

            scanner.nextLine();
            orders[i] = createOrder(name,price,quantity);
        }

        printerOrder(orders);

        int result = allCount(orders);
        System.out.println("총 합계는 "+ result);
    }

    static ProductOrder createOrder(String name,int price,int quantity){
        ProductOrder po = new ProductOrder();

        po.productName = name;
        po.price = price;
        po.quantity = quantity;

        return po;
    }

    static void printerOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명"+order.productName +"가격 : " + order.price + "수량 : "+ order.quantity);

        }

    }

    static int allCount(ProductOrder[] orders){
        int allcounter = 0;

        for (ProductOrder order : orders) {
            allcounter = order.price * order.quantity;

        }
        return allcounter;
    }
}
