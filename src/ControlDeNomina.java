import java.util.Scanner;
public class ControlDeNomina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de trabajadores");
        int cantidadEmpleados = scanner.nextInt();
        int contadorSueldosFueraDelRango = 0;
        int contadorSueldosDentroDelRango = 0;
        for(int n = 1; n <= cantidadEmpleados; n++){
            System.out.println("Ingrese el sueldo del trabajador: " + n);
            double acumuladoSueldos = scanner.nextDouble();
            if (acumuladoSueldos < 0) {
                System.out.println("No puedes ingresar un sueldo negativo, intentalo de nuevo por favor.");
                n--;
                continue;
            }else if (acumuladoSueldos < 100 || acumuladoSueldos > 300) {
                contadorSueldosFueraDelRango++;
            }else if (acumuladoSueldos >= 100 && acumuladoSueldos <= 300) {
                contadorSueldosDentroDelRango++;
            }
        }
        System.out.println("La catidad de trabajadores que tienen un sueldo dentro del rango de 100 y 300 fueron: " + contadorSueldosDentroDelRango + " trabajadores");
        System.out.println("La catidad de trabajadores que tienen un sueldo fuera del rango de 100 y 300 fueron: " + contadorSueldosFueraDelRango + " trabajadores");
    }
}
