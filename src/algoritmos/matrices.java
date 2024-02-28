package algoritmos;
import java.util.Scanner;
public class matrices{
    public static void main(String[] args) {
       int f,c,repetir;
       float escalar;
       Scanner n = new Scanner(System.in);
       Scanner s = new Scanner(System.in);
       System.out.println("BIENVENIDO A LAS OPERACIONES CON MATRICES");
       do{
        System.out.println("[1] SUMA DE MATRICES");
        System.out.println("[2] PRODUCTO DE MATRICES");
        System.out.println("[3] PRODUCTO DE UN ESCALAR CON UNA MATRIZ");
        System.out.println("[4] TRANSPUESTA DE UNA MATRIZ");
        System.out.print("[5] FINALIZAR PROGRAMA");
           System.out.print("\n-->");int sw = s.nextInt();
        switch(sw){
            case 1:{//Suma de matrices
        //Ingresar datos
        System.out.println("\tSUMA DE MATRICES\n");
        System.out.println("Ingrese el número de filas: ");
        f = n.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        c = n.nextInt();
       //LLenar matrices y calcular suma
        Logica m = new Logica(f,c); 
        System.out.println("\nMatriz 1: ");
        m.llenar();
        System.out.println("\nMatriz 2: ");
        m.llenar2();
        System.out.println("Las matrices son: ");
        m.mostrar();
        System.out.println();
        m.mostrar2();
        System.out.println("La suma de las matrices es:");
        m.suma();
        }break;
            case 2:{//Producto de matrices
        //Ingresar datos
        System.out.println("\tPRODUCTO DE MATRICES\n");
        System.out.println("Ingrese el número de filas: ");
        f = n.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        c = n.nextInt();
       //LLenar matrices y calcular producto
        Logica m = new Logica(f,c); 
        System.out.println("\nMatriz 1:");
        m.llenar();
        System.out.println("\nMatriz 2:");
        m.llenar2();
        System.out.println("Las matrices son: ");
        m.mostrar();
        System.out.println();
        m.mostrar2();
        System.out.println("El producto de las matrices es:");
        m.producto();
        }break;
            case 3:{//Producto de un escalar con una matriz
        //Ingresar datos
        System.out.println("\tPRODUCTO DE UN ESCALAR CON UNA MATRIZ\n");
        System.out.println("Ingrese el número de filas: ");
        f = n.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        c = n.nextInt();
        System.out.println("Ingrese el escalar: ");
        escalar = n.nextFloat();
       //LLenar matrices y calcular la matriz por escalar
        Logica m = new Logica(f,c,escalar); 
        m.llenar();
        System.out.println("La matriz es: ");
        m.mostrar();
        System.out.println("La matriz multiplicada por "+escalar+" es: ");
        m.mxe();
        }break;
            case 4:{//Transpuesta de una matriz
        //Ingresar datos
        System.out.println("\tTRANSPUESTA DE UNA MATRIZ\n");
        System.out.println("Ingrese el número de filas: ");
        f = n.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        c = n.nextInt();
        //Mostrar transpuesta
        Logica m = new Logica(f,c);
        m.llenar();
        m.mostrar();
        System.out.println("La transpuesta de la matriz es: ");
        m.trans();
        }break;
            case 5:{
        System.exit(0); 
        }break;
            default:
                System.out.println("Ingrese una opción válida");
}
        System.out.println("Para volver al menú ingrese [0]");
        System.out.println("-->");repetir = n.nextInt();
       }while(repetir==0);
}
}