package com.example.slimbody;

public class ejercicio {
	
	private Integer ID;
	private String Ejercicio;
	private String Series;
	private String Repeticiones;
	
	public Integer getID(){
		return ID;
	}
	
	public void setID(Integer id){
	
	ID = id; 
	
	}
	
	public String getEjercicio(){
		return Ejercicio;
	}
	
	public void setEjercicio(String ejercicio){
	
	Ejercicio = ejercicio; 
	
	}
	
	public String getSeries(){
		return Series;
	}
	
	public void setSeries(String series){
	
	Series = series; 
	
	}
	
	public String getRepeticiones(){
		return Repeticiones;
	}
	
	public void setRepeticiones(String repeticiones){
	
	Repeticiones = repeticiones; 
	
	}
	
	public String toString(){
		return Ejercicio;
		
	}
	
	
	
}
