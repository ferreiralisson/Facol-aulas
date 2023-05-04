package br.com.facol.exemplo.controller;


import br.com.facol.exemplo.dto.ContaDTO;
import br.com.facol.exemplo.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService service;

    @PostMapping
    public ResponseEntity<ContaDTO> cadastroConta(@RequestBody ContaDTO contaDTO){
        ContaDTO contaSalva = service.salvarConta(contaDTO);
        return new ResponseEntity<>(contaSalva, HttpStatus.CREATED);
    }



}
