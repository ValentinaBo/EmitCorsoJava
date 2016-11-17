
public class test {

	public static void main(String[] args) {

		ActorDAO aDao = new ActorDAO();
		
		System.out.println(aDao.tutti().size());
	
		aDao.tutti().stream()
		//	.filter(m -> m.getFirstName().contains("Robert"))
			.forEach(m -> System.out.println(m.getFirstName()));
		
/*
		Actor a = new Actor();
		a.setFirstName("Robert");
		a.setLastName("De Niro");
		aDao.inserisci(a);
	
		Actor b = aDao.actorPerID(225);
		b.setLastName("Smith");
		aDao.aggiorna(b);
		
		Actor c = aDao.actorPerID(225);
		aDao.elimina(c);
*/
		
		
		
	}

}
