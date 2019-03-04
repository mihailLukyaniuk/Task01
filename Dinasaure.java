/** 
 *  Dinasaure class shows dinosaur weight in different units
 */
public class Dinasaure {
	public int weight_gram;
	public String text = ("The weight of dinasaure in ");

	public void change() {
		int weight_kilo = weight_gram / 1000;
		int weight_centner = weight_kilo / 100;
		int weight_tonna = weight_centner / 10;
		System.out.printf("\n" + "2) " + text + "gramm is: " + weight_gram+"\n"
						          + text + "kilogram is: " + weight_kilo + "\n" 
						          + text + "centn is: " + weight_centner + "\n" 
						          + text + "tonna is: " + weight_tonna + "\n");

	}
	

}
