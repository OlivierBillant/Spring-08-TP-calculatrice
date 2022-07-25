package fr.eni.Spring08calculatrice.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.Spring08calculatrice.bo.Calcul;

public interface CalculDao extends CrudRepository<Calcul, Integer>{

}
