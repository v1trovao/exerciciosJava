package Benum.dominio;

public enum InstrumentoMusical {


    SANFONA("aerofone") {
        public void tocar() {
            System.out.println("\uD83E\uDE97 \uD83C\uDFB5...");
        }
    },
    PIANO("teclas") {
        public void tocar() {
            System.out.println("\uD83C\uDFB9 \uD83C\uDFB5...");
        }
    },
    GUITARRA("cordas") {
        public void tocar() {
            System.out.println("\uD83C\uDFB8 \uD83C\uDFB5...");
        }
    },
    BATERIA("percussão") {
        public void tocar() {
            System.out.println("\uD83E\uDD41 \uD83C\uDFB5...");
        }
    };

    private final String familia;

    InstrumentoMusical(String familia) {
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    public static void imprime(){
        InstrumentoMusical[] instrumentos = InstrumentoMusical.values();

        for (int i = 0; i <= instrumentos.length - 1; i++) {
            System.out.print("[" + (i+1) + "] - ");
            System.out.print(instrumentos[i]);
            System.out.println(", " + instrumentos[i].getFamilia());
        }
    }


    public abstract void tocar();

}
