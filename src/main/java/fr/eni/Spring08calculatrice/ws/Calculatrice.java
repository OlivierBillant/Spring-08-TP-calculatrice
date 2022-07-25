package fr.eni.Spring08calculatrice.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculatrice {

	
	@GetMapping("/calculate/{operand1}/{operateur}/{operand2}")
	public Integer calculate(
			@PathVariable("operand1")Integer operand1, 
			@PathVariable("operateur") String operateur, 
			@PathVariable("operand2") Integer operand2) {
		Integer result = 0;
		switch (operateur) {
		case "plus": result = operand1 + operand2;break;
		case "minus": result = operand1 - operand2;break;
		case "times": result = operand1 * operand2;break;
		case "by": result = operand1 / operand2;break;
		default: break;
		}
		return result;
		
	}
}
