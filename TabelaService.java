package service;

import annotations.Tabela;
import exceptions.PalavraInvalidaException;

import java.util.ArrayList;
import java.util.List;

public class TabelaService <T>{
    private List<T> lista = new ArrayList<>();

    public void adicionar(T item){
        lista.add(item);
    }
    public void validarPalavra(String palavra)
        throws PalavraInvalidaException{
        if (palavra == null || palavra.trim().isEmpty())
        {
            throw new PalavraInvalidaException("A palavra não pode estar vazia.");
        }
        if (!palavra.matches("[a-zA-ZÀ-ÿ ]+")) {
            throw new PalavraInvalidaException("Digite apenas letras.");
        }
    }

    public void mostrarTabela() {

        if (lista.isEmpty()) {
            System.out.println("Tabela vazia.");
            return;
        }

        Class<?> classe = lista.get(0).getClass();

        if (classe.isAnnotationPresent(Tabela.class)) {

            Tabela tabela = classe.getAnnotation(Tabela.class);

            System.out.println("\n--- " + tabela.nome() + " ---");
        }

        for (T item : lista) {
            System.out.println(item);
        }
    }
}