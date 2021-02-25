package br.com.zup.transacao.eventos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {

	Cartao findById(String id);

}
