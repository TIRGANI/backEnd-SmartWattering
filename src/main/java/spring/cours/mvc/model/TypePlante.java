package spring.cours.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "typePlante")
public class TypePlante {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String libelle;
	private Float humiditeMax;
	private Float humiditeMin;
	private Float temperature;
	private Float luminosite;
	private String etat;
	
	public TypePlante() {
		
	}
	
	public TypePlante(int id, String libelle, Float humiditeMax, Float humiditeMin, Float temperature,
			Float luminosite,String etat) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.humiditeMax = humiditeMax;
		this.humiditeMin = humiditeMin;
		this.temperature = temperature;
		this.luminosite = luminosite;
		this.etat=etat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Float getHumiditeMax() {
		return humiditeMax;
	}
	public void setHumiditeMax(Float humiditeMax) {
		this.humiditeMax = humiditeMax;
	}
	public Float getHumiditeMin() {
		return humiditeMin;
	}
	public void setHumiditeMin(Float humiditeMin) {
		this.humiditeMin = humiditeMin;
	}
	public Float getTemperature() {
		return temperature;
	}
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	public Float getLuminosite() {
		return luminosite;
	}
	public void setLuminosite(Float luminosite) {
		this.luminosite = luminosite;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
	
}
