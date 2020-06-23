import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Run {
    String i;
    String n;
      String Run(String i,String n){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nazwa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(new EquipmentEntity.Wsad(i,n));
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return "ok";
    }
    }

