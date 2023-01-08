import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);

    // Menu price
    final double cake = 5.99;
    final double pasta = 13.99;
    final double soda = 2.50;

    System.out.println("Cake - $5.99 \nPasta - $13.99\nSoda - 2.50$");


    //Number of ordered
    int numCake, numPasta, numSoda;

    // Tax rate and tip
    double TAX_RATE = 0.13;
    double TIP_RATE;

    // Asking user for number of menu items purchased
    do {
      System.out.println("How many cakes will you order? Please enter an integer greater than or equal to 0.");
      while(!keyboard.hasNextInt()) {
        System.out.println("That is not a valid number. Please enter an integer greater than or equal to 0.");
        keyboard.next();
      } 
      numCake = keyboard.nextInt();
    } while (numCake < 0);

    do {
      System.out.println("How many pastas will you order? Please enter an integer greater than or equal to 0.");
      while(!keyboard.hasNextInt()) {
        System.out.println("That is not a valid number. Please enter an integer greater than or equal to 0.");
        keyboard.next();
      } 
      numPasta = keyboard.nextInt();
    } while (numPasta < 0);

    do {
      System.out.println("How many sodas will you order? Please enter an integer greater than or equal to 0.");
      while(!keyboard.hasNextInt()) {
        System.out.println("That is not a valid number. Please enter an integer greater than or equal to 0.");
        keyboard.next();
      } 
      numSoda = keyboard.nextInt();
    } while (numSoda < 0);

    // Calculating cost of food

    double foodPrice = (cake * numCake) + (pasta * numPasta) + (soda * numSoda);

    System.out.println("You ordered " + (numCake + numPasta + numSoda) + " food items.");

    double foodRound = Math.round(foodPrice * 100.0) / 100.0;
    System.out.println("Your total food price is $" + foodRound);

    //Calculating Tax and tip
    
    double taxPrice = foodPrice * TAX_RATE;
    // Rounding to 2 decimals

    double taxRound = Math.round(taxPrice * 100.0) / 100.0;

    System.out.println("Your tax cost is $" + taxRound);

    double foodtaxRound = Math.round((foodPrice + taxPrice) * 100.0) / 100.0;

    System.out.println("Your food and tax cost total is $" + foodtaxRound);

    do {
      System.out.println("What percent do you want to tip (i.e. enter '0.15' for 15%, 1 for 100%, etc.");
      while(!keyboard.hasNextDouble()) {
        System.out.println("That is not a valid number. Please enter a number greater than 0");
        keyboard.next();
      } 
      TIP_RATE = keyboard.nextDouble();;
    } while (TIP_RATE < 0);

    double tipPrice = foodPrice * TIP_RATE;

    //Rounding to 2 decimals
    double tipRound = Math.round(tipPrice * 100.0) / 100.0;

    System.out.println("Your tipping cost is $" + tipRound);

    // Calculating total price

    double totalPrice = foodPrice + taxPrice + tipPrice;

    // Rounding to 2 decimal places

    double totalRound = Math.round(totalPrice * 100.0) / 100.0;
    
    System.out.println("Your total is $" + totalRound + ".");
  }
}