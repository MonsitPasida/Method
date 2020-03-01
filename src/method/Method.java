package method;
import java.util.Scanner;

public class Method {
    public double netprice , vat ,disc ,total ;
   
    public static void main(String[] args) {
        int price;
        Method m = new Method();
        Scanner rd = new Scanner(System.in);
        Employee();
        System.out.println("ราคาสิ้นค้า ");
        price = rd.nextInt();
        System.out.println("Vat "+m.Vat(price, 0.07));
        System.out.println("Disc "+m.Disc(price, 10));
        
        
    }
    
    public static void Employee() {
        int age= 24;
        String name="Monsit Pasida";
        float gpa=4.00f;
        System.out.println("ชื่อ"+name+"\nอายุ"+age+"\nเกรด"+gpa);
    }
    
    public double Vat(double price, double tax){
        vat = price*tax;
        return vat;
    }
    
    public double Disc(double price, double disc){
        disc = price*(disc/100);
        return disc;
    }
    
    public double Total(double Vat, double Disc){
        
        total = Vat-Disc;
        return total;
    }
    
}
