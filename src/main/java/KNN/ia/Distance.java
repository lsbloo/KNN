package KNN.ia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Distance {
	
	private Validator validator;
	
	private Map<Flor,Double> mapDistances;
	
	public Distance() {
		this.mapDistances = new HashMap<Flor,Double>();
	}
	
	private Flor[] flor;
	
	private Double[] distancesx;
	
	
	private List<Double> distancesForValidator;


	public Validator getValidator() {
		return validator;
	}


	public void setValidator(Validator validator) {
		this.validator = validator;
	}


	public List<Double> getDistancesForValidator() {
		return distancesForValidator;
	}


	public void setDistancesForValidator(List<Double> distancesForValidator) {
		this.distancesForValidator = distancesForValidator;
	}


	public Map<Flor,Double> getMapDistances() {
		return mapDistances;
	}


	public void setMapDistances(Map<Flor,Double> mapDistances) {
		this.mapDistances = mapDistances;
	}


	public Double[] getDistancesx() {
		return distancesx;
	}


	public void setDistancesx(Double[] distances) {
		this.distancesx = distances;
	}


	public Flor[] getFlor() {
		return flor;
	}


	public void setFlor(Flor[] flor) {
		this.flor = flor;
	}
	public List<Flor> getList_flor() {
		return list_flor;
	}


	public void setList_flor(List<Flor> list_flor) {
		this.list_flor = list_flor;
	}

	private List<Flor> list_flor;



	

}
