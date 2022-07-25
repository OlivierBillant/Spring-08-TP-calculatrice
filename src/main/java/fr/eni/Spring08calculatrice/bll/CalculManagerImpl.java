package fr.eni.Spring08calculatrice.bll;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.Spring08calculatrice.bo.Calcul;
import fr.eni.Spring08calculatrice.dal.CalculDao;

@Service
public class CalculManagerImpl implements CalculManager {

	@Autowired
	private CalculDao calculDao;
	
	@Override
	public Integer calculate(Integer operand1, String operateur, Integer operand2) {
		Integer result = 0;
		switch (operateur) {
		case "plus": result = operand1 + operand2;break;
		case "minus": result = operand1 - operand2;break;
		case "times": result = operand1 * operand2;break;
		case "by": result = operand1 / operand2;break;
		default: break;
		}
		Calcul calcul = new Calcul(operand1, operateur, operand2);
		calcul.setResultat(result);
		calculDao.save(calcul);
		return calcul.getResultat();
	}

	@Override
	public ArrayList<Calcul> getCalculs() {
		return (ArrayList<Calcul>) calculDao.findAll();
	}

}
