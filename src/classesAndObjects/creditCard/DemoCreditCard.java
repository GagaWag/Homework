package classesAndObjects.creditCard;

public class DemoCreditCard {
    public static void main(String[] args) {
        CreditCard firstCredit = new CreditCard("PB1324234324", 5);
        CreditCard secondCredit = new CreditCard("PB223423442", 10);
        CreditCard thirdCredit = new CreditCard("PB3231312313", 15);
        firstCredit.addSum(5);
        secondCredit.addSum(5);
        thirdCredit.removeSum(7);
        System.out.println(firstCredit.toString());
        System.out.println(secondCredit.toString());
        System.out.println(thirdCredit.toString());
    }
}
