package br.com.zup.transacao.trasacoes;

import java.util.List;

public class EventoCartao {

	private String id;
	private String email;

	public EventoCartao() {

	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public Cartao toModel(CartaoRepository cartaoRepository) {
		List<Cartao> cartao = cartaoRepository.findByIdCartao(id);
		if(cartao.isEmpty()) {
			return new Cartao(id, email);
		}
		return cartao.get(0);
	}
}
