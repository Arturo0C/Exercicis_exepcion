public class Exercici3 {
    public static void main(String[] args) {
        String[] s = new String[4];
        try {
            s[4] = "1";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El tamaño de el array es menor");
        }
    }

}
