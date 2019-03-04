public class Task01Runner {
	public static void main(String args[]) {

		/**
		 * Point 1) Check whether the selected shape is a triangle
		 */

		Triangle Firstcheck = new Triangle();
		System.out.printf("1) Is the figure treangle? : "
						  + Firstcheck.check(2, 1, 2) + "\n");

		/**
		 * Point 2) Display the weight of the dinosaur in different units
		 */

		Dinasaure Dinasaure = new Dinasaure();
		Dinasaure.weight_gram = 2_100_000_000;
		Dinasaure.change();

		/**
		 * Point 3) Display the file size in different units
		 */
		long byte_size = 7_696_581_394_432L;
		Size Converter = new Size();
		long kiloNum = Converter.convertToKiloByte(byte_size);
		long megaNum = Converter.convertToMegaByte(byte_size);
		long gigaNum = Converter.convertToGigaByte(byte_size);
		long teraNum = Converter.convertToTeraByte(byte_size);
		System.out.printf("\n3) We have size in Bytes " + byte_size + "\n" 
						          + " in Kilobytes it is: " + kiloNum + "\n"
						          + " in Megabytes it is: " + megaNum + "\n"
						          + " in Gigabytes it is: " + gigaNum + "\n"
						          + " in Terabytes it is: " + teraNum);

		/**
		 * Point 4) We display the distance in different units
		 */
		long distance = 3255000;
		Distance Faraway = new Distance();
		System.out.printf("\n\n4) We have distance in santimeters " + distance
						          + "\nThis distance in meters: " 
						          + Faraway.convertToMeter(distance) 
						          + "\nThis distance in kilometers: " 
						          + Faraway.convertToKilometer(distance));

		/**
		 * Point 5) Swap the value of two variables
		 */
		int varA = 234, varB = 21;
		Reverse Change = new Reverse();
		Change.reverse(varA, varB);

		/**
		 * Point 6) We calculate the compatibility of candies per kilogram, 
		 * and which ones are more expensive
		 */
		Candy Sweet = new Candy();
		Sweet.priceCompare();

		/**
		 * Point 7) We calculate how many dollars we can afford for the N-th sum
		 * of Belarusian rubles
		 */
		Converter Conver = new Converter();
		System.out.printf( "\n\n7) We can have " + Conver.count(1300) + " dollars");
	}
}