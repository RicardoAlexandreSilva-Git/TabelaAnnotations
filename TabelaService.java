package service;

import annotations.Tabela;

import java.util.ArrayList;
import java.util.List;

public class TabelaService <T>{
    private List<T> lista = new ArrayList<>();

    public void adicionar(T item){
        lista.add(item);
    }

    public void moistrarTabela(){
        if(lista.isEmpty()){
            System.out.println("Tabela vazia.");
            return;
        }
    }
    Class<?> classe=lista.get(0).getClass();
    if(classe.isAnnotationPresent(Tabela.class)){
        Tabela tabela=classe.getAnnotation(Tabela.class);
        System.out.println("\n--- "+ tabela.nome()+" ---");
    }
    for (T item : lista){
        System.out.println(item);
    }
}
