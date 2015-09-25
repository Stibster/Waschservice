package waschservice.core;

import java.util.Calendar;

public class Waschmaschine
{
    private int wmId;
    private Besitzer wmBesitzer;
    private boolean wmHatTrockner;
    private double wmPreis;
    private Slots wmSlots;
    
    public Waschmaschine(int id, Besitzer besitzer, boolean trockner)
    {
	wmId = id;
	wmBesitzer = besitzer;
	wmHatTrockner = trockner;
	wmSlots = new Slots();
    }

    public void setWmId(int wmId) 
    {
	this.wmId = wmId;
    }

    public void setWmBesitzer(Besitzer wmBesitzer) 
    {
	this.wmBesitzer = wmBesitzer;
    }
    
    public void setTrockner(boolean hatTrockner)
    {
	wmHatTrockner = hatTrockner;
    }
    
    public void setWmPreis(double wmPreis)
    {
	this.wmPreis = wmPreis;
    }

    public int getWmId() 
    {
	return wmId;
    }

    public Besitzer getWmBesitzer() 
    {
	return wmBesitzer;
    }
    
    public boolean hasTrockner()
    {
	return wmHatTrockner;
    }
    
    public double getWmPreis()
    {
	return wmPreis;
    }
    
    public void addSlots(Calendar startsAt, int durationMinutes, int count)
    {
	wmSlots.add(startsAt, durationMinutes, count);
    }
    public void addSlots(int year, int month, int day, int hour, int minute, int durationMinutes, int count)
    {
	Calendar startsAt = Calendar.getInstance();
	startsAt.set(year, month, day, hour, minute);
	wmSlots.add(startsAt, durationMinutes, count);
    }
}
