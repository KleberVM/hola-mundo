 public class hola {
    public static void main(String[] args) {
        int a = aleatorio();
        System.out.println("Hola mundo desde Java! mi numero aleatorio es : "+a );
    }
    public static int aleatorio () {
        return (int)(Math.random()*100);  // Devuelve un número aleatorio entre 0 y 99
    }
 }