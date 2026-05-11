package factory;

import model.Usuario;

public class TabelaFactory {

    public static Usuario criarUsuario(String palavra) {
        return new Usuario(palavra);
    }
}
