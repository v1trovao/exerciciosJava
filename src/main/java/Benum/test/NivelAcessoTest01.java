package Benum.test;

import Benum.dominio.NivelAcesso;
import Benum.dominio.Usuario;

public class NivelAcessoTest01 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Jadice", "Jadice", NivelAcesso.USUARIO);
        Usuario usuario2 = new Usuario("Luffy", "Monkey", NivelAcesso.CONVIDADO);
        Usuario usuario3 = new Usuario("Palutena", "Gente", NivelAcesso.ADMIN);

        usuario1.verificarNivelAcesso();
        usuario2.verificarNivelAcesso();
        usuario3.verificarNivelAcesso();
    }
}
