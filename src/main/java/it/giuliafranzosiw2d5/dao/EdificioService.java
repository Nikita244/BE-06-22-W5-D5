package it.giuliafranzosiw2d5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.giuliafranzosiw2d5.entities.Edificio;

@Service
public class EdificioService {
	
	@Autowired
	private EdificioRepository edificioRepo;
	
	public void insert(Edificio e) {
		edificioRepo.save(e);
	}


}
