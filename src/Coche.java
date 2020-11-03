
public class Coche {
	private String modelo, marca, matricula, averia;

	private int potencia;

	public Coche(String modelo, int potencia, String marca, String matricula, String averia) {
		super();
		this.modelo = modelo;
		this.potencia = potencia;
		this.marca = marca;
		this.matricula = matricula;
		this.averia = averia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAveria() {
		return averia;
	}

	public void setAveria(String averia) {
		this.averia = averia;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", potencia=" + potencia + ", marca=" + marca + ", matricula=" + matricula
				+ ", averia=" + averia + "]";
	}

}
