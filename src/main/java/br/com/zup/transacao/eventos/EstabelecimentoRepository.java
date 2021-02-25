package br.com.zup.transacao.eventos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
	
	Estabelecimento findByNomeAndCidadeAndEndereco(String nome, String cidade, String endereco);

}
