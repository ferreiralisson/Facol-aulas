package br.com.facol.exemplo.service;

import br.com.facol.exemplo.domain.Conta;
import br.com.facol.exemplo.domain.Endereco;
import br.com.facol.exemplo.dto.ContaDTO;
import br.com.facol.exemplo.dto.EnderecoDTO;
import br.com.facol.exemplo.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    private ContaRepository repository;

    @Autowired
    private EnderecoService enderecoService;
    @Override
    public ContaDTO salvarConta(ContaDTO contaDTO) {

        EnderecoDTO enderecoDTO = enderecoService.getCep(contaDTO.getCep());
        contaDTO.setEndereco(enderecoDTO);

        Conta conta = getConta(contaDTO);
        Conta contaSalva = repository.save(conta);
        return getContaDTO(contaSalva);
    }

    private Conta getConta(ContaDTO contaDTO){
        return Conta.builder()
                .id(contaDTO.getId())
                .numeroConta(contaDTO.getNumeroConta())
                .nomeCliente(contaDTO.getNomeCliente())
                .endereco(getEndereco(contaDTO.getEndereco()))
                .build();
    }

    private ContaDTO getContaDTO(Conta conta){
        return ContaDTO.builder()
                .id(conta.getId())
                .numeroConta(conta.getNumeroConta())
                .nomeCliente(conta.getNomeCliente())
                .endereco(getEndereco(conta.getEndereco()))
                .build();
    }

    private Endereco getEndereco(EnderecoDTO enderecoDTO){
        return Endereco.builder()
                .cep(enderecoDTO.getCep())
                .logradouro(enderecoDTO.getLogradouro())
                .complemento(enderecoDTO.getComplemento())
                .bairro(enderecoDTO.getBairro())
                .localidade(enderecoDTO.getLocalidade())
                .uf(enderecoDTO.getUf())
                .ibge(enderecoDTO.getIbge())
                .gia(enderecoDTO.getGia())
                .ddd(enderecoDTO.getDdd())
                .siafi(enderecoDTO.getSiafi())
                .build();
    }

    private EnderecoDTO getEndereco(Endereco endereco){
        return EnderecoDTO.builder()
                .cep(endereco.getCep())
                .logradouro(endereco.getLogradouro())
                .complemento(endereco.getComplemento())
                .bairro(endereco.getBairro())
                .localidade(endereco.getLocalidade())
                .uf(endereco.getUf())
                .ibge(endereco.getIbge())
                .gia(endereco.getGia())
                .ddd(endereco.getDdd())
                .siafi(endereco.getSiafi())
                .build();
    }
}
