package spring.cours.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "plantage")
public class Plantage {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String String;
	private int nbrplante;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Parcelle parcelle;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Plante plante;

	public Plantage(int id, String String, int nbrplante, Parcelle parcelle, Plante plante) {
		super();
		this.id = id;
		this.String = String;
		this.nbrplante = nbrplante;
		this.parcelle = parcelle;
		this.plante = plante;
	}

	public Plantage() {
	
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getString() {
		return String;
	}

	public void setString(String String) {
		this.String = String;
	}

	public int getNbrplante() {
		return nbrplante;
	}

	public void setNbrplante(int nbrplante) {
		this.nbrplante = nbrplante;
	}

	public Parcelle getParcelle() {
		return parcelle;
	}

	public void setParcelle(Parcelle parcelle) {
		this.parcelle = parcelle;
	}

	public Plante getPlante() {
		return plante;
	}

	public void setPlante(Plante plante) {
		this.plante = plante;
	}

}
