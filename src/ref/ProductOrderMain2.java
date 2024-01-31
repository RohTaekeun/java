package ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = creatOrder("두부",2000,2);
        orders[1] = creatOrder("김치",5000,1);
        orders[2] = creatOrder("콜라",1500,2);

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제금액 =" + totalAmount);

    }

     static ProductOrder creatOrder(String name , int price, int quantity){
         ProductOrder po = new ProductOrder();
         po.productName = name;
         po.price = price;
         po.quantity = quantity;

         return po;


    }

    static void printOrder(ProductOrder[] orders){
        for (ProductOrder p : orders) {
            System.out.println("상품명 = "+p.productName + " || 상품 가격  = "+p.price + " || 수량   = "+p.quantity);

        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder productOrder : orders) {
            totalAmount += productOrder.price* productOrder.quantity;
        }

        return totalAmount;
    }
}
