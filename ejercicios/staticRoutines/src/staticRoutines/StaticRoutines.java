package staticRoutines;

public class StaticRoutines {

	/**
	 * Calculates the maximum between two integer values
	 * @param x is one of values to calculate max from
	 * @param y is the other value to calculate max from
	 * @return the maximum between x and y.
	 */
	public static int originalMax(int x, int y) {
		return (x>=y?x:y);
	}

/**
	 * Calculates the maximum between two comparable objects
	 * @param a is one of objects to calculate max from
	 * @param b is the other object to calculate max from
	 * @return the maximum between x and y.
	 */	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends Comparable> T max(T a, T b) {
		if (a.compareTo(b)>=0) {
			return a;
		}
		else {
			return b;
		}
	}
	/**
	* Returns the largest element in an array.
	* @param list is an array of integers
	* @return The largest number in the given array
	*/
	public static Integer largest(Integer[] list) { 
		int index = 0;
		int max = Integer.MIN_VALUE;
		while (index <= list.length-1) {
			if (list[index] > max) {
				max = list[index];
				index++;
			}
		}
		return max;
	}

	/**
	* Sorts an array in increasing order.
	* @param An array of integers
	*/	
	public static void bubbleSort(int[] array) {
		for (int l = array.length-1; l>1; l--) {
			for (int i = 0; i<l; i++) {
				if (array[i]>array[i+1]) {
					int e = array[i];
					array[i] = array[i+1];
					array[i+1] = e;
				}
			}
		}
	}

}
