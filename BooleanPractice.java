/**
 * Week2Assignment
 */
public class BooleanPractice {

    public static void main(String[] args) {

        // Start Assignment Part 2

        Boolean isHotOutside = true;
        Boolean isWeekday = false;
        Boolean hasMoneyInPocket = true;

        // Start Assignement Part 3

        double costOfMilk = 2.99;
        double moneyInWallet = 6;
        int thirstLevel = 3;
        
        // Start Assignment Part 4

        Boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
        Boolean willGoSwimming = isHotOutside && !isWeekday;
        Boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
        Boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk;

        System.out.println("I should buy icecream: " + shouldBuyIcecream);
        System.out.println("I should go swimming: " + willGoSwimming);
        System.out.println("It's a good day: " + isAGoodDay);
        System.out.println("I should buy milk: " + willBuyMilk);

        
    }
}