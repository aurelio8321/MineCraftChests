package mineCraftChests;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver 
{
	public static void main(String args[])
	{
		Item Chicken = new Food("Chicken", true);
		System.out.println(Chicken);
		Item Beef = new Food("Beef", true);
		System.out.println(Beef);
		
		Item Sword = new Weapon("Sword", 1000);
		System.out.println(Sword);
		Item Axe = new Weapon("Axe", 800);
		System.out.println(Axe);
		
		Chest chest = new Chest();
		chest.addToChest(Chicken);
		chest.addToChest(Beef);
		chest.addToChest(Sword);
		chest.addToChest(Axe);		
		
		System.out.println(chest);
		
		System.out.println(chest);
		
	}
}