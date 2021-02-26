package br.com.zup.transacao.trasacoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {

	List<Cartao> findByIdCartao(String id);

}
