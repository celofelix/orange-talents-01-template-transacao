package br.com.zup.transacao.eventos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String idCartao;
	private String email;

	@OneToMany(mappedBy = "cartao", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Transacao> transacoes = new ArrayList<>();	

	public Cartao(String idCartao, String email) {
		this.idCartao = idCartao;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getIdCartao() {
		return idCartao;
	}

	public String getEmail() {
		return email;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}
}
