package encapsulamiento;
/**
 * Clase de un 'Avion'; hereda atributos del vehiculo.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Camion extends Vehiculo {
    private int capCarga;
        //
    public Camion(String marca, String modelo, int año, String color, int capCarga){
        super(marca, modelo, año, color);
        this.capCarga = capCarga;
    }
        //Atributos: de la capacidad de carga del camión.
    public int getCapCarga(){
        return capCarga;
    }
    public void setCapCarga(int capCarga){
        this.capCarga = capCarga;
    }
        //Función que muestran los datos del camión.
    public void mostrarDatos(){
        System.out.println("---Camión---" + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() +
                           "\n Año: "+ getAño() + "\n Color: " + getColor() +
                           "\n Carga maxima: " + capCarga + " kg");
    }
}
