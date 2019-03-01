package ml.work.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ml.work.main.entities.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Integer> {}
