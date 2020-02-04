package mineCraftChests;
abstract class Item
{
	/*
	 * Member variables
	 */
	
	// each Item has a name
	private String name;
	
	// Items can be stacked, depends on the type of item, how many? 
	private int stackMax;

	/*
	 * Member Functions
	 */
	
	public Item(String itemName) 
	{
		this.name = itemName;
		
		if(itemName.equals("Chicken") ) { setStackMax(64); }
		else if(itemName.equals("Beef") ) { setStackMax(64); }
		else if(itemName.equals("Sword") ) { setStackMax(1); }
		else if(itemName.equals("Axe") ) { setStackMax(1); }
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



	// used to display the Item
	abstract public String toString();

	// used to update name
	protected String getName() { return name;}
	protected void setName(String name) { this.name = name;  }

	// used to update countStack
	protected int getStackMax() { return stackMax; }
	protected void setStackMax(int stackMax) { this.stackMax = stackMax; }
}

//UNDERSTANDING Item
/*
 * The food and weapon classes are subclasses of the Item class. The item class specifies the
 * name of said item and the maximum amount  that can be stored in a chest. The item class is 
 * abstract because we do NOT want to create instances of item itself. Instead we want to create
 * instances of food and instances of weapon. The food class has 2 members heart delta and cooked.
 * The heart delta member keeps track of changes in the HP of the player when the food is consumed. The
 * cooked member tracks whether the food is cooked or not. Cooked food can have a greater effect
 * on the HP of the player. The weapon class describes a weapon item with 2 members: strengthLeft
 * damageInflicted. The strengthLeft member keeps track of the condition of the weapon. Once it reaches
 * 0 the weapon can no longer be used. The damageInflicted member tracks how much damage the weapon
 * can do.
 * 
 * 
 * 
 * 
 */
 

