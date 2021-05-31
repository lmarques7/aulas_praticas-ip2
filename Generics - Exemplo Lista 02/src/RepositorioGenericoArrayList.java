import java.util.List;

public class RepositorioGenericoArrayList<T extends EntidadeIdentificavel> {

    private List<T> listaObjetos;
    
    public void addObjeto(T obj) {
        boolean contem = false;
        for (T tipoGenerico : listaObjetos) {
            if (tipoGenerico.getId() == obj.getId()) {
                contem = true;
            }
        }
        if (!contem) {
            this.listaObjetos.add(obj);    
        }
    }
    
    public void removeObjeto(T obj) {
        this.listaObjetos.remove(obj);
    }
    
}
