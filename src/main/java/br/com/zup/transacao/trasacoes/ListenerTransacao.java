package br.com.zup.transacao.trasacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerTransacao {

	@Autowired
	private CartaoRepository cartaoRepository;

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	@Autowired
	private TransacaoRepository transacaoRepository;

	@KafkaListener(topics = "transacoes")
	public void ouvir(EventoDeTransacao eventoDeTransacao) {
		
		Transacao transacao = eventoDeTransacao.toModel(eventoDeTransacao, cartaoRepository, estabelecimentoRepository);
		transacaoRepository.save(transacao);
	}
}
