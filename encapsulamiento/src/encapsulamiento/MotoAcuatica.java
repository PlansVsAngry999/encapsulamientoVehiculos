package encapsulamiento;
/**
  * Clase de una 'Moto acuatica'; hereda atributos del vehiculo.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class MotoAcuatica extends Vehiculo{
    private String tipoCombustible;
    private boolean chorroAgua;
        //
    public MotoAcuatica(String marca, String modelo, int año, String color, String tipoCombustible, boolean chorroAgua){
        super(marca, modelo, año, color);
        this.tipoCombustible = tipoCombustible;
        this.chorroAgua = chorroAgua;
    }
        //Atributos: del tipo de combustible que usa la moto acuática.
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }
        //Atributos: para saber si tiene o no chorro de agua.
    public boolean getChorroAgua(){
        return chorroAgua;
    }
    public void setChorroAgua(boolean chorroAgua){
        this.chorroAgua = chorroAgua;
    }
    public void mostrarDatos(){
    System.out.println("---Moto Acuática---" + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() +
                           "\n Año: "+ getAño() + "\n Color: " + getColor() +
                           "\n Tipo de combustible: " + tipoCombustible + "\n Chorro de agua: " + (chorroAgua ? "Si" : "No"));
    }
}
