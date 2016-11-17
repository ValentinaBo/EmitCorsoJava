
package macchinaJPA;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAfile {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EsercizioJPA2");
		EntityManager em = emf.createEntityManager();
		
		Automobile l = em.find(Automobile.class, "AB123CD");	
		inserimento(em);
		System.out.println(l.getModello());

		
	}
		
		public static void inserimento(EntityManager em) {
			Automobile a = new Automobile();
			a.setTarga("ABC");
			a.setModello("Yaris");
			a.setMarca("Toyota");
			a.setAnnoFabbricazione(2000);
			
			em.getTransaction().begin();
			em.persist(a);
			em.getTransaction().commit();
		}
		
	}


