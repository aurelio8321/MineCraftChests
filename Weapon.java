package mineCraftChests;

public class Weapon extends Item
{
	/*
	 * Member variables
	 */

	// each Weapon has a strength that will eventually drop to 0, destroying the Weapon
	private int strengthLeft;
	
	// How much can the Weapon inflict in damage
	private float damageInflicted;

	/* 
	 * Constructor
	 */
	public Weapon(String itemName, int itemStrengthLeft) 
	{
		super(itemName); // send required iteName to Item (super class)

		if(itemName.equals("Sword")) { setDamageInflicted(3f); }
		if(itemName.equals("Axe")) { setDamageInflicted(2.5f); }

		//else if(itemName.equals("Beef") ) { setHeartDelta(1f); }
		
		this.strengthLeft = itemStrengthLeft;
	}

	/*
	 * Member functions
	 */
	
	protected int getStrengthLeft() { return strengthLeft;  }
	protected void setStrengthLeft(int strengthLeft) { this.strengthLeft = strengthLeft; }

	protected float getDamageInflicted() { return damageInflicted; }
	protected void setDamageInflicted(float damageInflicted) { this.damageInflicted = damageInflicted; }

	@Override
	public String toString() 
	{
		return "WEAPON: name->" + this.getName() + " stackMax->" + this.getStackMax() + "  strengthLeft->" 
				+ this.getStrengthLeft() + " damageInflicted->" + this.getDamageInflicted();
	}
	

	
}
