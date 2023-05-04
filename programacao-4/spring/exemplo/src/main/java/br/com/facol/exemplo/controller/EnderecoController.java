package br.com.facol.exemplo.controller;

import br.com.facol.exemplo.dto.EnderecoDTO;
import br.com.facol.exemplo.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @GetMapping("{cep}")
    public ResponseEntity<EnderecoDTO> getCep(@PathVariable String cep) {
        EnderecoDTO enderecoDTO = service.getCep(cep);
        return ResponseEntity.ok(enderecoDTO);
    }

}
