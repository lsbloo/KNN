package KNN.ia;

/**
 * 
 * @author osvaldoairon
 * --> Teste.csv;
 */
public class Validator {
	
	
	private Double sepallength;
	
	private Double sepalwidth;
	
	private Double petalwidth;
	
	private Double petallength;

	public Double getSepallength() {
		return sepallength;
	}

	public void setSepallength(Double sepallength) {
		this.sepallength = sepallength;
	}

	public Double getSepalwidth() {
		return sepalwidth;
	}

	public void setSepalwidth(Double sepalwidth) {
		this.sepalwidth = sepalwidth;
	}

	public Double getPetalwidth() {
		return petalwidth;
	}

	public void setPetalwidth(Double petalwidth) {
		this.petalwidth = petalwidth;
	}

	public Double getPetallength() {
		return petallength;
	}

	public void setPetallength(Double petallength) {
		this.petallength = petallength;
	}
	
	public Validator(Double sepallength , Double sepalwidth , Double petalwidth , Double petallength  ) {
		setSepallength(sepallength);
		setSepalwidth(sepalwidth);
		setPetalwidth(petalwidth);
		setPetallength(petallength);
	}

}
