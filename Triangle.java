/** 
 *  The Treangle class checks if the selected shape is a triangle
 */
public class Triangle {
	
		public boolean check (int a, int b, int c) {
			boolean result = true;
			if(a >= (b + c) || b >= (a + c) || c >= (a + b)) {
				result = false;
			}
			return result;
		}
}