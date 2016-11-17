package macchinaJPA;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Automobile {

	@Id
	String targa;
	String modello;
	String marca;
	int annoFabbricazione;
	
	public String getTarga() {
		return targa;
	}
	
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnnoFabbricazione() {
		return annoFabbricazione;
	}
	
	public void setAnnoFabbricazione(int anno) {
		this.annoFabbricazione = anno;
	}
}
