package br.edu.ifpb.dac.avaliacao.q6.entidades;

import br.edu.ifpb.dac.avaliacao.daojpa.Dao;
import br.edu.ifpb.dac.avaliacao.daojpa.DaoFactory;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.PreUpdate;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class ListennerConta {

    @PreUpdate
    public void log(Object conta) {
        Conta newAccount = (Conta) conta;
        Dao<Conta> dao = DaoFactory.createDaoJpa();
        Conta oldAccount = dao.buscar(newAccount.getCodigo(), Conta.class);       

        if (newAccount.getSaldo() < oldAccount.getSaldo()) {
            newAccount.addLog(String.format("%s:   -%.2f",getDate(),(oldAccount.getSaldo() - newAccount.getSaldo())));
        } else if (newAccount.getSaldo() > oldAccount.getSaldo()) {
            newAccount.addLog(String.format("%s:   +%.2f",getDate(),(newAccount.getSaldo() - oldAccount.getSaldo())));
        }
    }

    private String getDate() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = data.format(formatter);
        return dataFormatada;
    }
}
