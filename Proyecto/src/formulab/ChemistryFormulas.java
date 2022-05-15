package formulab;
import java.util.Scanner;
abstract public class ChemistryFormulas extends Constants{
    
    // Constructor del Scanner para leer entradas de menu
    private static Scanner input = new Scanner(System.in);

    //Lista de temas 
    private static String[] formulas = {"Teoria Ondulatoria de la Luz","Energia cuantica","Disoluciones y Molaridad"};
    
    public static void menu(){
        String eleccion;
        int contador=0;
        for(int i=0; i < formulas.length; i++)
        {   
            contador++;
            if(contador == 3)
            {
                contador = 0; 
                System.out.println((char)(i + 65) + ") " + formulas[i]);
            }
            else 
            {
                System.out.print((char)(i + 65) + ") " + formulas[i] + "\t");
            }
        }
         // Introducir y validar la respuesta en base a las opciones
        do{
            eleccion = input.next();

            switch(eleccion.toUpperCase()){
                case "A"->{
                    System.out.println("Inserte la frecuencia");
                    double frecuencia = input.nextDouble();
                    longitudOnda(frecuencia);
                    break;
                }
                case "B"->{
                    System.out.println("Inserte longitud de onda");
                    double longitudOnda = input.nextDouble();
                    frecuencia(longitudOnda);
                }
                case "C"->{
                    System.out.println("Inserte Longitud de onda");
                    double longitudOnda = input.nextDouble();
                    energiaCuantica(longitudOnda);
                
              }default-> {
                    System.out.println("Selecciona una opcion valida");
                }
            }
            
        }while(!eleccion.equalsIgnoreCase("A"));

    }
    

    //Formulas de Teoria ondulatoria

    public static void longitudOnda(double frecuencia){
        double longitudOnda = getVelocidadLuz()/frecuencia;
        System.out.println("La longitud de onda es: "+longitudOnda+"m");
    }
    public static void frecuencia(double longitudOnda){
        double frecuencia = getVelocidadLuz()/longitudOnda;
        System.out.println("La frecuencia es: "+frecuencia+"Hz");
    }
    
    //Energia cuantica
    //E ctePlanck*frecuencia
    public static void energiaCuantica(double longitudOnda){
        double energia = getConstantePlanck()*longitudOnda;
        System.out.println("La energía cuántica es : "+energia+"J");
    }
    //Disoluciones
    public static void numeroMoles(double gramos, double milimetros){
        double numeroMoles=gramos/milimetros;
        System.out.println("El numero de moles es: "+numeroMoles);
    }
    public static void molaridad(double numeroMoles, double ltsDisolucion){
        double molaridad = numeroMoles/ltsDisolucion;
        System.out.println("La molaridad es: "+molaridad);
    }
    public static void molalidad(double numeroMoles, double kgDisolvente){
        double molalidad  = numeroMoles/kgDisolvente;
        System.out.println("La molalidad es: "+molalidad);
    }


}