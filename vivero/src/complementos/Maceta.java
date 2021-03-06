package complementos;
/**
	 * Clase para crear los objetos tipo "Maceta"
	 *
	 */
public class Maceta extends Complemento {
	
	private Integer capacidad;
	private Integer altura;	
	
	public Maceta() {
		super();
	}
	public Maceta(String codigo, Integer pesoMaximo, String proveedor, Integer capacidad, Integer altura) {
		super(codigo, pesoMaximo, proveedor);
		this.capacidad = capacidad;
		this.altura = altura;
	}
	
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		//String codigo, Integer pesoMaximo, String proveedor, Integer capacidad, Integer altura
		return "Maceta ["+" C�digo: " + getCodigo() + ", Peso M�ximo: " + getPesoMaximo()+
				", Proveedor: " + getProveedor()+", Capacidad: " + capacidad + ", Altura: " + altura +  "]";
	}
}
