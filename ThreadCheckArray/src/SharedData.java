import java.util.ArrayList;

/**
 * @author Amit_Regev
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array2
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		
		this.array = array2;
		this.b = b;
	}

	/**
	 * @return
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	// hi jbgk

	/**
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}