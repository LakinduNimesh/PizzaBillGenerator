
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        List<Pizza> pizzaOrder = new ArrayList<>();

        System.out.println("Welcome to Buddy Pizza!!");
        boolean multiplePizza = true;

        while (multiplePizza){
            System.out.println("Choose Pizza Type: ");
            System.out.println("1. Regular Pizza");
            System.out.println("2. Delux Pizza: ");
            System.out.println(" ");

            int pizzaTypeChoice = Sc.nextInt();
            Sc.nextLine();

            System.out.println("Choose Pizza Category : ");
            System.out.println("1. Vegetarian");
            System.out.println("2. Non-Vegetarian");
            System.out.println(" ");

            int pizzaCategoryChoice = Sc.nextInt();
            Sc.nextLine();

            boolean pizzaVeg = pizzaCategoryChoice == 1;

            Pizza pizza;

            if (pizzaTypeChoice == 2){

               pizza = new DeluxPizza("Delux", pizzaVeg);
               } else {
                pizza = new Pizza("Regular", pizzaVeg);
               }

            System.out.println("Do You Want Extra Cheese? ( YES = 1, NO = 2 ) ");

            int cheeseChoice = Sc.nextInt();

            if (cheeseChoice == 1){
                pizza.addExtraCheese();
            }

            System.out.println("Do You Want Extra Toppings? ( YES = 1, NO = 2 ) ");

            int toppingChoice = Sc.nextInt();

            if (toppingChoice == 1){
                pizza.addExtraToppings();
            }

            System.out.println("Do You Need a Takeaway Bag? ( YES = 1, NO = 2 ) ");

            int takeAwayChoice = Sc.nextInt();

            if(takeAwayChoice == 1){
                pizza.addTakeAway();
            }

            pizzaOrder.add(pizza);

            System.out.println("Do You Want To Order Another Pizza? ( YES = 1, NO = 2 ) ");

            int mutiplePizzaChoice = Sc.nextInt();
            multiplePizza = mutiplePizzaChoice == 1;

        }

        generateTotalBill(pizzaOrder);

    }

    public static void generateTotalBill(List<Pizza> pizzaOrder){
        double totalPrice = 0;

        System.out.println(" ");
        System.out.println("/******* Total Bill *******/");

        for(int i = 0; i <pizzaOrder.size(); i++){
            System.out.println(" ");
            System.out.println("Pizza " + (i + 1) + ":");
            pizzaOrder.get(i).printDetails();
            totalPrice += pizzaOrder.get(i).calculatePrice();
        }

        System.out.println(" ");
        System.out.println("******************************");
        System.out.println("Total Order Price: " + totalPrice);
        System.out.println("******************************");
    }
}



























