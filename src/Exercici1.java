public class Exercici1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Mensaje de error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Código dentro del finally");
        }

    }
}

