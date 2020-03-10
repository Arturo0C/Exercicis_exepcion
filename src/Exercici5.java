import java.util.*;


public class Exercici5 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce números. El cero para salir");

        int numero = 0;
        while (numero!=0){
            try {
                numero = reader.nextInt();
                lista.add(numero);
            } catch (InputMismatchException ime){
                System.out.println("¡Cuidado! Solo puedes insertar números. ");
                reader.next();
            }
        }
    }
}
