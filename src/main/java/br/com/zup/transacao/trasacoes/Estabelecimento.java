package br.com.zup.transacao.trasacoes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estabelecimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String cidade;
	private String endereco;
	
	@OneToMany(mappedBy = "estabelecimento", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Transacao> transacoes = new ArrayList<>();
	
	public Estabelecimento() {
		
	}

	public Estabelecimento(String nome, String cidade, String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

}
