package br.edu.ifpb.dac.avaliacao.daojpa;
/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class DaoFactory {        
    
    
    public static Dao createDaoJpa(){
        return new DaoJpa();
    }
}
