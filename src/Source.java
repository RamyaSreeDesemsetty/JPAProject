
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Source {

public static void main(String[] args) {
   EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentpu");
   EntityManager em=emf.createEntityManager();
   em.getTransaction().begin();
   Student s2=new Student();
   s2.setStudentName("Ramya");
   s2.setStudentAge(21);

   em.persist(s2);

   em.getTransaction().commit();
   em.close();
   emf.close();
    }

}

