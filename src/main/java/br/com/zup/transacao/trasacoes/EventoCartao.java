package br.com.zup.transacao.trasacoes;

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

	public Cartao toModel() {
		return new Cartao(id, email);
	}
}
