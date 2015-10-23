package br.univel.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.univel.model.Produto;

@Stateless
public class ProdutoBean {
	
	@PersistenceContext
	EntityManager em;
	 
	 public List<Produto> findAllProduto() {
		 TypedQuery<Produto> findAllQuery = em.createQuery("SELECT DISTINCT p FROM Produto p ORDER BY p.id", Produto.class);
		 return findAllQuery.getResultList();
	 }
	 
	 public void cadastrar(){
		 Produto p = new Produto();
		 p.setNomeExibicao("ProdutoTeste");
	 }
}