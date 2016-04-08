package br.edu.ifpb.dac.avaliacao.daojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class DaoJpa<T> implements Dao<T> {

    private EntityManager em;

    public DaoJpa() {
        this("teste");
    }

    private DaoJpa(String nomeUnidadePersitencia) {
        this.em = Persistence.createEntityManagerFactory(nomeUnidadePersitencia).createEntityManager();
    }

    @Override
    public boolean salvar(T obj) {
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            em.persist(obj);
            transacao.commit();
            return true;
        } catch (Exception e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            return false;
        }
    }

    @Override
    public boolean atualizar(T obj) {
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            em.merge(obj);
            transacao.commit();
            return true;
        } catch (Exception e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            return false;
        }
    }

    @Override
    public boolean excluir(T obj) {
        EntityTransaction transacao = em.getTransaction();
        try {
            transacao.begin();
            em.remove(obj);
            transacao.commit();
            return true;
        } catch (Exception e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            return false;
        }
    }

    @Override
    public T buscar(Object chave, Class<T> clazz) {
        return em.find(clazz, chave);
    }

    @Override
    public boolean recarregar(T obj) {        
        try {            
            em.refresh(obj);            
            return true;
        } catch (Exception e) {            
            return false;
        }
    }

}
