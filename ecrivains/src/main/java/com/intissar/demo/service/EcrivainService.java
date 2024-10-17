package com.intissar.demo.service;

import java.util.List;

import com.intissar.demo.dto.EcrivainDTO;
import com.intissar.demo.entities.Ecrivain;
import com.intissar.demo.entities.Genre;

public interface EcrivainService {

	EcrivainDTO saveEcrivain(EcrivainDTO e);
	EcrivainDTO updateEcrivain(EcrivainDTO e);
	void deleteEcrivain(Ecrivain e);
	void deleteEcrivainById(Long id);
	EcrivainDTO getEcrivain(Long id);
	List<EcrivainDTO> getAllEcrivains();
	List<Ecrivain> findByNomEcrivain(String nom);
	List<Ecrivain> findByNomEcrivainContains(String nom);
	List<Ecrivain> findByNomPrix (String nom, Double prix);
	List<Ecrivain> findByGenre (Genre genre);
	List<Ecrivain> findByGenreIdG(Long id);
	List<Ecrivain> findByOrderByNomEcrivainAsc();
	List<Ecrivain> trierEcrivainsNomsPrix();
	
	EcrivainDTO convertEntityToDto (Ecrivain ecrivain);
	
	Ecrivain convertDtoToEntity(EcrivainDTO ecrivainDto);
	 
}
 