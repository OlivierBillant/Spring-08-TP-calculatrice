package fr.eni.Spring08calculatrice.ws;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.Spring08calculatrice.bll.CalculManager;
import fr.eni.Spring08calculatrice.bo.Calcul;

@RestController
public class Calculatrice {

	@Autowired
	private CalculManager calculManager;
	
	@GetMapping("/calculate/{operand1}/{operateur}/{operand2}")
	public Integer calculate(
			@PathVariable("operand1")Integer operand1, 
			@PathVariable("operateur") String operateur, 
			@PathVariable("operand2") Integer operand2) {
		
		return calculManager.calculate(operand1, operateur, operand2);
		
	}
	
	@GetMapping("/liste-calculs")
	public ArrayList<Calcul> afficher(){
		return calculManager.getCalculs();
	}
}
