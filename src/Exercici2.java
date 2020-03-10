public class Exercici2{
    public static void main(String[] args) {
        String s = null;

        try {
            s.length();
        } catch (Exception e) {
            if (e.getMessage() == null) {
                System.out.println("El string es null");
            }
        }


    }

}
