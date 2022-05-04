package co.edu.javeriana.seshat.sofiplus.DataFacade;

import co.edu.javeriana.seshat.sofiplus.Entities.*;

import java.util.HashMap;

public interface DataBroker {
    public ReaConsolidated requestRea(EventoEntityPK evento);
    public void registerRea(EventoEntity evento, ReaEntity[] detalles);
    public HashMap<String, Object> requestMetadata(String key);
    public void registerMetadata(String key, HashMap<String, Object> document);
    public void registerAgent(PersonaEntity persona);
    public PersonaEntity requestAgent(String id);
    public ItemEntityPK registerItem(ItemEntity item);
    public String registerFamiempresa(FamiempresaEntity famiempresa);
    public int registerRecurso(RecursoEntity recurso);
}
