package br.com.zup.transacao.trasacoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
	
	List<Estabelecimento> findByNomeAndCidadeAndEndereco(String nome, String cidade, String endereco);

}
