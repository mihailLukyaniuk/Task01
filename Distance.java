/**
 * The Distance class converts a specified length from centimeters 
 * to meters and kilometers, respectively.
 */
public class Distance {
	final private long KOEFF_METER = 100;
	final private long KOEFF_KILOMETER =  KOEFF_METER * 10;
	
	public long convertToMeter(long distance) {
		long meter = distance/KOEFF_METER;
		return meter;
	}
		
	public long convertToKilometer(long distance) {
		long kilometer = distance/(KOEFF_KILOMETER);
		return kilometer;
	}
	
}