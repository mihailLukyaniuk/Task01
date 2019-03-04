/** 
 *  Class Converter will convert the value of Belarusian rubles into dollars
 */
public class Converter {
	
	final private double $COURSE = 2.14;
	
	public double count (double byn) {
		double dollar = byn / $COURSE;
		return dollar;
	}
}
