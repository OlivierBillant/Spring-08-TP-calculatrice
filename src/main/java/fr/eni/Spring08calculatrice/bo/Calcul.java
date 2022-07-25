package fr.eni.Spring08calculatrice.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Calcul {
	@Id
	@GeneratedValue
	private Integer idCalcul;
	private Integer operand1;
	private String operateur;
	private Integer operand2;
	private Integer resultat;
	
	public Calcul(Integer operand1, String operateur, Integer operand2) {
		super();
		this.operand1 = operand1;
		this.operateur = operateur;
		this.operand2 = operand2;
	}

	@Override
	public String toString() {
		return "Calcul [operand1=" + operand1 + ", operateur=" + operateur + ", operand2=" + operand2 + "]";
	}
	
	
	
	
}
