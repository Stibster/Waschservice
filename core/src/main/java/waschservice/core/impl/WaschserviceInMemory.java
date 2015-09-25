package waschservice.core.impl;
import waschservice.core.*;
import java.util.*;

public class WaschserviceInMemory implements WaschserviceInterface
{
    private final Map<Integer, Nutzer> nutzer;
    private int lastId = 0;
    
    public WaschserviceInMemory()
    {
	nutzer = new HashMap<>();
    }
    
    @Override
    public Nutzer erstelleNutzer(String name)
    {
	Nutzer n = new Nutzer(name, lastId++);
	nutzer.put(n.getId(), n);
	return n;
    }
    
    @Override
    public Nutzer getNutzerById(int id)
    {
	return nutzer.containsKey(id) ? nutzer.get(id) : null;
    }
    
    @Override
    public List<Nutzer> getAllNutzer()
    {
	return new ArrayList<>(nutzer.values());
    }
    
    @Override
    public void loescheNutzer(int id)
    {
	nutzer.remove(id);
    }
}
