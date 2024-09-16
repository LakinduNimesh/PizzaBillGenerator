public class Pizza {
    private String pizzaType;
    private boolean pizzaVeg;
    private double pizzaBasePrice;
    private double extraCheesePrice = 150;
    private double extraToppingsprice = 170;
    private double takeAwayBagPrice = 70;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(String pizzaType, boolean pizzaVeg){
        this.pizzaType = pizzaType;
        this.pizzaVeg = pizzaVeg;
        this.pizzaBasePrice = pizzaVeg ? 800 : 1000;
    }

    public void addExtraCheese(){
        this.extraCheese = true;
    }

    public void addExtraToppings(){
        this.extraToppings = true;
    }

    public void addTakeAway(){
        this.takeAway = true;
    }

    public double calculatePrice() {
        double finalPrice = pizzaBasePrice;

        if (extraCheese){
            finalPrice += extraCheesePrice;
        }

        if(extraToppings){
            finalPrice += extraToppingsprice;
        }

        if(takeAway){
            finalPrice += takeAwayBagPrice;
        }

        return finalPrice;


    }

    public void printDetails() {
        System.out.println("Pizza Type: " + (pizzaVeg ? "Vegetarian" : "Non-Vegetarian"));
        System.out.println("Base Price: " + pizzaBasePrice);

        if (extraCheese){
            System.out.println("Extra Cheese Added: " + extraCheesePrice);
        }
        if (extraToppings){
            System.out.println("Extra Toppings Added: " + extraToppingsprice);
        }
        if (takeAway){
            System.out.println("Takeaway Bag Added: " + takeAwayBagPrice);
        }
        System.out.println("Price for this pizza: " + calculatePrice());
    }

}

