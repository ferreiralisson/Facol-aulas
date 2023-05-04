package br.com.facol.exemplo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "conta")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_conta")
    private Long numeroConta;

    @Column(name = "nome_cliente")
    private String nomeCliente;

//    @ManyToOne
//    @JoinColumn(name = "endereco_id")
    @Transient
    private Endereco endereco;

}
