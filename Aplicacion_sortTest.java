import java.beans.Transient;

public class Aplicacion_sortTest {

    @Test
    void bubbleSort() {
        Aplicacion_sort  sorts = new    Aplicacion_sort(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.bubbleSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }

    @Test
    void gnomeSort() {
        Aplicacion_sort sorts = new    Aplicacion_sort(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.gnomeSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }

    @Test
    void quickSort() {
        Aplicacion_sort sorts = new    Aplicacion_sort(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.quickSort(array,0,array.length-1);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }

    @Test
    void mergeSort() {
        Aplicacion_sort sorts = new    Aplicacion_sort(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.mergeSort(array,0,array.length-1);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }

    @Test
    void radixSort() {
        Aplicacion_sortsorts = new    Aplicacion_sort(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.radixSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }
   
}
    



