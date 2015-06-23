package waschservice.core;

import java.util.*;

public class Besitzer {
    
    private int besId;
    private String besName;
    private List<Waschmaschine> wmListe;
    private Location besLocation;
    
    public Besitzer(int id, String name)
    {
	besId = id;
	besName = name;
	wmListe = new ArrayList<Waschmaschine>();
    }

    public void setBesId(int besId) 
    {
	this.besId = besId;
    }

    public void setBesName(String besName) 
    {
	this.besName = besName;
    }
    
    public void setLocation(Location besLocation)
    {
	this.besLocation = besLocation;
    }

    public int getBesId() 
    {
	return besId;
    }

    public String getBesName() 
    {
	return besName;
    }
    
    public Location getLocation()
    {
	return besLocation;
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
}
