package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder po1;
        po1 = new ProductOrder();

        po1.productName = "두부";
        po1.price = 1000;
        po1.quantity = 2;

        ProductOrder po2;
        po2 = new ProductOrder();
        po2.productName = "김치";
        po2.price = 5000;
        po2.quantity = 1;

        ProductOrder po3;
        po3 = new ProductOrder();
        po3.productName = "콜라";
        po3.price = 1500;
        po3.quantity = 2;

        int totalPrice = 0;
        ProductOrder poArray[] = {po1, po2, po3};
        for (ProductOrder p : poArray) {
            System.out.println("상품명 :"+p.productName + "  가격 :" + p.price + "  수량  : "+p.quantity);

            totalPrice += p.price*p.quantity;

        }
        System.out.println("총 합계는  "+totalPrice + " 원 입니다");

    }
}
