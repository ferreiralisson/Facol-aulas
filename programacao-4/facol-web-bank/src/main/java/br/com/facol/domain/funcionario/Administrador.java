package br.com.facol.domain.funcionario;

import br.com.facol.domain.seguranca.Auth;

import java.math.BigDecimal;

public class Administrador extends Funcionario {

    private Auth auth;

    public Administrador(){
        this.auth = new Auth();
    }

    public Auth getAuth() {
        return auth;
    }
    @Override
    public BigDecimal getBonificacao() {
        return BigDecimal.ZERO;
    }
}
