package br.ufrpe.filmes.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RepositorioFileUtil {
    
    public static Object lerDoArquivo(String filename) {
        Object instanciaLocal = null;

        File in = new File(filename);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(in);
            ois = new ObjectInputStream(fis);
            
            // Se alguma exce��o ocorrer, um objeto NULL ser� retornado
            instanciaLocal = ois.readObject();
        } catch (Exception e) {
            System.out.println("N�o h� arquivo com o nome '" + filename + "' para ser processado. Um novo arquivo ser� criado");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                }
            }
        }

        return instanciaLocal;
    }

    public static void salvarArquivo(Object instance, String filename) {
        if (instance == null) {
            return;
        }
        File out = new File(filename);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(out);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
