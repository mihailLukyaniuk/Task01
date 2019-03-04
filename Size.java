/** 
 *  Size class shows file size in different units
 */
public class Size {
	final private long KOEFF_BYTE = 1024;
	final private long KOEFF_MEGA_BYTE =  KOEFF_BYTE * KOEFF_BYTE;
	final private long KOEFF_GIGA_BYTE = KOEFF_MEGA_BYTE * KOEFF_BYTE;
	final private long KOEFF_TERA_BYTE = KOEFF_GIGA_BYTE * KOEFF_BYTE;
	
	public long convertToKiloByte(long size) {
		long kilo_byte_size = size/KOEFF_BYTE;
		return kilo_byte_size;
	}
		
	public long convertToMegaByte(long size) {
		long mega_byte_size = size/(KOEFF_MEGA_BYTE);
		return mega_byte_size;
	}
	
	public long convertToGigaByte(long size) {
		long giga_byte_size = size/(KOEFF_GIGA_BYTE);
		return giga_byte_size;
	}
	
	public long convertToTeraByte(long size) {
		long tera_byte_size = size/(KOEFF_TERA_BYTE);
		return tera_byte_size;
	}
}
