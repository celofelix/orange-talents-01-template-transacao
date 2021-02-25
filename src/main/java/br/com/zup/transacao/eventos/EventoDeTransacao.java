package br.com.zup.transacao.eventos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacao {

	private String id;
	private BigDecimal valor;
	private EventoEstabelecimento estabelecimento;
	private EventoCartao cartao;
	private LocalDateTime efetivadaEm;

	public EventoDeTransacao() {

	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public EventoEstabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public EventoCartao getCartao() {
		return cartao;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

	@Override
	public String toString() {
		return "EventoDeTransacao [id=" + id + ", valor=" + valor + ", estabelecimento=" + estabelecimento + ", cartao="
				+ cartao + ", efetivadaEm=" + efetivadaEm + "]";
	}

	public Transacao toModel(EventoDeTransacao transacaoEvento, CartaoRepository cartaoRepository,
			EstabelecimentoRepository estabelecimentoRepository) {		

		Transacao transacao = new Transacao(transacaoEvento.getId(), transacaoEvento.getValor(),
				estabelecimento.toModel(), cartao.toModel(), efetivadaEm);
		return transacao;
	}

}
