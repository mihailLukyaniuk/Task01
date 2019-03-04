/** 
 * The class Candy shows the cost of each type of candy per kilogram,
 * and how many times one view is more expensive than the second
 */
public class Candy {

	final public int GELLEY = 500, GELLEY_WEIGHT = 4;
	final public int CHOCOLATE = 100, CHOCOLATE_WEIGHT = 2;
	final public String NAMECH = "Chocolate candies";
	final public String NAMEGE = "Gelatinous candies";

	public void priceCompare() {
		
		int gelleyPricePerKilo = GELLEY / GELLEY_WEIGHT;
		int chocolatePricePerKilo = CHOCOLATE / CHOCOLATE_WEIGHT;
		double differ = (double) chocolatePricePerKilo / gelleyPricePerKilo;
		String compare;
			
		if (differ > 1) {
			compare = "expensive";
		} else {
			compare = "cheaper";
			differ = 1 / differ;
		}
		System.out.printf("\n\n6) " + NAMEGE + " costs " + gelleyPricePerKilo 
						          + " $ per kilo" + "\n" + NAMECH +" costs " 
						          + chocolatePricePerKilo + " $ per kilo" 
						          + "\n" + NAMECH + " " + compare + " than " 
						          + NAMEGE + " in " + differ + " times");
	}

}
