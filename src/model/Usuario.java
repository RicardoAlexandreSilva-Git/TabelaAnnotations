package model;

import annotations.Tabela;

@Tabela(nome= "Tabela_Usuarios")
public class Usuario {
    private String palavra;

    public Usuario(String palavra){
        this.palavra = palavra;
    }
    public String getPalavra(){
        return palavra;
    }

    @Override
    public String toString(){
        return "Palavra digitada: "+palavra;
    }
}
