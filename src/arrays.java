public class arrays {
    public static void main(String[] args){
        System.out.println("Ice Cream Shop supplies:");
        String[] iceCreamShop;
        iceCreamShop = new String[]{"Ice Cream", "Bowls", "Cake Cones", "Sugar Cones", "Spoons",
                "Ice Cream Scooper", "Hot Fudge", "Freezer", "Whipped Cream", "Chopped Peanuts"};
        for (int i = 0; i < iceCreamShop.length; i++) {
            System.out.println(iceCreamShop[i]);
        };
    }

}
