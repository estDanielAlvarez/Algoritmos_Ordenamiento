package algoritmos;
import java.util.Scanner;
public class Ordenamiento {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int repetir;
        long start,end;
        ///Inicializa el tamaño de los vectores
        Logica v1= new Logica(100);
        Logica v2 = new Logica(500);
        Logica v3 = new Logica(1000);
        Logica v4 = new Logica(5000);
        Logica v5 = new Logica(10000);
        System.out.println("BIENVENIDO AL MENÚ DE TIPOS DE ORDENAMIENTO");
        do{
        System.out.println("[1] Ordenamiento por Burbuja");
        System.out.println("[2] Ordenamiento por Inserción");
        System.out.println("[3] Ordenamiento por Selección");
        System.out.println("[4] Ordenamiento por Merge-Sort");
        System.out.println("[5] Finalizar programa");
            System.out.print("-->");int sw = n.nextInt();
        switch(sw){
            case 1:{//Ordenamiento por burbuja
                System.out.println("Seleccione la cantidad de números que desea ordenar: ");
                System.out.println("[1] 100 números");
                System.out.println("[2] 500 números");
                System.out.println("[3] 1000 números");
                System.out.println("[4] 5000 números");
                System.out.println("[5] 10000 números");
                System.out.println("[6] Volver");
                System.out.print("-->");int sw1 = n.nextInt();
                switch(sw1){
                    case 1:
                        System.out.println("\nLos datos son:");
                        v1.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v1.burbuja();
                        start = System.nanoTime();
                        v1.burbujaOrdenado();
                        end = System.nanoTime();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)*0.000000001+" nanoegundos");
                        break;
                    case 2:
                        System.out.println("\nLos datos son:");
                        v2.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v2.burbuja();
                        start = System.currentTimeMillis();
                        v2.burbujaOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" miliegundos");
                        break;
                    case 3:
                        System.out.println("\nLos datos son:");
                        v3.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v3.burbuja();
                        start = System.currentTimeMillis();
                        v3.burbujaOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" miliegundos");
                        break;
                    case 4:
                        System.out.println("\nLos datos son:");
                        v4.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v4.burbuja();
                        start = System.currentTimeMillis();
                        v4.burbujaOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" miliegundos");
                        
                        break;
                    case 5:
                        System.out.println("\nLos datos son:");
                        v5.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v5.burbuja();
                        start = System.currentTimeMillis();
                        v5.burbujaOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;                        
                }
            }
                break;
            case 2://Ordenamiento por Inserción
                System.out.println("Seleccione la cantidad de números que desea ordenar: ");
                System.out.println("[1] 100 números");
                System.out.println("[2] 500 números");
                System.out.println("[3] 1000 números");
                System.out.println("[4] 5000 números");
                System.out.println("[5] 10000 números");
                System.out.println("[6] Volver");
                System.out.print("-->");int sw2 = n.nextInt();
                switch(sw2){
                    case 1:
                        System.out.println("\nLos datos son:");
                        v1.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v1.insercion();
                        start = System.currentTimeMillis();
                        v1.insercionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 2:
                        System.out.println("\nLos datos son:");
                        v2.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v2.insercion();
                        start = System.currentTimeMillis();
                        v2.insercionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 3:
                        System.out.println("\nLos datos son:");
                        v3.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v3.insercion();
                        start = System.currentTimeMillis();
                        v3.insercionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" miliegundos");
                        break;
                    case 4:
                        System.out.println("\nLos datos son:");
                        v4.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v4.insercion();
                        start = System.currentTimeMillis();
                        v4.insercionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" miliegundos");
                        break;
                    case 5:
                        System.out.println("\nLos datos son:");
                        v5.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v5.insercion();
                        start = System.currentTimeMillis();
                        v5.insercionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" miliegundos");
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;                        
                }
                break;
            case 3://Ordenamiento por selección
                System.out.println("Seleccione la cantidad de números que desea ordenar: ");
                System.out.println("[1] 100 números");
                System.out.println("[2] 500 números");
                System.out.println("[3] 1000 números");
                System.out.println("[4] 5000 números");
                System.out.println("[5] 10000 números");
                System.out.println("[6] Volver");
                System.out.print("-->");int sw3 = n.nextInt();
                switch(sw3){
                    case 1:
                        System.out.println("\nLos datos son:");
                        v1.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v1.seleccion();
                        start = System.nanoTime();
                        v1.seleccionOrdenado();
                        end = System.nanoTime();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 2:
                        System.out.println("\nLos datos son:");
                        v2.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v2.seleccion();
                        start = System.currentTimeMillis();
                        v2.seleccionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 3:
                        System.out.println("\nLos datos son:");
                        v3.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v3.seleccion();
                        start = System.currentTimeMillis();
                        v3.seleccionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 4:
                        System.out.println("\nLos datos son:");
                        v4.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v4.seleccion();
                        start = System.currentTimeMillis();
                        v4.seleccionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 5:
                        System.out.println("\nLos datos son:");
                        v5.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v5.seleccion();
                        start = System.currentTimeMillis();
                        v5.seleccionOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;                        
                }
                break;
            case 4://Ordenamiento por Merge-Sort
                System.out.println("Seleccione la cantidad de números que desea ordenar: ");
                System.out.println("[1] 100 números");
                System.out.println("[2] 500 números");
                System.out.println("[3] 1000 números");
                System.out.println("[4] 5000 números");
                System.out.println("[5] 10000 números");
                System.out.println("[6] Volver");
                System.out.print("-->");int sw4 = n.nextInt();
                switch(sw4){
                    case 1:
                        System.out.println("\nLos datos son:");
                        v1.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v1.mergeSort();
                        start = System.nanoTime();
                        v1.mergeSortOrdenado();
                        end = System.nanoTime();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)*0.000000001+" milisegundos");
                        break;
                    case 2:
                        System.out.println("\nLos datos son:");
                        v2.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v2.mergeSort();
                        start = System.currentTimeMillis();
                        v2.mergeSortOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 3:
                        System.out.println("\nLos datos son:");
                        v3.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v3.mergeSort();
                        start = System.currentTimeMillis();
                        v3.mergeSortOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 4:
                        System.out.println("\nLos datos son:");
                        v4.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v4.mergeSort();
                        start = System.currentTimeMillis();
                        v4.mergeSortOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 5:
                        System.out.println("\nLos datos son:");
                        v5.rellenar();
                        System.out.println("\nLos datos ordenados son:");
                        v5.mergeSort();
                        start = System.currentTimeMillis();
                        v5.mergeSortOrdenado();
                        end = System.currentTimeMillis();
                        System.out.println("El tiempo de ordenamiento fue de "+(end-start)+" milisegundos");
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                        break;                        
                }
                break;
            case 5://Finalizar programa
                System.out.println("Oprima Esc para salir de la consola");
                System.exit(0);
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;                
        }
        System.out.println("Para volver al menú ingrese [0]");
            System.out.println("-->");repetir = n.nextInt();
    }while(repetir==0);   
}
}
