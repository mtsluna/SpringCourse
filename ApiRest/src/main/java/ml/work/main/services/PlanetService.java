package ml.work.main.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ml.work.main.dtos.PlanetDTO;
import ml.work.main.entities.Planet;
import ml.work.main.repositories.PlanetRepository;

@Service
public class PlanetService implements ObjectService<PlanetDTO> {

	private PlanetRepository planetRepository;
	
	public PlanetService(PlanetRepository planetRepository) {
		this.planetRepository = planetRepository;
	}
	
	@Override
	public List<PlanetDTO> getAll() {
		
		List<PlanetDTO> result = new ArrayList<>();
		
		for(Planet planet : planetRepository.findAll()) {
			PlanetDTO temp = new PlanetDTO();
			temp.setId(planet.getId());
			temp.setName(planet.getName());
			temp.setSize(planet.getSize());
			temp.setDensity(planet.getDensity());
			result.add(temp);
		}
		
		return result;
		
	}

	@Override
	public PlanetDTO getOne(int id) {
		
		Optional<Planet> aOptional = planetRepository.findById(id);
		
		PlanetDTO temp = new PlanetDTO();
		
		try {
			
			Planet planet = aOptional.get();
			temp.setId(planet.getId());
			temp.setSize(planet.getSize());
			temp.setName(planet.getName());
			temp.setDensity(planet.getDensity());
			
		} catch (Exception e) {

			System.out.println("No existe el id");
			
		}
		
		return temp;
		
	}

	@Override
	public PlanetDTO save(PlanetDTO t) {
		
		Planet planet = new Planet();
		
		planet.setName(t.getName());
		planet.setSize(t.getSize());
		planet.setDensity(t.getDensity());	
		
		try {
			
			planetRepository.save(planet);
			
		} catch (Exception e) {
			
			System.out.println("Bad Request");
			
		}
		
		t.setId(planet.getId());
		
		return t;
		
	}

	@Override
	public PlanetDTO update(PlanetDTO t, int id) {
		
		Optional<Planet> pOptional = planetRepository.findById(id);
		
		Planet temp = new Planet();
		
		try {
			
			temp = pOptional.get();			
			temp.setName(t.getName());
			temp.setSize(t.getSize());
			temp.setDensity(t.getDensity());
			
			planetRepository.save(temp);
			t.setId(temp.getId());
			
			
		} catch (Exception e) {
			
			System.out.println("Bad Request");
			t.setId(0);
			
		}
		
		return t;
		
	}

	@Override
	public boolean delete(int id) {
		
		try {
			
			planetRepository.deleteById(id);			
			
		} catch (Exception e) {
			
			return false;
			
		}		
		
		return true;
		
	}
	
}
