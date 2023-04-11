package br.com.facol.exemplo.repository;

import br.com.facol.exemplo.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CepRepository extends JpaRepository<Endereco, Long> {
}
