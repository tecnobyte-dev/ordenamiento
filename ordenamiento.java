import java.util.Scanner;

public class Ordenamiento{

    public static void main(String args[]){
        // Scanner teclado = new Scanner(System.in);
        System.out.println("Ordenamiento burbuja\n");
        // System.out.println("Ingrese el arreglo a ordenar");
        // Array matriz = teclado.

        int[] desorden = new int[] {3, 5, 1, 6, 7, 0, 10};

        for(int i = 0; i < desorden.length; i++){
            System.out.printf("| %d ", desorden[i]);
        }
        int[] orden = burbuja(desorden);
        
        System.out.println("\nordenado");
        for(int i = 0; i < orden.length; i++){
            System.out.printf("| %d ", orden[i]);
        }

    }

    private static int[] burbuja(int[] ordenamiento){
        int total = ordenamiento.length;
        int i = 0;
        boolean fin = false;
        boolean cambio = false;

        do{
            if ( ordenamiento[i] > ordenamiento[(i+1)] ){
                
                int tmp = ordenamiento[i];
                ordenamiento[i] = ordenamiento[(i+1)];
                ordenamiento[i+1] = tmp;

                cambio = true;
                if (i == (total-2)){
                    i = 0;
                    cambio = false;
                }else{
                    i++;
                }
            }else{
                if (i == (total-2) ){
                    if (cambio){
                        i = 0;
                        cambio = false;
                    }else{
                        fin = true;
                    }
                }else{
                    i++;
                }
            }

        }while(!fin);

        return ordenamiento;
    }

}