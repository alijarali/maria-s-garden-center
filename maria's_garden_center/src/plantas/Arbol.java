package plantas;

import otros.Informacion;

import tipos.TpHoja;

public class Arbol extends Planta implements Informacion{
	/**
	 * Creaci�n de los atributos de �rbol : 
	 * - Fruta
	 * - diamBase
	 */
	private String fruta;
	private Integer diamBase;
	private TpEpo epoca;
	
	/**
	 * Creaci�n de los constructores.
	 * @param fruta
	 * @param diamBase
	 */
	public Arbol() {
		super();
	}
	
	public Arbol(String codigo,TpHoja tipoHoja, Integer altura, String fruta, Integer diamBase) {
		super(codigo,tipoHoja, altura);
		this.fruta = fruta;
		this.diamBase = diamBase;
	}
	
	public Arbol(String codigo,TpHoja tipoHoja, Integer altura, String fruta, Integer diamBase, TpEpo epoca) {
		super(codigo,tipoHoja, altura);
		this.fruta = fruta;
		this.diamBase = diamBase;
		this.epoca=epoca;
	}
	
	/**
	 * Creaci�n de los getters y setters de cada uno de los objetos de abono.
	 * @return
	 */
	public String getFruta() {
		return fruta;
	}
	public void setFruta(String fruta) {
		this.fruta = fruta;
	}
	public Integer getDiamBase() {
		return diamBase;
	}
	public void setDiamBase(Integer diamBase) {
		this.diamBase = diamBase;
	}
	/**
	 * Creaci�n del m�todo Java toString.
	 */
	
	
	@Override
	public Integer getAltura() {
		
		return this.getAltura();
	}
	@Override
	public TpEpo getEpoca() {

		return epoca;
	}

	@Override
	public void setEpoca(TpEpo epoca) {
		this.epoca=epoca;
}

	@Override
	public String toString() {
		return "Arbol [fruta=" + fruta + ", diamBase=" + diamBase + ", epoca=" + epoca + ", getTipoHoja()="
				+ getTipoHoja() + ", getCodigo()=" + getCodigo() + "]";
	}
	
	
	
}
