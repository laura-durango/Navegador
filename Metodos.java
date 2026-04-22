import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextDouble();
    }

    public int ValidarRango(int n1, int n2, int numero) {
        Metodos m = new Metodos();
        while (numero < n1 || numero > n2) {
            System.out.println("Por favor ingrese un rango de :" + n1 + " hasta " + n2);
            numero = m.ValidarEntero(sc);
        }
        return numero;
    }

    public Stack<ObjPaginaWeb> visitarPagina(Stack<ObjPaginaWeb> pila, Scanner sc) {

    sc.nextLine(); // limpiar 

    System.out.println("Ingrese la URL de la página:");
    String url = sc.nextLine();

    System.out.println("Ingrese el título:");
    String titulo = sc.nextLine();

    System.out.println("Ingrese la fecha:");
    String fecha = sc.nextLine();

    ObjPaginaWeb pagina = new ObjPaginaWeb(url, titulo, fecha);

    pila.push(pagina);

    System.out.println("Página agregada al historial");

    return pila;
}

    public void retroceder(Stack<ObjPaginaWeb> pila) {
    if (pila.size() > 1) {
        pila.pop();
        System.out.println("Página actual:");
        System.out.println(pila.peek());
    } else {
        System.out.println("No hay páginas para retroceder");
    
}
    }

    public void mostrarHistorial(Stack<ObjPaginaWeb> pila) {
    if (pila.isEmpty()) {
        System.out.println("Historial vacío");
    } else {
        System.out.println("\n--- HISTORIAL ---");
        for (ObjPaginaWeb p : pila) {
            System.out.println(p);
        }
    }
}

}