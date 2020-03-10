public class Exercici4 {
    public static void main(String[] args) {
    try {
        mifuncion(3);
        System.out.println("OK");
    } catch (Exepcion exepcion) {
        System.out.println(exepcion.getMessage());
    }

    }

    static void mifuncion(int x) throws Exepcion {
        if (x < 0 || x > 5) {
            throw new Exepcion("Error: el parámetro x no esta en el rango válido");
        }
        System.out.println("Dentro de mifuncion");
    }
}

class Exepcion extends Exception {
    String mensaje;

    Exepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
       return mensaje;
    }
}
