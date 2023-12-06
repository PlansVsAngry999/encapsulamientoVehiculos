package encapsulamiento;
/**
 * Clase que declara los atributos de un vehiculo.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;
        //
    public Vehiculo(String marca, String modelo, int año, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }
        //Atributos de la marca del vehiculo.
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
        //Atributos: del modelo del vehiculo.
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
        //Atributos: del año del vehiculo.
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }
        //Atributos: del color del vehiculo.
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
