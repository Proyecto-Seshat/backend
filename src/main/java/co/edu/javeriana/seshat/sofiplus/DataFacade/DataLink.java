package co.edu.javeriana.seshat.sofiplus.DataFacade;

import co.edu.javeriana.seshat.sofiplus.Entities.*;
import co.edu.javeriana.seshat.sofiplus.Repositories.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Arrays;
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

    @Resource
    private FamiempresaEntityRepository famiempresaEntityRepository;

    @Resource
    private RecursoEntityRepository recursoEntityRepository;

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
        try {
            eventoRepo.save(evento);
            reaRepo.saveAll(Arrays.asList(detalles));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        if (persona.isEmpty()) {
            return null;
        }
        return persona.get();
    }

    @Override
    public ItemEntityPK registerItem(ItemEntity item) {
        itemRepo.save(item);
        ItemEntityPK pk = new ItemEntityPK();
        pk.setNitFamiempresa(item.getNitFamiempresa());
        pk.setCodigo(item.getCodigo());
        return pk;
    }

    @Override
    public String registerFamiempresa(FamiempresaEntity famiempresa) {
        famiempresaEntityRepository.save(famiempresa);
        return famiempresa.getNit();
    }

    @Override
    public int registerRecurso(RecursoEntity recurso) {
        recursoEntityRepository.save(recurso);
        return recurso.getIdRecurso();
    }
}
