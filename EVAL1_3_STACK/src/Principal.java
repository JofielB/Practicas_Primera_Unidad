/**
 * EN ESTA PROJECTO VEREMOS COMO FUNCIONA 
 * LA MEMORIA STACK 
 * @author 14061213
 */
public class Principal {

    /**
     * @param args the command line arguments
     * INCIARA EL LLAMADO DE LOS METODOS PARA 
     * DEMOSTRAR COMO FUNCIONA LA MEMORIA
     * STACK
     */
    public static void main(String[] args) {
        System.out.println("Llamada a A()");
        A();
        System.out.println("Terminandi A()");
    }
    
    /**
     *METODO ESTATICO QUE IMPRIMIRA MENSAJE
     * LLAMARA A METODO "B" E IMPRIMIRA UN
     * MENSAJE NUEVAMENTE
     */
    public static void A(){
        System.out.println("Llamada a B()");
        B();
        System.out.println("Terminandi B()");
    }
    
    /**
     * METODO ESTATICO QUE IMPRIMIRA MENSAJE
     * LLAMARA A METODO "C" E IMPRIMIRA UN
     * MENSAJE NUEVAMENTE
     */
    public static void B(){
        System.out.println("Llamada a C()");
        C();
        System.out.println("Terminandi C()");
    }
    
    /**
     * METODO ESTATICO QUE IMPRIMIRA MENSAJE
     */
    public static void C(){
        System.out.println("Metodo C");
    }
    
}

