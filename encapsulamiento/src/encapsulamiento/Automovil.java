package encapsulamiento;
/**
 * Clase de un 'automovil'; hereda atributos del vehiculo.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999). 
 */
public class Automovil extends Vehiculo{
    private int numPuertas;
    private int capPasajeros;
    private String tipoCombustible;
        //
    public Automovil(String marca, String modelo, int año, String color, 
                     int numPuertas, String tipoCombustible, int capPasajeros){
        super(marca, modelo, año, color);
        this.tipoCombustible = tipoCombustible;
        this.numPuertas = numPuertas;
        this.capPasajeros = capPasajeros;
    }
        //Atributos: del numero de puertas de un automovil.
    public int getNumPuertas(){
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas = numPuertas;
    }
        //Atributos: del tipo de combustible que utiliza un automovil.
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
        //Atributos: de la capacidad maxiama de pasajeros en un automovil.
    public int getCapPasajeros(){
        return capPasajeros;
    }
    public void setCapPasajeros(int capPasajeros){
        this.capPasajeros = capPasajeros;
    }
}
