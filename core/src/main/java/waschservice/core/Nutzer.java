package waschservice.core;

public class Nutzer 
{
    protected String name;
    protected int id;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }
    
    public Nutzer(String name, int id)
    {
	this.name = name;
	this.id = id;
    }  
    
    
}
