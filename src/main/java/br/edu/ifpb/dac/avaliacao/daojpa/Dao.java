package br.edu.ifpb.dac.avaliacao.daojpa;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public interface Dao <T>{
    public boolean salvar(T obj);
    public boolean atualizar(T obj);
    public boolean excluir(T obj);
    public T buscar(Object chave, Class<T> clazz);
    public boolean recarregar(T obj);
}
