import java.util.List;
import java.util.Scanner;
import java.io.*; 


public class Principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        Read read = new Read();
        Integer[] numeros = read.VerificarDocumento();
        Aplicacion_Sort aSort = new Aplicacion_Sort(new Controladora());
       
        String menu = "\n1. Gnome Sort. \n2. Merge Sort. \n3. Quick Sort. \n4. Radix Sort.  \n5. Bubble Sort \n6. Salir \nIndica lo que quieres realizar aquí: ";
        System.out.println("\n\t\t\t\t\t***Bienvenido a los diferentes Ordenamientos Sorts ***");
        int opcion = 1;
               
        while(opcion >= 1 && opcion < 6){
            System.out.print(menu);
            try{
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch(opcion){
                    
                  
                    case 1:{
                        System.out.println("Gnome Sort");

                        for(int i = 10; i <= 5000; i+=499){
                            Integer[] lista = new Integer[i];
            			
                            for(int j=0; j<i; j++) {
                                lista[j]=numeros[j];
                            }                           
                            aSort.GnomeSort(lista);
                            
                            for(int recorrido:lista) {
                                System.out.println(recorrido);
                            }
                            System.out.println("\nOrdenamiento con: " + i + " numeros.\n");
                            System.out.println("Presionar Enter para seguir");
                            teclado.nextLine();
                        }

                        System.out.println("Lista Ordenada");
                        break;                   
                    }

                  
                    case 2:{
                        for(int i = 10; i <= 5000; i+=499){
                            Integer[] lista = new Integer[i];
            			
                            for(int j=0; j<i; j++) {
                                lista[j]=numeros[j];
                            }                           
                            aSort.MergeSort(lista, 0, lista.length-1);
                            
                            for(int recorrido:lista) {
                                System.out.println(recorrido);
                            }
                            System.out.println("\nOrdenamiento con: " + i + " numeros.\n");
                            System.out.println("Presionar Enter para seguir");
                            teclado.nextLine();
                        }

                        System.out.println("Lista Ordenada");
                        break;    
                    }
    
                 
                    case 3:{
                        for(int i = 10; i <= 5000; i+=499){
                            Integer[] lista = new Integer[i];
            			
                            for(int j=0; j<i; j++) {
                                lista[j]=numeros[j];
                            }                           
                            aSort.QuickSort(lista, 0, lista.length-1);
                            
                            for(int recorrido:lista) {
                                System.out.println(recorrido);
                            }
                            System.out.println("\nOrdenamiento con: " + i + " numeros.\n");
                            System.out.println("Presionar Enter para seguir");
                            teclado.nextLine();
                        }

                        System.out.println("Lista Ordenada");
                        break;
                    }
    
                   
                    case 4:{
                        for(int i = 10; i <= 5000; i+=499){
                            Integer[] lista = new Integer[i];
            			
                            for(int j=0; j<i; j++) {
                                lista[j]=numeros[j];
                            }                           
                            aSort.RadixSort(lista);
                            
                            for(int recorrido:lista) {
                                System.out.println(recorrido);
                            }
                            System.out.println("\nOrdenamiento con: " + i + " numeros.\n");
                            System.out.println("Presionar Enter para seguir");
                            teclado.nextLine();
                        }

                        System.out.println("Lista Ordenada");
                        break;
                    }

                   
                    case 5:{
                        for(int i = 10; i <= 5000; i+=499){
                            Integer[] lista = new Integer[i];
            			
                            for(int j=0; j<i; j++) {
                                lista[j]=numeros[j];
                            }                           
                            aSort.BubbleSort(lista);
                            
                            for(int recorrido:lista) {
                                System.out.println(recorrido);
                            }
                            System.out.println("\nOrdenamiento con: " + i + " numeros.\n");
                            System.out.println("Presionar Enter para seguir");
                            teclado.nextLine();
                        }

                        System.out.println("Lista Ordenada");
                        break;
                    }

                }
            
            }catch(Exception e){
                System.out.println("Has ingresado uno o varios caracteres incorrectos o no hay datos existentes, intenta nuevamente");
                teclado.next();
            }    

        }
        
        System.out.println("Gracias por utilizar Nuestro programa, hasta luego...");
    }
}