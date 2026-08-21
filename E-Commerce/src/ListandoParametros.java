public class ListandoParametros {
    public static void main (String[] argumentos) {
        if(argumentos.length == 0) System.out.println("0 parametros");
        for(int i = 0; i < argumentos.length; i++) {
            System.out.printf("Parametro %d = %s \n", i, argumentos[i]);
        }
    }
}

