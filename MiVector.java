import java.util.Scanner;
import java.util.ArrayList;
public class MiVector {

    private int[] v;

    private int tam = 0;

    //Ejercicio 1

    //constructor por defecto
    public MiVector(){
        tam=0;
    }

    //constructor tamaño a elegir
    public MiVector(int tamaño){
        v = new int[tam = tamaño];
    }

    //constructor que reciba array de enteros e inicialize con dicho array
    public MiVector(int[] v){
        this.v = v;
    }

    //constructor de copia
    public MiVector(MiVector copia){
        this.tam = copia.tam;
        this.v = copia.v;
    }
    //Scanner
    public void tamaño_array() {
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce una secuencia de numeros para meterlos en un array");


        for (int i = 0; i < tam; i++) {
            v[i] = scan.nextInt();
        }
        System.out.println("Dentro de tu array tienes la siguiente secuencia de numeros");
    }

    public void contenido_array(){




        for (int i = 0; i < tam; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    //Ejercicio 2


    //Ejercicio 3

    public boolean esVacio(){
        if (tam == 0){
            return true;
        }
        return false;
    }

    public void vaciar(){
        for(int i = 0; i < tam; i++){
            if(v[i] != 0){
                v[i] = 0;
            }
        }
    }

    public int reiniciar(){
        return tam = 0;
    }

    //Ejercicio 4

    public int recuperaElemento(int posicion) {
        for (int i = 0; i < tam; i++) {
            if (v[i] == posicion){
                return posicion;
            }
        }
        return posicion = -1;
    }

    public boolean buscarElemento(int posicion) {
        for (int i = 0; i < tam; i++){
            if(v[i] == posicion){
                return true;
            }
        }
        return false;
    }

    //Ejercicio 6

    public String toString(){
        String elementos = "";
        for(int i = 0; i < tam; i++) {
            elementos += (v[i] + " , ");
        }
        return elementos;
    }

    public MiVector clone(){
        MiVector clon = new MiVector();
        clon.v = this.v;
        clon.tam = this.tam;
        return clon;
    }

    public boolean equals(MiVector otro){
        if(this.v != otro.v && this.tam != otro.tam){
            return false;
        }
        return true;
    }


    //Ejercicio 7

    public void recursividadBurbuja() {
        int[] v = {1, 2, 3, 4, 5};
        int Burbuja = 0;


        for (int i = 0; i < v.length; i++) {
            for (int j = 1; j < (v.length - i); j++) {
                if (v[j - 1] > v[j]) {
                    Burbuja = v[j - 1];
                    v[j - 1] = v[j];
                    v[j] = Burbuja;
                }
            }
        }
    }

    //Ejercicio 8

    public void quickSort(int empieza, int acaba) {
        if (empieza < acaba) {

            int pivotIndex = particion(empieza, acaba);

            quickSort(empieza, pivotIndex - 1);

            quickSort(pivotIndex + 1, acaba);
        }
    }

    public int particion(int empieza, int acaba) {
        int pivote = v[acaba];
        int i = empieza - 1;

        for (int j = empieza; j < acaba; j++) {
            if (v[j] < pivote) {
                i++;
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }

        int temp = v[i + 1];
        v[i + 1] = v[acaba];
        v[acaba] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        MiVector prueba = new MiVector(5);
        prueba.tamaño_array();
        prueba.contenido_array();

    }
}
