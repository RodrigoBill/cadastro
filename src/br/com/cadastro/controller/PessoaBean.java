package br.com.cadastro.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.cadastro.entity.Pessoa;

@ManagedBean
@ViewScoped
public class PessoaBean {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private Pessoa pessoa = new Pessoa();

	public void adicionaPessoa() {
		this.pessoas.add(pessoa);
		this.pessoa = new Pessoa();
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
