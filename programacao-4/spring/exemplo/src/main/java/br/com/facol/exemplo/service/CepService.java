package br.com.facol.exemplo.service;

import br.com.facol.exemplo.dto.EnderecoDTO;

public interface CepService {

    EnderecoDTO getCep(String cep);
}
