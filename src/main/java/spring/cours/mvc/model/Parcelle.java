package spring.cours.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parcelle")
public class Parcelle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float surface;
	private String photo;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Ferme ferme;

	public Parcelle(int id, float surface, String photo,Ferme ferme) {
			super();
			this.id = id;
			this.surface = surface;
			this.photo = photo;
			this.ferme=ferme;
		}

	public Parcelle() {
			
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Ferme getFerme() {
		return ferme;
	}

	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}

	
}
