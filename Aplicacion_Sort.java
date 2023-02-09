import java.util.Arrays;

public class Aplicacion_Sort<T> {
    
    Controladora<T> comparar = new Controladora<>();

   
    public Aplicacion_Sort(Controladora<T> comparar) {
        this.comparar = comparar;
    }
    
    
    
    public void GnomeSort(T[] lista){
        int i = 0;
        while(i < lista.length){
            if (i == 0){
                i++;
            }
            if(comparar.Compare(lista[i], lista[i-1]) >= 0){
                i++;
            }
            else{
                T temporal;
                temporal = lista[i];
                lista[i] = lista[i - 1];
                lista[i - 1] = temporal;
                i--;
            }
        }
        return;
    }

    
  
    public void Merge(T[] lista, int a, int b, int c){
        int numero1 = b - a + 1;
        int numero2 = c - b;

        Integer[] lista1 = new Integer[numero1];
        Integer[] lista2 = new Integer[numero2];

        for(int i = 0; i < numero1; i++){
            lista1[i] = (Integer)lista[a + i];
        }
        for(int j = 0; j < numero2; j++){
            lista2[j] = (Integer)lista[b + j + 1];
        }

        int Recorrido1 = 0, Recorrido2 = 0;
        int k = a;

        while(Recorrido1 < numero1 && Recorrido2 < numero2){
            if (lista1[Recorrido1] <= lista2[Recorrido2]) {
	        	lista[k] = (T)lista1[Recorrido1];
	            Recorrido1++;
	        }
	        else {
	        	lista[k] = (T)lista2[Recorrido2];
	            Recorrido2++;
	        }
	        k++;
	    }

	    while (Recorrido1 < numero1) {
	    	lista[k] = (T)lista1[Recorrido1];
	        Recorrido1++;
	        k++;
	    }

	    while (Recorrido2 < numero2) {
	    	lista[k] = (T)lista2[Recorrido2];
	        Recorrido2++;
	        k++;
	    }
    }

    
    
    public void MergeSort(T[] lista, int a, int b){
        if(a < b){
            int c = a + (b - a)/2;

            MergeSort(lista, a, c);
            MergeSort(lista, c + 1, b);

            Merge(lista, a, c, b);
        }
    }


    
    
    private T ObtenerMayor(T[] lista){
    	T max = lista[0];
        for (int i = 1; i < lista.length; i++) {
        	if(comparar.Compare(max, lista[i]) == -1){
				max = lista[i];
			}
        }
        return max;
    }
 

    
  
    private void ContadorSort(T[] lista, int e){
    	Integer[] output = new Integer[lista.length];
        int i;
        int contador[] = new int[10];
        Arrays.fill(contador, 0);
        
		for (i = 0; i < lista.length; i++) {	
			Integer value = (Integer) lista[i];
			contador[((value/e) % 10)]++;
		}
 
        for (i = 1; i < 10; i++) {        	
        	contador[i] += contador[i - 1];
        }
 
        for (i = lista.length - 1; i >= 0; i--) {
        	Integer value = (Integer) lista[i];
            output[contador[((value / e) % 10)] - 1] = (Integer) lista[i];
            contador[((value / e) % 10)]--;
        }
        
        for (i = 0; i < lista.length; i++){
            lista[i] =  (T) output[i];
        }
    }
 

   
    public void RadixSort(T[] lista){

        Integer m = (Integer) ObtenerMayor(lista);
 
        for (int exp = 1;   m / exp > 0; exp *= 10) {        	
        	ContadorSort(lista, exp);
        }
    }
    
    
    
    
    public void QuickSort(T[] lista, int a, int b) {
        int i = a -1;
        int j = b;
        boolean bandera = true;
        T Temporal;
        
        if (a >= b) {
 		   return;
 	    }
 	   
 	    T elem_div = lista[b];
 	   
 	   
 	    while (bandera) {
            while(comparar.Compare(lista[++i], elem_div) < 0); 
            while((comparar.Compare(lista[--j], elem_div) > 0) && (j > a)); 
 		   
 		    if (i < j) {
                Temporal = lista[i];
                lista[i] = lista[j];
                lista[j] = Temporal;
 		    } else {
                bandera = false;
 		    }
 	    }
 	   
        Temporal = lista[i];
        lista[i] = lista[b];
        lista[b] = Temporal;
        QuickSort(lista, a, i - 1);
        QuickSort(lista, i + 1, b);
    }



    
    
    public void BubbleSort(T[] lista){
        for (int i = 0; i < lista.length - 1; i++) {
			for(int l = 0; l < lista.length-l-1; l++) {
				if(comparar.Compare(lista[l], lista[l+1]) > 0) {
					T temp = lista[l];
					lista[l] = lista[l+1];
					lista[l+1] = temp;
				}
			}
	    }
    }
