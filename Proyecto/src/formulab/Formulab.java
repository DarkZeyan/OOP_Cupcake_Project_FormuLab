package formulab;
import java.util.Scanner;
public class Formulab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Se elige y valida la materia que se desea estudiar
        System.out.println("Indique la materia que desea estudiar: \na)Física \tb)Química");
        String election = input.next();
        while(!election.equalsIgnoreCase("a") && !election.equalsIgnoreCase("b")){
            System.out.println("Opción inválida, intentelo de nuevo\n");           
            System.out.println("Indique la materia que desea estudiar: \na)Física \tb)Química");
            election = input.next();
        }
        //Se evalua la eleccion para determinar la materia.
        if(election.equalsIgnoreCase("a")) {
            PhysicsFormulas.menu();
        }else {
            ChemistryFormulas.menu();
        }
    }
    
}

