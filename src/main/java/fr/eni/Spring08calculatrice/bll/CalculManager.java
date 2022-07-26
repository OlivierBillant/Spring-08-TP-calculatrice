package fr.eni.Spring08calculatrice.bll;

import java.util.ArrayList;

import fr.eni.Spring08calculatrice.bo.Calcul;

public interface CalculManager {
	public Integer calculate(Integer operand1, String operateur, Integer operand2);
	public ArrayList<Calcul> getCalculs();
	public void effacerCalcul(Integer id);
	public Calcul getUnCalcul(Integer id);
}
