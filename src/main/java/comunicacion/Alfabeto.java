package comunicacion;

import java.util.StringJoiner;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;

	public Alfabeto(String origen,String[] letras,String interpretacion) {
		super(origen);
		this.setLetras(letras);
		this.setInterpretacion(interpretacion);
		// TODO Auto-generated constructor stub
	}
	public int cantidadLetras() {
		return this.letras.length;
		
	}
	

	@Override
	String interpretacion() {
		return this.getInterpretacion();
	}

	@Override
	public String toString() {
		StringJoiner al=new StringJoiner(", ");
		for(int i=0;i<letras.length;i++) {
			al.add(letras[i]);
		}
		String alfabeto=al.toString();
		return alfabeto;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
