package org.catolicasc.beer.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.catolicasc.beer.dao.BeerDao;
import org.catolicasc.beer.model.Beer;

@WebService
@Stateless
public class ListarBeer {
	
	@PersistenceContext
	private EntityManager em;	
	
	public List<Beer> listBeer(){
		return em.createQuery("select a from Beer a", Beer.class).getResultList();
	}
	
}
