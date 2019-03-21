package KNN.ia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.lang.Math;
public class KNN {
	
	
	private Validator validator;
	private Distance distance;
	private List<Double> list_dist;
	private List<Flor> trainer;
	private Flor[] fws;
	private Double[] distancesxs;

	public KNN(int size1 , int size2) {
		this.fws = new Flor[size1 + 1];
		this.distancesxs = new Double[size1 + 1];
		this.distance =  new Distance();
		this.list_dist = new ArrayList<Double>();
		
	}
	
	public List<Flor> getTrainer() {
		return trainer;
	}

	public void setTrainer(List<Flor> trainer) {
		this.trainer = trainer;
	}

	
	public Validator getValidator() {
		return validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	/**
	 * this method returns the distance between a test data and a training data set. 
	 * associates the distance and the respective 
	 * training data in a map object and returns this my object distance
	 * @param v
	 * @param trainer
	 * @return
	 */
	public Distance getDistance(Validator v , List<Flor> trainer) {
		Double dist=0.0;
		HashMap<Flor, Double> distances_associate = new HashMap<Flor,Double>();
		Double[] validators = {v.getSepallength(), v.getSepalwidth(),v.getPetalwidth(),v.getPetallength()};
	
		int cont=0;
		Double gg = 0.0;
		List<Flor> flores = new ArrayList<Flor>();
		for(Flor f : trainer) {
			cont++;
			Double[] train  = {f.getSepallength(), f.getSepalwidth() , f.getPetalwidth() , f.getPetallength()};
			Double param1 = Math.pow((validators[0] - train[0]) , 2);
			Double param2 = Math.pow((validators[1] - train[1]) , 2);
			Double param3 = Math.pow((validators[2] - train[2]) , 2);
			Double param4 = Math.pow((validators[3] - train[3]), 2);
			gg = param1+param2+param3+param4;
			dist = Math.sqrt((gg));
			distances_associate.put(f, dist);
			fws[cont] = f;
			distancesxs[cont]=dist;
			list_dist.add(dist);
			f.setDistance(dist);
			flores.add(f);
		}
		this.distance.setList_flor(flores);
		this.distance.setFlor(fws);
		this.distance.setDistancesx(distancesxs);
		this.distance.setValidator(v);
	
		
		return this.distance;
	}
	
	/**
	 * 
	 * @param values_dist
	 * @param f
	 * @param d
	 * @return
	 */
	public List<Flor> getTypesForAssociate(List<Double> values_dist, Flor[] f , Double[] d) {
		List<Flor> list_flor = new ArrayList<Flor>();
		List<Integer> list_index_associate = new ArrayList<Integer>();

		Flor[] fw = f;
		Double[] dw = d;
		for(int wp = 0 ; wp < dw.length ; wp++) {
			for(int i = 0 ; i < values_dist.size() ; i++) {
				if(dw[wp] == values_dist.get(i)) {
					list_index_associate.add(wp);
				}
			}
		}
		
		
		for(Integer k : list_index_associate) {
			list_flor.add(fw[k]);
		}
		
		return list_flor;
	}
	
	public List<Double> checkDistancesVector(List<Double> list_vetor){
		Set<Double> du = new TreeSet<Double>(list_vetor); 
		List<Double> mec = new ArrayList<Double>();
		for(Double d : du) {
			
			mec.add(d);
		}
        return mec;
	}
	public List<Flor> checkFlor(List<Flor> f){
		Set<Flor> du = new TreeSet<Flor>(f);
		List<Flor> helper = new ArrayList<Flor>();
		for(Flor u : du) {
			helper.add(u);
		}
		
		return helper;
	}
}
