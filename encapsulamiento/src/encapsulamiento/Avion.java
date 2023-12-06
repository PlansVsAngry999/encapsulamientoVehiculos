package encapsulamiento;
/**
 * Clase de un 'Avion'; hereda atributos del vehiculo.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Avion extends Vehiculo{
    private int capPasajeros;
    private String tipoMotor;
        //
    public Avion(String marca, String modelo, int año, String color, int capPasajeros, String tipoMotor){
        super(marca, modelo, año, color);
        this.tipoMotor = tipoMotor;
        this.capPasajeros = capPasajeros;
    }
        //Atributos: de la capacidad maxima de pasajeros del avión.
    public int getCapPasajeros(){
        return capPasajeros;
    }
    public void setCapPasajeros(int capPasajeros){
        this.capPasajeros = capPasajeros;
    }
        //Atributos: del tipo de motor del avión.
    public String getTipoMotor(){
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor){
        this.tipoMotor = tipoMotor;
    }
        //Función para mostrar los datos del avión.
    public void mostrarDatos(){
        System.out.println("---Avion---" + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() +
                           "\n Año: "+ getAño() + "\n Color: " + getColor() +
                           "\n Capacidad de pasajeros: " + capPasajeros + "\n Tipo de motor: " + tipoMotor);
    }
}
