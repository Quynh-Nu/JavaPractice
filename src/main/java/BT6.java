public class BT6 {
    public static void main(String[] avgs) {
        var productName = "Vaccine";
        var quatity = 2;
        var price = 150000;
        var fee = 10;
        var totalPrice = quatity*price;
        var totalFee = totalPrice*fee/100;
        System.out.println("totalPrice = " + totalPrice + "\n" + "totalFee = " + totalFee);
    }
}
