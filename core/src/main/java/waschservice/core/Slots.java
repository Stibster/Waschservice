package waschservice.core;

import java.util.*;

class Slot 
{
    private final int slotId;
    private final Calendar startsAt;
    private final int durationMinutes;
    
    public Slot(Calendar startsAt, int duration, int slotId)
    {
	this.startsAt = startsAt;
	this.durationMinutes = duration;
	this.slotId = slotId;
    }
    
    public Calendar getEndDate()
    {
	Calendar endDate = startsAt;
	endDate.add(Calendar.MINUTE, durationMinutes);
	return endDate;
    }
    
    public int getId()
    {
	return slotId;
    }
    
    public Calendar getStart()
    {
	return startsAt;
    }
    
    public int getDuration()
    {
	return durationMinutes;
    }
}


public class Slots
{
    private ArrayList<Slot> slotArray;
    
    private int getRandomId()
    {
	boolean duplicateId = false;
	int randomId;
	do
	{
	    randomId = (int)(Math.random()*Integer.MAX_VALUE);
	    for (int i = 0; i < slotArray.size(); i++)
	    {
		if (slotArray.get(i).getId() == randomId) 
		    duplicateId = true;
	    } 
	} while (duplicateId == true);
	return randomId;
    }
    
    public void add(Calendar startsAt, int durationMinutes, int count)
    {
	for (int i = 0; i < count; i++)
	{
	    Slot newSlot = new Slot(startsAt, durationMinutes, getRandomId());
	    slotArray.add(newSlot);
	    startsAt.add(Calendar.MINUTE, durationMinutes);
	}
    }
}