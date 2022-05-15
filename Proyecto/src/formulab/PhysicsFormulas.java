package formulab;
import java.text.DecimalFormat;
import java.util.Scanner;

abstract public class PhysicsFormulas extends Constants{
    // Constructor del Scanner
    static Scanner input = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");
    // Lista de temas
    static String[] formulas = {"Energia", "Velocidad", "Distancia", "Tiempo", "Temperaturas"};
    static String[] conversionTemp = {"celsius-Fahrenheit", "celsius-Kelvin", "fahrenheit-Celsius", "fahrenheit-Kelvin", "kelvin-Celsius", "kelvin-Fahrenheit" };
 
    // Menus inicio
    public static void menu(){
        String eleccion;
        int contador = 0;
        System.out.println("Elija uno de los subtemas");

        // Leer lista de opciones
        for(int i=0; i < formulas.length; i++){   
            contador++;
            if(contador == 3){
                contador = 0; 
                System.out.println((char)(i + 65) + ") " + formulas[i]);
            }
            else{
                System.out.print((char)(i + 65) + ") " + formulas[i] + "\t");
            }
        }
        // Introducir y validar la respuesta en base a las opciones
        do{
            eleccion = input.next();

            switch(eleccion.toUpperCase()){
                case "A"-> { 
                    System.out.print("Ingrese la masa (Kg):");
                    double masa  = input.nextDouble();
                    energia(masa);
                    break;
                }
                case "B"-> {  
                    System.out.println("Ingrese la distancia (m)");
                    double distancia = input.nextDouble();
                    System.out.println("Ingrese el tiempo (s)");
                    double tiempo = input.nextDouble();
                    velocidad(distancia, tiempo);
                    break;
                }
                case "C"-> {
                    System.out.println("Ingrese la velocidad (m/s)");
                    double velocidad = input.nextDouble();
                    System.out.println("Ingrese el tiempo (s)");
                    double tiempo = input.nextDouble();
                    distancia(velocidad, tiempo);
                    break;
                }
                case "D"-> {
                    System.out.println("ingrese distancia");
                    double distancia = input.nextDouble();
                    System.out.println("ingrese velocidad");
                    double velocidad = input.nextDouble();
                    tiempo(distancia, velocidad);
                }
                case "E"-> {
                    System.out.println("\n \n");
                    menuTemperature();
                }
                default-> {
                    System.out.println("Selecciona una opcion valida");
                }
            }   
            
        }while(!eleccion.equalsIgnoreCase("A"));
    }

    public static void menuTemperature (){
        String opcion;
        int contador = 0;
        System.out.println("Elija una de las conversiones");

        // Leer lista de opciones de temperatura
        for(int i=0; i < conversionTemp.length; i++){   
            contador++;
            if(contador == 3){
                contador = 0; 
                System.out.println((char)(i + 97) + ") " + conversionTemp[i]);
            }
            else{
                System.out.print((char)(i + 97) + ") " + conversionTemp[i] + "\t");
            }
        }
        do{
            opcion = input.next();

            switch(opcion.toUpperCase()){
                case "A"-> {
                    System.out.println("Ingrese grados Celsius"); 
                    double celsius = input.nextDouble();
                    celsiusFahrenheit(celsius);
                    break;
                }
                case "B"-> {
                    System.out.println("Ingrese grado Celsius");
                    double celsius = input.nextDouble();
                    celsiusKelvin(celsius);
                    break;
                }
                case "C"-> {
                    System.out.println("Ingrese grados Fahrenheit");
                    double fahrenheit = input.nextDouble();
                    fahrenheitCelsius(fahrenheit);
                    break;
                }
                case "D"-> {
                    System.out.println("Ingrese grados Fahrenheit");
                    double fahrenheit = input.nextDouble();
                    fahrenheitKelvin(fahrenheit);
                    break;
                }
                case "E"-> {
                    System.out.println("Ingrese grados Kelvin");
                    double kelvin = input.nextDouble();
                    kelvinCelsius(kelvin);
                    break;
                }
                case "F"-> {
                    System.out.println("Ingrese grados Klevin");
                    double kelvin = input.nextDouble();
                    kelvinFahrenheit(kelvin);
                    break;
                }
                default-> {
                    System.out.println("Selecciona una opcion valida");
                }
            }   
            
        }while(!opcion.equalsIgnoreCase("A"));

        
    }
    
    ////////////////////////// Formulas
    
    public static void energia(double mass){
        double energia = mass * getVelocidadLuz();
        System.out.println("La energía es: "+energia);
    }
    // Formulas de velocidad
    
    public static void velocidad(double distancia, double tiempo){
        double velocidad = distancia/tiempo;
        System.out.println("La velocidad es " + velocidad+"m/s");
    }

    public static void distancia(double velocidad, double tiempo){
        double distancia = velocidad*tiempo;
        System.out.println("La distancia es: "+distancia+"m");
    }

    public static void tiempo(double distancia, double velocidad){
        double tiempo = distancia/velocidad;
        System.out.println("El tiempo es: "+tiempo+"s");
    }

    // Formulas de conversion de temperatura

    public static void celsiusFahrenheit(double celsius){
        double fahrenheit=1.8*celsius+32;
        System.out.println("La temperatura es: "+df.format(fahrenheit)+"°F");
    }
    public static void celsiusKelvin(double celsius){
        double kelvin = celsius+273.0;
        System.out.println("La temperatura es: "+df.format(kelvin)+"°K");
    }
    public static void fahrenheitCelsius(double fahrenheit){
        double celsius = 5.0/9.0*(fahrenheit-32.0);
        System.out.println("La temperatura es: "+df.format(celsius)+"°C");
    }
    public static void fahrenheitKelvin(double fahrenheit){
       double kelvin = 5.0/9.0*(fahrenheit-32.0)+273.0;
       System.out.println("La temperatura es: "+df.format(kelvin)+"°K");
    }
    public static void kelvinCelsius(double kelvin){
        double celsius =  kelvin-273.0;
        System.out.println("La temperatura es: "+df.format(celsius)+"°C");
    }
    public static void kelvinFahrenheit(double kelvin){
        double fahrenheit =  (kelvin-273.0)*1.8+32.0;
        System.out.println("La temperatura es: "+df.format(fahrenheit)+"°F");
    }

    //Formulas \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
}