package waschservice.core;

import java.util.*;

public class Besitzer extends Nutzer 
{
    private List<Waschmaschine> wmListe;
    private Location location;
    
    public Besitzer(String name, int id)
    {
	super(name, id);
	wmListe = new ArrayList<Waschmaschine>();
    }
    
    public void setLocation(Location besLocation)
    {
	this.location = besLocation;
    }


    public Location getLocation()
    {
	return location;
    }
    
    public void addWm(Waschmaschine wm)
    {
	wmListe.add(wm);
    }
    
    public void removeWM(int wmId)
    {
	for (int i = 0; i < wmListe.size(); i++)
	{
	    if (wmListe.get(i).getWmId() == wmId)
	    {
		wmListe.remove(i);
		return;
	    }
	}
    }
    
    public Waschmaschine getWm(int wmId)
    {
	for (int i = 0; i < wmListe.size(); i++)
	{
	    if (wmListe.get(i).getWmId() == wmId)
	    {
		return wmListe.get(i);
	    }
	}
	return null;
    }
}
