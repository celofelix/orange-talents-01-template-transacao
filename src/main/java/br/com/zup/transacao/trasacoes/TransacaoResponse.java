package br.com.zup.transacao.trasacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TransacaoResponse {

	private BigDecimal valor;
	
	@JsonFormat(pattern = "dd/MM/yyyy:HH:mm")
	@DateTimeFormat(pattern = "dd/MM/yyyy:HH:mm")
	private LocalDateTime efetivadaEm;
	private String nomeEstabelecimento;
	private String endereco;
	private String cidade;

	public TransacaoResponse(Transacao transacao) {
		this.valor = transacao.getValor();
		this.efetivadaEm = transacao.getEfetivadaEm();
		this.nomeEstabelecimento = transacao.getEstabelecimento().getNome();
		this.endereco = transacao.getEstabelecimento().getEndereco();
		this.cidade = transacao.getEstabelecimento().getCidade();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		return "TransacaoResponse [valor=" + valor + ", efetivadaEm=" + efetivadaEm + ", nomeEstabelecimento="
				+ nomeEstabelecimento + ", endereco=" + endereco + ", cidade=" + cidade + "]";
	}

}
