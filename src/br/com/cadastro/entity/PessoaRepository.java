package br.com.cadastro.entity;

import java.util.List;

import javax.persistence.*;
import javax.persistence.EntityManager;

public class PessoaRepository {

	private EntityManager manager;

	public PessoaRepository(EntityManager manager) {
		this.manager = manager;
	}

	public void adiciona(Pessoa pessoa) {
		this.manager.persist(pessoa);
	
		System.out.println(pessoa.getNome());
	}

	public List<Pessoa> buscaTodos() {
		Query query = this.manager.createQuery("select x from pessoa x");
		return query.getResultList();
	}

}
