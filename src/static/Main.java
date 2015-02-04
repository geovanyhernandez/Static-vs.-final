public class Main {  
      public static void main(String[] args) {  
        Usuario raul = new Usuario();  
        Usuario pepe = new Usuario();  
        Usuario roja = new Usuario();  
        Usuario liio = new Usuario();
        //hace un llamado a la clase Usuario.java sin tener un objeto.
        System.out.println("Hay " + Usuario.usuarios + " usuarios");  
      } 
}  