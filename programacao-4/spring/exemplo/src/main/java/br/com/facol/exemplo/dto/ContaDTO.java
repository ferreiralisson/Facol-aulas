package br.com.facol.exemplo.dto;

import br.com.facol.exemplo.domain.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaDTO {
    private Long id;
    private Long numeroConta;
    private String nomeCliente;
    private String cep;
    private EnderecoDTO endereco;
}
