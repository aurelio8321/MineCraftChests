package mineCraftChests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Chest
{
	// a Chest (or ArrayList) that is about to hold items
	private ArrayList <Item> chest;
	
	// this is a parallel array to store the CurrentSize to compare to the maxStack
	// currentSize[i] < chest[i].maxStack -> A MUST!!!!
	private int [] currentSize; // remember, can't use "int"
	
	public Chest() 
	{
		// fully instantiate the chest and set size to 32 or the 32 spots to fill
		chest = new ArrayList <Item> (32);
		currentSize = new int[32];
	}
	
	private int getSize() { return chest.size(); }
	
	// should be private since used internally by this class
	private boolean isFull() {
	    
	    if(getSize() < 32) {
		return false;
	    }
	    
	    //iterate through entire chest
	    for(int i = 0; i < 32; i++) {
		// if empty spot found return false
		if(currentSize[i] == 0) {
		    return false;
		}
	    }
	    
	    // No empty spot was found return true
	    return true;
	}  
	
	public void addToChest(Item e)
	{
	    	System.out.println("current chest size: " + chest.size() );
	    
	    	int[] locations = allMatchingItemLocations(e);
	    	
		// see if already in chest
	    	boolean alreadyInChest = false;
	    	
	    	
	    	
	    	for(int i = 0; i < getSize(); i++) {
	    	    if(locations[i] != 0) {
	    		//is already in chest
	    		alreadyInChest = true;
	    		System.out.println("already in chest!");
	    		break;
	    	    }
	    	}
	    	
	    	
	    	if(alreadyInChest) {
	    	    //check if any of the stacks have space left
	    	    boolean createNewStack = true;
	    	    
	    	    for(int i = 0; i < getSize(); i++) {
	    		if(locations[i] != 0 && currentSize[i] < chest.get(i).getStackMax()) {
	    		    currentSize[i]++;
	    		    createNewStack = false;
	    		    System.out.println("no need to create a new stack");
	    		    break;
	    		}
	    	    }
	    	    
	    	    if(createNewStack) {
	    		// no more room in chest
		    	    if(isFull()) {
		    		System.out.println("The chest is full.");
		    	    }
		    	    else {
		    		//add item to next available spot
		    		int next = nextAvailable();
		    		
		    		chest.remove(next);
		    		chest.add(next, e);
		    		
		    	    }
		    	    
	    	    }
	    	    
	    	}
	    	else {
	    	    if(isFull()) {
	    		System.out.println("The chest is full.");
	    	    }
	    	    else {
	    		//add item to next available spot
	    		int next = nextAvailable();
	    		
	    		//chest.remove(next);
	    		chest.add(next, e);
	    		
	    	    }
	    	}
	    	
	  
	    	    
	    	// if already in chest, if full, look for another, else, create a new stack IF there is room
	    
	    
	    	// if not in chest, create a new stack IF there is room
	    	    
	    	
		
		
		
		
	}
	
	public int nextAvailable() 
	{
	    
	    
	    
	    	// use ArrayList find the next empty spot 
	    	
	    	// iterate through chest
	    	for(int i = 0; i < 32; i++) {
	    	    // If current spot is empty return its index as next available spot
	    	    if(currentSize[i] == 0) {
	    		return i;
	    	    }
	    	}
	    	
	    	
		return -1;
	}
	
	public int find(Item element) 
	{
		// use ArrayList find methods to determine if the Items match
		return chest.indexOf(element.getName());
	}

	
	public int[] allMatchingItemLocations(Item e)
	{
	    //create a list to store the index location of matching items
	    int[] locations = new int[32];
	    
	    //set them all to 0
	    for(int i = 0; i < 32; i++) {
		locations[i] = 0;
	    }
	    
	    // iterate through the chest
	    for(int i = 0; i < getSize(); i++) {
		//if a match to item e is found then add it to the list of locations
		if(chest.get(i).equals(e)) {
		    locations[i] = i;
		}
		
	    }
		
	    return locations;
	}

	@Override
	public String toString() 
	{
		Iterator <Item> it = chest.iterator();  
		String itemsInChest = "Items in THIS chest\n";
		int count = 1;
		while (it.hasNext())
		{
			Item anItem = it.next(); // gathering and placing into a temp Employee
			itemsInChest += "[" + count + "] " + anItem.getName() + " (" + currentSize[count - 1] + "/" + anItem.getStackMax() + ") \n";
			count++;
		}
		
		return itemsInChest;
	}
	
	
}