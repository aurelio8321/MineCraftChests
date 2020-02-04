package mineCraftChests;
public class Food extends Item
{
	/*
	 * Member variables
	 */

	// each food item take give/take away hearts
	private float heartDelta;
	
	// food could be cooked, or not 
	private boolean cooked;

	/* 
	 * Constructor
	 */
	public Food(String itemName, boolean itemCooked) 
	{
		super(itemName); // send required iteName to Item (super class)

		if(itemName.equals("Chicken") && (itemCooked == true)) { setHeartDelta(2.5f); }
		if(itemName.equals("Chicken") && (itemCooked == false)) { setHeartDelta(1f); }
		if(itemName.equals("Beef") && (itemCooked == true)) { setHeartDelta(3.5f); }
		if(itemName.equals("Beef") && (itemCooked == false)) { setHeartDelta(1.5f); }

		//else if(itemName.equals("Beef") ) { setHeartDelta(1f); }
		
		this.cooked = itemCooked;
	}
	
	/*
	 * Member functions
	 */
	
	protected float getHeartDelta() { return heartDelta; }
	protected void setHeartDelta(float heartDelta) { this.heartDelta = heartDelta; }

	protected boolean isCooked() { return cooked; }
	protected void setCooked(boolean cooked) { this.cooked = cooked; }

	@Override
	public String toString() 
	{
		return "FOOD: name->" + this.getName() + " stackMax->" + this.getStackMax() + "  heartDelta->" + this.getHeartDelta();
	}
	
	
}
