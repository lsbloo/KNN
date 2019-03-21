package KNN.ia;


import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import KNN.ia.Flor;
import com.opencsv.*;
public class CSVR {
	
	private FileReader file;
	private List<Flor> list_csv_flor = new ArrayList<Flor>();
	private List<Validator> list_csv_validator = new ArrayList<Validator>();
	
	
	
	public CSVR() {
		
	}
	public List<Flor> getInformationsFlor(
			String pathCSV) throws IOException{
		
		file = new FileReader(pathCSV);
		
		@SuppressWarnings("deprecation")
		CSVReader leitor = new CSVReader(file,',');
		
		String[] leitorLinhas;
		if(leitor!=null) {
			System.err.println("leitor ok");
			
		Double sepallength=0.0; //0
		Double sepalwidth=0.0; // 1
		Double petalwidth=0.0; // 2
		Double petallength=0.0; // 3
		Double label=0.0;// 
		while((leitorLinhas=leitor.readNext()) != null) {
			if(!leitorLinhas[0].equals("sepallength")) {
				sepallength =Double.parseDouble(leitorLinhas[0]);
			}if(!leitorLinhas[1].equals("sepalwidth")) {
				sepalwidth = Double.parseDouble(leitorLinhas[1]);
			}if(!leitorLinhas[2].equals("petallength")) {
				petalwidth = Double.parseDouble(leitorLinhas[2]);
			}if(!leitorLinhas[3].equals("petalwidth")) {
				petallength = Double.parseDouble(leitorLinhas[3]);
			}if(!leitorLinhas[4].equals("label")) {
				label = Double.parseDouble(leitorLinhas[4]);
			}
			Flor f = new Flor(sepallength,sepalwidth,petalwidth,petallength,label);
			list_csv_flor.add(f);
		}
		
		}
		else {
			System.err.println("error leitor CSV");
		}
		this.list_csv_flor.remove(0);
		
		return this.list_csv_flor;
		
		
	}
	
	
	public List<Validator> getInformationsValidator(String pathCSV) throws IOException {
		
		file = new FileReader(pathCSV);
		
		@SuppressWarnings("deprecation")
		CSVReader leitor = new CSVReader(file,',');
		
		String[] leitorLinhas;
		if(leitor!=null) {
			System.err.println("leitor ok");
			
		Double sepallength=0.0; //0
		Double sepalwidth=0.0; // 1
		Double petalwidth=0.0; // 2
		Double petallength=0.0; // 3
		while((leitorLinhas=leitor.readNext()) != null) {
			if(!leitorLinhas[0].equals("sepallength")) {
				sepallength =Double.parseDouble(leitorLinhas[0]);
			}if(!leitorLinhas[1].equals("sepalwidth")) {
				sepalwidth = Double.parseDouble(leitorLinhas[1]);
			}if(!leitorLinhas[2].equals("petallength")) {
				petalwidth = Double.parseDouble(leitorLinhas[2]);
			}if(!leitorLinhas[3].equals("petalwidth")) {
				petallength = Double.parseDouble(leitorLinhas[3]);
			}
			Validator v = new Validator(sepallength,sepalwidth,petalwidth,petallength);
			list_csv_validator.add(v);
		}
		}
		else {
			System.err.println("error leitor CSV");
		}
		this.list_csv_validator.remove(0);
		return this.list_csv_validator;
		
		
	}
	
	
	

}
