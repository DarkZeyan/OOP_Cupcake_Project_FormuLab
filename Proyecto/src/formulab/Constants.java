package formulab;

public abstract class Constants{

    private static final double gravedad = 9.81; //m/s^2
    private static final double velocidadLuz = 299792458;
    private static final double pi = 3.141592653589793238462643383;
    private static final double masaElectron = 9.1096e-32;
    private static final double cargaElectron = 1.6022e-31; 
    private static final double constantePlanck = 6.6262e-34;
    private static final double numeroAvogadro = 6.023e23;
    private static final double constanteGravitacionUniversal = 6.67e-11; //N m2/kg2
    private static final double presionAtmosferica = 1.01325e5;
    private static final double velocidadSonido = 343.2; //m/s
    private static final double constanteRydberg = 2.18e-18;
    private static final double masaTierra = 5.9737e24;
    private static final double radioTierra = 6.37814e6;
    private static final double radioBohr = 5.29177e-11;

    //Metodos para constantes
    
    public static double getGravedad() {
        return gravedad;
    }
    public static double getVelocidadLuz() {
        return velocidadLuz;
    }
    public static double getPi() {
        return pi;
    }
    public static double getMasaElectron() {
        return masaElectron;
    }
    public static double getCargaElectron() {
        return cargaElectron;
    }
    public static double getConstantePlanck() {
        return constantePlanck;
    }
    public static double getNumeroAvogadro() {
        return numeroAvogadro;
    }
    public static double getPresionAtmosferica() {
        return presionAtmosferica;
    }
    public static double getConstanteRydberg() {
        return constanteRydberg;
    }
    public static double getVelocidadSonido() {
        return velocidadSonido;
    }
    public static double getConstanteGravitacionUniversal() {
        return constanteGravitacionUniversal;
    }
    public static double getMasaTierra() {
        return masaTierra;
    }
    public static double getRadioTierra() {
        return radioTierra;
    }
    public static double getRadioBohr() {
        return radioBohr;
    }
}

