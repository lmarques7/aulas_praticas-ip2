package br.ufrpe.lambdas_streams;
@FunctionalInterface
public interface Verificador <T> {
    boolean verifica (T t);
}
