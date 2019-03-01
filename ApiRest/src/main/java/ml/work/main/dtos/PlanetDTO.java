package ml.work.main.dtos;

import java.io.Serializable;

public class PlanetDTO implements Serializable{

	private int id;
	private String name;
	private float density;
	private float size;
	
	public PlanetDTO(String name, float density, float size) {
		this.name = name;
		this.density = density;
		this.size = size;
	}
	
	public PlanetDTO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
