package co.edu.javeriana.seshat.sofiplus.DataFacade;

import co.edu.javeriana.seshat.sofiplus.Entities.*;
import co.edu.javeriana.seshat.sofiplus.Repositories.EventoEntityRepository;
import co.edu.javeriana.seshat.sofiplus.Repositories.ItemEntityRepository;
import co.edu.javeriana.seshat.sofiplus.Repositories.PersonaEntityRepository;
import co.edu.javeriana.seshat.sofiplus.Repositories.ReaEntityRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Component
public class DataLink implements DataBroker {
    @Resource
    private EventoEntityRepository eventoRepo;

    @Resource
    private ReaEntityRepository reaRepo;
    @Resource
    private PersonaEntityRepository personaRepo;

    @Resource
    private ItemEntityRepository itemRepo;

    @PersistenceContext
    private EntityManager em;

    @Override
    public ReaConsolidated requestRea(EventoEntityPK evento) {
        Optional<EventoEntity> eventoProspect = eventoRepo.findById(evento);
        if (eventoProspect.isEmpty()) {
            return null;
        }
        TypedQuery<ReaEntity> query = em.createQuery("select rea from ReaEntity rea where rea.idEvento =: id", ReaEntity.class)
                .setParameter("id", evento.getIdEvento());
        List<ReaEntity> reas = query.getResultList();
        return new ReaConsolidated(eventoProspect.get(), reas);
    }

    @Override
    public void registerRea(EventoEntity evento, ReaEntity[] detalles) {

    }

    @Override
    public HashMap<String, Object> requestMetadata(String key) {
        return null;
    }

    @Override
    public void registerMetadata(String key, HashMap<String, Object> document) {

    }

    @Override
    public void registerAgent(PersonaEntity persona) {
        this.personaRepo.save(persona);
    }

    @Override
    public PersonaEntity requestAgent(String id) {
        Optional<PersonaEntity> persona = personaRepo.findById(id);
        if(persona.isEmpty()){
            return null;
        }
        return persona.get();
    }

    @Override
    public void registerItem(ItemEntity item) {
        itemRepo.save(item);
    }
}
