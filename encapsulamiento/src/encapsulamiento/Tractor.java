package encapsulamiento;
/**
 * Clase de un 'Tractor'; hereda atributos del vehiculo.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Tractor extends Vehiculo {
    private boolean agricola;
    private String tipoCombustible;
        //
    public Tractor(String marca, String modelo, int año, String color, boolean agricola, String tipoCombustible){
        super(marca, modelo, año, color);
        this.agricola = agricola;
        this.tipoCombustible = tipoCombustible;
    }
        //Atributos: para saber si el tractor es o no agricola.
    public boolean isAgricola(){
        return agricola;
    }
    public void setAgricola(boolean agricola){
        this.agricola = agricola;
    }
        //Atributos: del tipo de combustible que el tractor usa.
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
        //Función que muestra los datos del tractor.
    public void mostrarDatos(){
        System.out.println("---Tractor---" + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() +
                           "\n Año: "+ getAño() + "\n Color: " + getColor() +
                           "\n Agricola: " + (agricola ? "Si" : "No") + "\n Tipo de combustible: " + tipoCombustible);
    }
}