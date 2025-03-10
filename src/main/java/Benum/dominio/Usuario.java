package Benum.dominio;

public class Usuario {
    private String nombre;
    private String apellido;
    private NivelAcesso nivelAcesso;

    public Usuario(String nome, String apelido, NivelAcesso nivelAcesso) {
        this.nombre = nome;
        this.apellido = apelido;
        this.nivelAcesso = nivelAcesso;
    }

    public void verificarNivelAcesso() {
        System.out.println("\nUsuário: " + this.nombre);

        switch (this.nivelAcesso) {
            case USUARIO -> {
                System.out.println("Acesso as funcionalidades definidas para o sistema");
                break;
            }
            case ADMIN -> {
                System.out.println("Acesso total ao sistema.");
                break;
            }
            case CONVIDADO -> {
                System.out.println("Somente leitura");
                break;
            }
        };
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nivelAcesso=" + nivelAcesso +
                '}';
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
