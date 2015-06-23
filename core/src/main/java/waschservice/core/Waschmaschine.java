package waschservice.core;

public class Waschmaschine
{
    private int wmId;
    private Besitzer wmBesitzer;
    private boolean wmHatTrockner;
    private double wmPreis;
    
    public Waschmaschine(int id, Besitzer besitzer, boolean trockner)
    {
	wmId = id;
	wmBesitzer = besitzer;
	wmHatTrockner = trockner;
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
}
