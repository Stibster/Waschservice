package waschservice.core;

import java.util.List;

public interface WaschserviceInterface 
{
    public Nutzer erstelleNutzer(String name);
    public Nutzer getNutzerById(int id);
    public List<Nutzer> getAllNutzer();
    public void loescheNutzer(int id);
}
