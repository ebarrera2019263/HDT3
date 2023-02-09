import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;



/* Integrantes: Erick Barrera 22934
 *              Jorge Lopez 221038
 * 
 * 
*/

public class Read {

    Random miGenerador = new Random();
    String Numero_Contenido = "";
    int numero = 0;
    Integer[] lista = new Integer[5000];
    String directorio = "datosHDT3.csv";
    


    public Integer[] VerificarDocumento(){
        File archivo = new File(directorio);

        if(archivo.exists() && archivo.isFile()){
            return LeerDatos();
        }
        else{
            CrearArchivo();
            return LeerDatos();
        }
    }
    
    
    public void CrearArchivo(){

        for(int i = 0; i < 5000; i++){
            numero = Math.abs(miGenerador.nextInt());
            lista[i] = numero;
        }    
        
        try {
            File archivo = new File (directorio);
            archivo.createNewFile();

            FileWriter myWriter = new FileWriter(directorio);
            BufferedWriter myBuffer = new BufferedWriter(myWriter);
            
            

            for (int i: lista) {
                Numero_Contenido += String.valueOf(i) + "\n";
            }
            myBuffer.write(Numero_Contenido);
            myBuffer.close();

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el documento.");
            e.printStackTrace();
        }
       
    }


    public Integer[] LeerDatos(){
        Integer[] lista = new Integer[5000];
        File archivo = null;
        FileReader myReader = null;
        BufferedReader myBufferReader = null;

        try{
            archivo = new File (directorio);
            myReader = new FileReader(archivo);
            myBufferReader = new BufferedReader(myReader);

          
            String datos_Obtenidos_del_csv = "";

          
            for(int i = 0; (datos_Obtenidos_del_csv = myBufferReader.readLine()) != null; i ++){
                lista[i] = Integer.parseInt(datos_Obtenidos_del_csv);
            }
            return lista;

        }catch(Exception e){
            System.out.println("Ha ocurrido un error al escanear el documento.");
            e.printStackTrace();
        }finally{

            try{
                if(myReader != null){
                    myReader.close();
                }
            }catch(Exception e){
                System.out.println("Ha ocurrido un error al cerrar el documento.");
                e.printStackTrace();
            }
        }


        return null;
    }




    public void CargarDocumento(Integer[] lista){
        try{
            File archivo = new File(directorio);
            FileWriter myFileWriter = new FileWriter(archivo);
            BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);

            for (int i: lista) {
                Numero_Contenido += String.valueOf(i) + "\n";
            }
            myBufferedWriter.write(Numero_Contenido);
            myBufferedWriter.close();

        }catch(Exception e){
            System.out.println("Ha ocurrido un error al actualizar los datos. ");
            e.printStackTrace();
        }
    }
}
