package store;

public class Factory_Store {
	 String Stock="Stock Avialable Yet";
     String Stock_Info="After 10 Day, Please Order more Inventory";

    public Factory_Store(String Stock, String Stock_Info) {
        this.Stock = Stock;
        this.Stock_Info = Stock_Info;
    }

    public Factory_Store() {
    }

   
    public void Display() {
   
        System.out.println("Stock = "+Stock);
        System.out.println("Stock Info = "+Stock_Info);
        
    }
}
