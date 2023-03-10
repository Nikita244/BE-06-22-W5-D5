package it.giuliafranzosiw2d5.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.giuliafranzosiw2d5.entities.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Long> {
	
	Edificio findById(int id);
}
