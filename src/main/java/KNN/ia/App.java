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
    	CSVR n = new CSVR();
    	List<Flor> mec = n.getInformationsFlor("C:\\Users\\osvaldoairon\\Downloads\\knn-pratica\\aprendizagemdemaquina\\treinamento.csv");
    	List<Validator> mec2 = n.getInformationsValidator("C:\\Users\\osvaldoairon\\Downloads\\knn-pratica\\aprendizagemdemaquina\\teste.csv");
    	KNN knn = new KNN(mec.size(),mec2.size());
    	Distance dir = knn.getDistance(mec2.get(0), mec);
    	List<Flor> labels = dir.getList_flor();
    	
    	Collections.sort(labels);
    	
    	
    	for(int i = 0 ; i < K ; i++) {
    		System.err.println(labels.get(i).getLabel() +  " : "  +  labels.get(i).getDistance());
    	}
    
    	
    
    
    }
    
    
    
    
}
