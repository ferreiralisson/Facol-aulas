package br.com.facol.exemplo.service;


import br.com.facol.exemplo.domain.Endereco;
import br.com.facol.exemplo.dto.EnderecoDTO;
import br.com.facol.exemplo.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public EnderecoDTO getCep(String cep){
        String url = "http://viacep.com.br/ws/"+ cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        EnderecoDTO response = restTemplate.getForObject(url, EnderecoDTO.class);
        if(response != null){
            salvarHistorioCep(response);
        }
        return response;
    }

    private void salvarHistorioCep(EnderecoDTO enderecoDTO){
        Endereco endereco = Endereco.builder()
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

        repository.save(endereco);
    }
}
