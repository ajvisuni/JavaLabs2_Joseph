//I have made some "ASSUMPTIONS" , hope that doesn't compromise a perfect grade and this is purely after learing. NO AI USED .:)
import java.math.BigDecimal;

public class Task4 {
    public static void main(String[] args){
        double netprice = 9.99;
        double vatrate =0.23; //23% VAT
        double grossprice = netprice * (1 + vatrate);
        System.out.println("Gross value (1 piece): " + grossprice);//this was the gross value

        int quantity = 10000;
        double totalgrossprice = grossprice * quantity;//mutiplying the value with 10000 to get the total price
        System.out.println("Total gross value of 10000 pieces : " + totalgrossprice);

        double totalnet = totalgrossprice / ( 1 + vatrate);
        System.out.println("Total value excluding VAT will be : " + totalnet);

        System.out.println("This was the results using 'Double'");

        BigDecimal netvaluebd = new BigDecimal("9.99");
        BigDecimal netvatbd = new BigDecimal("0.23");
        BigDecimal onebd = BigDecimal.ONE;
        BigDecimal quantitybd = new BigDecimal(10000);

        BigDecimal grosspricebd = netvaluebd.multiply(onebd.add(netvatbd));
        System.out.println("Gross value of 1 piece : " + grosspricebd);

        BigDecimal totalgrossbd = grosspricebd.multiply(quantitybd);
        System.out.println("Total Gross vlaue : " + totalgrossbd);

        BigDecimal totalnetbd = totalgrossbd.divide(onebd.add(netvatbd));
        System.out.println("Total value excluding VAT: "+ totalnetbd);

        System.out.println("Conclusions");
        System.out.println("Using 'double' introduces to many decimal point which is not neccesary here and rounding off could be used ");
        System.out.println("This is probably due to the properties of 'double' , it focused on the more imprecise answers, which is why we use BigDecimal");
        System.out.println("Hence using 'Double' is exactly how One shouldn't calculate TAX's");
        System.out.println("This concludes my Lab 2 tasks --Yours sincerely Advaith Joseph");


    }
}
