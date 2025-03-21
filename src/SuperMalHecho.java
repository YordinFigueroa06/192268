import java.util.Scanner;
public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for(int n = 1; n <= 5; n++){
            System.out.println("Escriba el nombre del producto: " + n);
            String NombreDelProducto = scanner.nextLine();
            System.out.println("Ingrese el precio:");
            double precioDelProducto = scanner.nextDouble();
            scanner.nextLine();
            double impuestos = (precioDelProducto * 0.19);
            double descuento = (precioDelProducto > 10000) ? (precioDelProducto * 0.10) : 0;
            double totalCalculo = precioDelProducto + impuestos - descuento;
            System.out.println("Producto: " + NombreDelProducto + ", Precio final: " + totalCalculo);
            suma += totalCalculo;
        }
        System.out.println("EL TOTAL DE LA COMPRA ES: " + suma);
    }
}

