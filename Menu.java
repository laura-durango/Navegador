import  java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<ObjPaginaWeb> pila = new Stack<>();
        boolean seguir = true;
        int opt = 0, numero = 0;
        while (seguir) {
            System.out.println("Bienvenido a tu navegador de confianza");
            System.out.println("\n--- NAVE-GLO ---");
            System.out.println("\n Que desea realizar");
            System.out.println("1) Visitar página");
            System.out.println("2) Retroceder");
            System.out.println("3) Ver historial");
            System.out.println("5) Salir");
            opt = m.ValidarEntero(sc);

            switch (opt) {
                case 1:
                    pila = m.visitarPagina(pila, sc);
                    break;
                case 2:
                    m.retroceder(pila);
                    break;

                case 3:
                    m.mostrarHistorial(pila);
                    break;

                case 4:
                    System.out.println("Gracias por usar el navegador");
                    seguir = false;
                    break;

                default:
                    System.out.println("Opción inválida (1 - 4)");
                    break;

                    

            }

            
        }
    }


    

    

    

    
}
