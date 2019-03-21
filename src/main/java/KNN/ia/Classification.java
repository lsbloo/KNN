package KNN.ia;
import java.util.List;

public class Classification {
	
	private static final String TYPE_0 = "0";
	private static final String TYPE_1 = "1";
	private static final String TYPE_2 = "2";
	
	
	public String getResult(List<Double> list) {
		int cont_type_0 =0;
		int cont_type_1 =0;
		int cont_type_2 =0;
		for(Double y : list) {
			if(y == 0.0) {
				cont_type_0++;
			}else if( y == 1.0) {
				cont_type_1++;
			}
			else{
				cont_type_2++;
			}
		}
		if((cont_type_0 > cont_type_1)){
				return TYPE_0;
		}
		if(cont_type_0 > cont_type_2) {
			return TYPE_0;
		}
		if(cont_type_1 > cont_type_0) {
			return TYPE_1;
		}
		if(cont_type_1 > cont_type_2) {
			return TYPE_1;
		}
		if(cont_type_2 > cont_type_0) {
			return TYPE_2;
		}
		if(cont_type_1 > cont_type_1) {
			return TYPE_2;
		}
		
		
		return null;
	}
	
	

}
