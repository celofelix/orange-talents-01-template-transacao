package br.com.zup.transacao.eventos;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerTransacao {
	
	@KafkaListener(topics = "${spring.kafka.topic.transactions}")
	public void ouvir(EventoDeTransacao eventoDeTransacao) {
		System.out.println(eventoDeTransacao);
	}
}
