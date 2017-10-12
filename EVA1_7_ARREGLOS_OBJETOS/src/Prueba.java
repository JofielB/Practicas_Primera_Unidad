/*SE CREARA UNA NUEVA CLASE 
HAREMOS UN ARRAY DE ESTA 
Y HAREMOS UNOS COPIA DEL ARRAY*/

/**
 *
 * @author JOFIEL 14061213
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARREGLO 10 ALUMNOS
        Alumno alumnos[] = new Alumno[10]; 
        //LLENAR EL ARREGLO CON DATOS DE ALUMNOS
        for(int i =0; i<10;i++){
            alumnos[i] = new Alumno("Jofiel Batista","14061213",0);
        }
        //IMPRIMIR LOS DATOS DE LOS ALUMNOS
        for(int i =0; i<10;i++){
            System.out.println("Nombre: "+alumnos[i].getNombre());
            System.out.println("No Control:"+alumnos[i].getNumControl());
            System.out.println("Carrera: "+alumnos[i].getCarrera()); 
        } 
        //CREAR DUPLICADO DE ARREGLO
        Alumno alumnosCopia[] = new Alumno[10];
        for(int i =0; i<10;i++){
            alumnosCopia[i] = new Alumno(alumnos[i].getNombre(),alumnos[i].getNumControl(),
                    alumnos[i].getCarrera());
        } 
        //COMPROBAMOS
        System.out.println("Real Nombre 1: "+alumnos[1].getNombre() );
        System.out.println(alumnos[1]);
        System.out.println("Copia Nombre 1: "+alumnosCopia[1].getNombre() );
        System.out.println(alumnosCopia[1]);
    }
    
}
class Alumno{
    private String nombre;
    private String numControl;
    private int carrera; //  0 -> sistemas
    //COSTRUCTOR PARA LA CLASE, INICIALIZAR
    public Alumno(String n, String nC, int c){
        nombre = n;
        numControl = nC;
        carrera = c;
    }
    //SET GET DE LOS ATRIBUTOS 
    public String getNombre() {
        return nombre;
    }
    public String getNumControl() {
        return numControl;
    }
    public int getCarrera() {
        return carrera;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }   
}