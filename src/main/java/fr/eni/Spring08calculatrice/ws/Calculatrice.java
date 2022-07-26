package fr.eni.Spring08calculatrice.ws;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.Spring08calculatrice.bll.CalculManager;
import fr.eni.Spring08calculatrice.bo.Calcul;

@RestController
@RequestMapping("/calcul")
public class Calculatrice {

	@Autowired
	private CalculManager calculManager;
	
	@GetMapping("/calculate/{operand1}/{operateur}/{operand2}")
	public Integer calculate(
			@PathVariable("operand1") Integer operand1, @PathVariable("operateur") String operateur,
			@PathVariable("operand2") Integer operand2) {

		return calculManager.calculate(operand1, operateur, operand2);
	}

	@GetMapping("")
	public ArrayList<Calcul> afficher() {
		return calculManager.getCalculs();
	}
	
	@GetMapping("/{id}")
	public Calcul afficherUnCalcul(@PathVariable("id") Integer id) {
		return calculManager.getUnCalcul(id);
	}
	
	@DeleteMapping("/{id}")
	public void effacer(@PathVariable("id")Integer id) {
		calculManager.effacerCalcul(id);
	}
	
	@PostMapping("")
	public void addCalcul(@RequestBody Calcul calcul) {
		calculManager.addCalcul(calcul);
	}
	
	@PutMapping("")
	public void editCalcul(@RequestBody Calcul calcul) {
		calculManager.editCalcul(calcul);
	}
}
