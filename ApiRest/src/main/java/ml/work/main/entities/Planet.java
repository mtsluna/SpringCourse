package ml.work.main.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apirest_planet")
public class Planet {

	@Id
	@Column(name = "planet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "planet_name", unique = true)
	private String name;
	
	@Column(name = "planet_density")
	private float density;
	
	@Column(name = "planet_size")
	private float size;	
		
	public Planet(String name, float density, float size) {
		this.name = name;
		this.density = density;
		this.size = size;
	}
	
	public Planet() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDensity() {
		return density;
	}
	public void setDensity(float density) {
		this.density = density;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
