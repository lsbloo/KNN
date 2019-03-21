package KNN.ia;

public class Flor implements Comparable<Flor>{
	
	private Double sepallength;
	
	private Double sepalwidth;
	
	private Double petalwidth;
	
	private Double petallength;
	
	
	private Double label;

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

	public Double getLabel() {
		return label;
	}

	public void setLabel(Double label) {
		this.label = label;
	}

	public Flor(Double sepallength ,Double sepalwidth ,Double petalwidth , Double petalLenght, Double label  ) {
		setSepallength(sepallength);
		setSepalwidth(sepalwidth);
		setPetalwidth(petalwidth);
		setPetallength(petalLenght);
		setLabel(label);
		
	}

	public Double getPetallength() {
		return petallength;
	}

	public void setPetallength(Double petallength) {
		this.petallength = petallength;
	}
	
	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}
	

	private Double distance;

	public int compareTo(Flor o) {
		// TODO Auto-generated method stub
	
		return this.getDistance() < o.getDistance() ? -1 : this.getDistance() == o.getDistance() ? 0 : 1;
	}
}
