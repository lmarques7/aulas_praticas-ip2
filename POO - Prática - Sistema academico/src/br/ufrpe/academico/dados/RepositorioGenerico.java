package br.ufrpe.academico.dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ufrpe.academico.exceptions.ElementoJaExisteException;
import br.ufrpe.academico.exceptions.ElementoNaoExisteException;

public class RepositorioGenerico<T> implements IRepositorioGenerico<T> {
    
    protected List<T> elementos;
    private String filename;
    
    @SuppressWarnings("unchecked")
    public RepositorioGenerico(String filename) {
        this.filename = filename;
        this.elementos = new ArrayList<>();
        
        Object listaElementos = RepositorioFileUtil.lerDoArquivo(this.filename); 
        if (listaElementos != null && listaElementos instanceof List<?>){
            this.elementos = (List<T>) listaElementos;
        }
    }
    
    /**
     * Método somente deve permitir a inserção de um novo elementos se o mesmo
     * não já não foi inserido anteriormente. Para isso é imprescindível a
     * correta implementação do método equals do objeto envolvido.
     * 
     * A implementação deste método deve OBRIGATORIAMENTE usar o método contains
     * da interface java.util.List para verificar se o elemento a ser adicionado
     * já existe na lista.
     * 
     * @throws ElementoJaExisteException
     *             Exceção deverá ser levantada se, ao tentar inserir um novo
     *             elemento e o mesmo já exista no repositório
     */
    @Override
    public void inserir(T novoObj) throws ElementoJaExisteException  {
        if (!this.elementos.contains(novoObj)) {
            this.elementos.add(novoObj);
        } else {
            throw new ElementoJaExisteException(novoObj);
        }
        
        RepositorioFileUtil.salvarArquivo(elementos, this.filename);
    }

    @Override
    public List<T> listar() {
        return Collections.unmodifiableList(this.elementos);
    }

    /**
     * Método deve remover um elemento previamente cadastrado no repositório.
     * 
     * A implementação deste método deve OBRIGATORIAMENTE usar o método indexOf
     * da classe java.util.List para encontrar o índice de um determinado objeto
     * do repositório e removê-lo.
     * 
     * @throws ElementoNaoExisteException
     *             Exceção deverá ser levantada se, ao tentar remover um
     *             elemento da lista, o mesmo não exista no repositório
     */
    @Override
    public void remover(T obj) throws ElementoNaoExisteException {
        if (this.elementos.contains(obj)) {
            this.elementos.remove(this.elementos.indexOf(obj));
        } else {
            throw new ElementoNaoExisteException(obj);
        }
        
        RepositorioFileUtil.salvarArquivo(elementos, this.filename);
    }

    /**
     * Método deve atualizar um elemento previamente cadastrado no repositório.
     * 
     * A implementação deste método deve OBRIGATORIAMENTE usar o método indexOf
     * da classe java.util.List para encontrar o índice de um determinado voo e
     * atualizá-lo.
     * 
     * @throws ElementoNaoExisteException
     *             Exceção deverá ser levantada se, ao tentar procurar um
     *             elemento para ser atualizado, o mesmo não exista no
     *             repositório
     */
    @Override
    public void atualizar(T newObj) throws ElementoNaoExisteException {
        if (this.elementos.contains(newObj)) {
            int indice = this.elementos.indexOf(newObj);
            this.elementos.set(indice, newObj);
        } else {
            throw new ElementoNaoExisteException(newObj);
        }
        
        RepositorioFileUtil.salvarArquivo(elementos, this.filename);
    }
    
}
