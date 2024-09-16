public class DeluxPizza extends Pizza {
    private double extraCheesePriceDelux = 180;
    private double extraToppingPriceDelux = 200;

    public DeluxPizza(String pizzaType, boolean pizzaVeg){
        super(pizzaType, pizzaVeg);
        addExtraCheese();
        addExtraToppings();
    }
    @Override
    public double calculatePrice(){
        double finalPrice = super.calculatePrice();

        finalPrice += (extraCheesePriceDelux - 150);
        finalPrice += (extraToppingPriceDelux - 170);

        return finalPrice;
    }
    @Override
    public void printDetails(){
        System.out.println("/***** Delux Pizza *****/");
        System.out.println(" ");
        super.printDetails();
        System.out.println("Extra Cheese For Delux (More Quantity): " + extraCheesePriceDelux);
        System.out.println("Extra Toppings For Delux (More Quantity): " + extraToppingPriceDelux);
    }
}
