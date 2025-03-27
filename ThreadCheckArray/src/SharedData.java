import java.util.ArrayList;

/**
 * Represents shared data accessed by multiple threads for subset checking.
 * Holds the input array, the target sum, and result flags.
 * 
 * @author Amit_Regev 208740092
 * @version 1.0
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;

	/**
	 * Constructs a new SharedData object with the given array and target sum.
	 * 
	 * @param array2 the list of integers to check
	 * @param b the target sum to search for in the subset
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		this.array = array2;
		this.b = b;
	}

	/**
	 * Returns the win array indicating which elements form the subset.
	 * 
	 * @return the boolean array representing the winning subset
	 */
	public boolean[] getWinArray() {
		return winArray;
	}

	/**
	 * Sets the win array indicating which elements form the subset.
	 * 
	 * @param winArray the boolean array to set as the winning subset
	 */
	public void setWinArray(boolean [] winArray) {
		this.winArray = winArray;
	}

	/**
	 * Returns the input array of integers.
	 * 
	 * @return the input array
	 */
	public ArrayList<Integer> getArray() {
		return array;
	}

	/**
	 * Returns the target sum to be searched.
	 * 
	 * @return the target sum b
	 */
	public int getB() {
		return b;
	}

	/**
	 * Returns the flag indicating whether a valid subset was found.
	 * 
	 * @return true if a subset was found, false otherwise
	 */
	public boolean getFlag() {
		return flag;
	}

	/**
	 * Sets the flag indicating whether a valid subset was found.
	 * 
	 * @param flag true if a subset was found, false otherwise
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
