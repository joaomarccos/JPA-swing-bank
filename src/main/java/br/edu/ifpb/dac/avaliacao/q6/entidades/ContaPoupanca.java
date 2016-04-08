package br.edu.ifpb.dac.avaliacao.q6.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
@Entity
@DiscriminatorValue("POUPANCA")
public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
    }

    public ContaPoupanca(String senha) {
        super(senha);
    }

    @Override
    public boolean creditar(double valor) {
        if (valor > 0) {
            this.saldo += valor+0.56;
            return true;
        }
        
        return false;
    }
    
    @Override
    public boolean debitar(double valor) {
        if ((valor > 0) && (valor <= this.saldo)) {
            this.saldo-=valor;
            return true;
        }
        
        return false;
    }

}
