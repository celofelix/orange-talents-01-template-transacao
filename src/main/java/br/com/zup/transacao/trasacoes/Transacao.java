package br.com.zup.transacao.trasacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String idTransacao;
	private BigDecimal valor;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Estabelecimento estabelecimento;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Cartao cartao;

	private LocalDateTime efetivadaEm;

	public Transacao() {

	}

	public Transacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao,
			LocalDateTime efetivadaEm) {
		this.idTransacao = id;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
		this.efetivadaEm = efetivadaEm;
	}

	public Long getId() {
		return id;
	}

	public String getIdTransacao() {
		return idTransacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}
}
