package KNN.ia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 * @author osvaldo.airon
 */
public class App 
{
	/**
	 * value of K teste KNN;
	 */
	private static final int K=3;
	
    public static void main( String[] args ) throws IOException
    {
    	
    	System.err.println("Resultado KNN - \n ");
    	CSVR n = new CSVR();
    	Classification classix = new Classification();
    	List<Flor> mec = n.getInformationsFlor("C:\\Users\\osvaldoairon\\Downloads\\knn-pratica\\aprendizagemdemaquina\\treinamento.csv");
    	List<Validator> mec2 = n.getInformationsValidator("C:\\Users\\osvaldoairon\\Downloads\\knn-pratica\\aprendizagemdemaquina\\teste.csv");
    	KNN knn = new KNN(mec.size(),mec2.size());
    	for(int i = 0 ; i < mec2.size() ; i ++) {
    		Distance dir = knn.getDistance(mec2.get(i), mec);
        	List<Flor> labels = dir.getList_flor();
        	List<Double> classi = new ArrayList<Double>();
        	Collections.sort(labels);
        	for(int j = 0 ; j < K ; j ++) {
        		classi.add(labels.get(j).getLabel());
        		
        	}
        	System.err.println(classix.getResult(classi));
    	}
    	
    	
    }
    
    
    
    
}
