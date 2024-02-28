package algoritmos;
import java.util.Scanner;
import java.util.Random;
public class Logica {
    int a,b;
    float escalar;
    public float [][]matriz;
    public float [][]matriz2;
    Scanner n = new Scanner(System.in);
    //Clase Matriz/////////////////////////////////////////////////////////////////////////
    //Constructor , inicializa dimensiones y crea la matriz a partir de ellas
    public Logica(int a, int b) {
            this.a = a;
            this.b = b;
            matriz = new float[a][b]; // Inicializar la matriz con las dimensiones dadas
            matriz2 = new float[a][b];
        }
    public Logica(int a,int b,float escalar){
        this.a=a;
        this.b=b;
        this.escalar=escalar;
        matriz = new float[a][b];
    }
    //Función de llenar los datos
        public void llenar() {
            for (int i = 0; i < a; i++) {
                System.out.println("Fila " + (i + 1));
                for (int j = 0; j < b; j++) {
                    System.out.println("Ingrese el valor["+i+"]["+j+"]");
                    matriz[i][j] = n.nextFloat();
                }
            }
        }
        public void llenar2() {
            for (int i = 0; i < a; i++) {
                System.out.println("Fila " + (i + 1));
                for (int j = 0; j < b; j++) {
                    System.out.println("Ingrese el valor["+i+"]["+j+"]");
                    matriz2[i][j] = n.nextFloat();
                }
            }
        }
    //Función de mostrar los datos
        public void mostrar() {
            for (int i = 0; i < a; i++) {
                System.out.print("| ");
                for (int j = 0; j < b; j++) {
                    System.out.print(matriz[i][j] + "   ");
                }
                System.out.println("|"); 
            }
        }
        public void mostrar2() {
            for (int i = 0; i < a; i++) {
                System.out.print("| ");
                for (int j = 0; j < b; j++) {
                    System.out.print(matriz2[i][j] + "   ");
                }
                System.out.println("|");
            }
        }
    //Función de suma de matrices
        public void suma(){
            for (int i = 0; i < a; i++) {
                System.out.print("| ");
                for (int j = 0; j < b; j++) {
                    System.out.print(matriz[i][j]+matriz2[i][j]+"   ");
                }
                System.out.println("|");
            }
        }
    //Función de producto de matrices
        public void producto(){
            for (int i = 0; i < a; i++) {
                System.out.print("| ");
                for (int j = 0; j < b; j++) {
                    System.out.print(matriz[i][j]*matriz2[i][j]+"   ");
                }
                System.out.println("|");
            }
        }
    //Función de matriz por un escalar
        public void mxe(){
            for (int i = 0; i < a; i++) {
                System.out.print("| ");
                for (int j = 0; j < b; j++) {
                    System.out.print(matriz[i][j]*escalar+"    ");
                }
                System.out.println("|");
            }
        }
    //Transpuesta de una matriz
        public void trans(){
            for (int i = 0; i < a; i++) {
                System.out.print("| ");
                for (int j = 0; j < b; j++) {
                    System.out.print(matriz[j][i]+"    ");
                }
                System.out.println("|");
            }
        }
    //Clase Ordenamiento//////////////////////////////////////////////////////////////////////////////////////////
       //Creamos el vector e inicializamos valores auxiliares para los métodos
       public double []vector;
       public double aux;
       public int pos;
       public double menor;
        public Logica (int a){
           this.a=a;
           vector = new double[a];
       }
        //Getter para sacar el tamaño del arreglo
        public int getTamaño(){
            return vector.length;
        }
        //Rellenamos los valores del arreglo con números aleatorios
        public void rellenar(){
            Random random = new Random();
            for (int i = 0; i < getTamaño(); i++) {
                vector[i]=random.nextDouble()*100;
            }
            for (int i = 0; i < getTamaño(); i++) {
                System.out.println("["+(i+1)+"]  "+vector[i]);
            }
        }
        //Método Burbuja
        public void burbuja(){
            for (int i = 1; i <(getTamaño())-1 ; i++) {
                for (int j = 0; j < (getTamaño())-1; j++) {
                    if(vector[j]>vector[j+1]){
                        aux = vector[j];
                        vector[j] = vector[j+1];
                        vector[j+1]= aux;
                    }
                }
            }
        }
        //Burbuja ordenado
        public void burbujaOrdenado(){
            for (int i = 0; i < getTamaño(); i++) {
                System.out.println("["+(i+1)+"]  "+vector[i]);
            }
        }
        //Método Inserción
        public void insercion(){
            for (int i = 0; i < getTamaño(); i++) {
                pos = i;
                aux = vector[i];
                while((pos>0) && (vector[pos-1]>aux)){
                    vector[pos]=vector[pos-1];
                    pos--;
                }
                vector[pos]=aux;
            }
        }
        public void insercionOrdenado(){
            for (int i = 0; i < getTamaño(); i++) {
                System.out.println("["+(i+1)+"]  "+vector[i]);
            }
        }
        //Metodo Selección
        public void seleccion(){
            for (int i = 0; i < (getTamaño()-1); i++) {
                menor = vector[i];
                pos = i;
                for (int j = i+1; j < (getTamaño()); j++) {
                    if(vector[j]<menor){
                        menor=vector[j];
                        pos=j;
                    }
                }
                if(pos!=i){
                    aux = vector[i];
                    vector[i]=vector[pos];
                    vector[pos]=aux;
                }
            }
        }
        public void seleccionOrdenado(){
            for (int i = 0; i < getTamaño(); i++) {
                System.out.println("["+(i+1)+"]  "+vector[i]);
            }
        }
        //Metodo Merge and Sort
        public void mergeSort() {
        mergeSort(0, getTamaño() - 1);
    }

    private void mergeSort(int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            mergeSort(inicio, medio);
            mergeSort(medio + 1, fin);
            merge(inicio, medio, fin);
        }
    }

    private void merge(int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        double[] izquierda = new double[n1];
        double[] derecha = new double[n2];

        for (int i = 0; i < n1; ++i)
            izquierda[i] = vector[inicio + i];
        for (int j = 0; j < n2; ++j)
            derecha[j] = vector[medio + 1 + j];

        int i = 0, j = 0;
        int k = inicio;
        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                vector[k] = izquierda[i];
                i++;
            } else {
                vector[k] = derecha[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            vector[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < n2) {
            vector[k] = derecha[j];
            j++;
            k++;
        }
    }
        public void mergeSortOrdenado(){
            for (int i = 0; i < getTamaño(); i++) {
                System.out.println("["+(i+1)+"]  "+vector[i]);
            }
    }
}
