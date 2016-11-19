package lec2.java.src.classes;
///klkk

public class Bucket {
	private int capacity;
	private  int  currentAmount; 
	
	public Bucket (int capacity)
	{
		this.capacity = capacity;	
		this.currentAmount = 0; 	
	}
	
	/*{
	this.capacity = 10;
	this.currentAmount = 0;
	}
	*/
	
	public  boolean  IsEmpty()
	{
		return (this.currentAmount == 0); 	
	}

	public void Fill (double amountToFill)
	{
		// אם הקיבולת של הדלי קטנה מהכמות החדשה שאמורה להתקבל בדלי
		if (this.capacity < this.currentAmount + amountToFill)
		         this.currentAmount = this.capacity; // מלא את הדלי עד הסוף
		else 
		         this.currentAmount += amountToFill;
	}

	public  String  ToString()
	{
		return ("The capacity: " + this.capacity + "\n" +
			          "The current amount of water: " +
                                                              this.currentAmount);
	}
	
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @return the currentAmount
	 */
	public int getCurrentAmount() {
		return currentAmount;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @param currentAmount the currentAmount to set
	 */
	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}

	public void Example (Bucket bucketInto)
	{
		//int capacity1 = this.capacity;
		//int capacity2 = bucketInto.getCapacity();
		//int currentAmount1 = this.currentAmount;
		//int currentAmount2 = bucketInto.getCurrentAmount();
		bucketInto.Fill (5);
		this.Fill (3);
	}

	public void PourInto (Bucket bucketInto)
	{
		int freeSpace = bucketInto.getCapacity() - bucketInto.getCurrentAmount(); 
		if (this.currentAmount < freeSpace)
		{
			bucketInto.Fill (this.currentAmount);
			this.currentAmount = 0;
		}
		else
		{
			bucketInto.Fill (freeSpace);
			this.currentAmount = this.currentAmount - freeSpace;
		}
	}


	
}
