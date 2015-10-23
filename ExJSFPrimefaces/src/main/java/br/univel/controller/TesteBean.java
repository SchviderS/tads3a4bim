package br.univel.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import br.univel.model.Produto;
import br.univel.service.ProdutoBean;

@ManagedBean(name="ProdutoController")
@RequestScoped
public class TesteBean {
 
    @EJB ProdutoBean produtoBean;
     
    List<Produto> produtos;
 
    @PostConstruct
    public void init() {
    produtos = produtoBean.findAllProduto();
    }
}