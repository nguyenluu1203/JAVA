package lab.lab1;

public class Main {

    public static void main(String[] args){
        Product p = new Product(1,"Iphone 15 Promax",1000.5,10,"Item");
        Product p1 = new Product(2,"Iphone 14 Promax",900,0,"Item");

        p.changeQty(2);
        p1.changeQty(+10);
        if(p.checkStock()){
            System.out.println("Product in stock/");
        }
    }
}
