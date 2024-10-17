package com.intissar.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intissar.demo.dto.EcrivainDTO;
import com.intissar.demo.entities.Ecrivain;
import com.intissar.demo.service.EcrivainService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EcrivainRESTController {

    @Autowired
    EcrivainService ecrivainService;

    @RequestMapping(method = RequestMethod.GET) 
    public List<EcrivainDTO> getAllEcrivains() {
        return ecrivainService.getAllEcrivains();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public EcrivainDTO getEcrivainById(@PathVariable("id") Long id) {
        return ecrivainService.getEcrivain(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public EcrivainDTO createEcrivain(@RequestBody EcrivainDTO ecrivainDto) {
    return ecrivainService.saveEcrivain(ecrivainDto); 
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public EcrivainDTO updateE(@RequestBody EcrivainDTO ecrivainDto) {
    return ecrivainService.updateEcrivain(ecrivainDto); 
    }
    
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteEcrivain(@PathVariable("id") Long id)
    {
    	ecrivainService.deleteEcrivainById(id);
    }
    
    @RequestMapping(value="/ecrivsGen/{idG}",method = RequestMethod.GET)
    public List<Ecrivain> getEcrivainsByGenId(@PathVariable("idG") Long idG) {
    	return ecrivainService.findByGenreIdG(idG);
    }
    
    @RequestMapping(value="/ecrivsByName/{nom}",method = RequestMethod.GET)
    public List<Ecrivain> findByNomEcrivainContains(@PathVariable("nom") String nom) {
    	return ecrivainService.findByNomEcrivainContains(nom);  
    }

}
