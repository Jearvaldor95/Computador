package computador;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

/*Un proveedor de computadores ofrece descuento del 10%,
 * si cuesta $1.000.000 o más.  Además, independientemente,
 * ofrece el 5% de descuento si la marca es ABACO.
 *  Determinar cuánto pagara, con IVA incluido,
 *   un cliente cualquiera por la compra de una computadora.
 */
public class Computador {

    public static void main(String[] args) {

        Scanner buscar = new Scanner(System.in);

        int precio, valorPagar, descuento, descuento1, valor1, IVA = 19;
        String marca;

        System.out.println("ingrese el valor del computador");
        precio = buscar.nextInt();
        System.out.println(" ingrese la marca del computador si es ABACO o si es otra");
        marca = buscar.next().intern();

        descuento = 10;
        if (precio >= 1000000) {

        } else {
            descuento = 0;
        }
        descuento1 = 5;
        if (marca == "ABACO") {

        } else {
            descuento1 = 0;
        }

        valor1 = (precio * descuento1) / 100;
        int valor = (precio * descuento) / 100;

        int IvaPagar = (precio * IVA) / 100;
        valorPagar = precio - valor - valor1 + IvaPagar;

        System.out.println("el valor a pagar es :" + valorPagar);

    }

}
