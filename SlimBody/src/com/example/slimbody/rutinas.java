package com.example.slimbody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.graphics.Color;

public class rutinas extends Activity {
	
	private Button pecho;
	private Button espalda;
	private Button bicep;
	private Button tricep;
	private Button hombro;
	private Button pierna;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rutinas_main);
		
		this.pecho  = (Button) findViewById(R.id.pecho);
		this.espalda  = (Button) findViewById(R.id.espalda);
		this.bicep  = (Button) findViewById(R.id.bisep);
		this.tricep  = (Button) findViewById(R.id.trisep);
		this.hombro  = (Button) findViewById(R.id.hombro);
		this.pierna  = (Button) findViewById(R.id.pierna);
		
	    pecho.setBackgroundColor(Color.BLUE);
	    espalda.setBackgroundColor(Color.BLUE);
	    bicep.setBackgroundColor(Color.BLUE);
	    tricep.setBackgroundColor(Color.BLUE);
	    hombro.setBackgroundColor(Color.BLUE);
	    pierna.setBackgroundColor(Color.BLUE);
	
	}
	
    public void pecho(View v){
		
		
    	Intent pecho = new Intent(rutinas.this,pecho.class);
    	startActivity(pecho);
    
   
    }
    
    public void espalda(View v){
		
		
    	Intent espalda = new Intent(rutinas.this,espalda.class);
    	startActivity(espalda);
    
   
    }
    
    public void bicep(View v){
		
		
        Intent bicep = new Intent(rutinas.this,biceps.class);
    	startActivity(bicep);
    
   
    }  
    
	public void tricep(View v){
			
			
	    	Intent tricep = new Intent(rutinas.this,triceps.class);
	    	startActivity(tricep);
	    
	   
	    }  
	
	public void hombro(View v){
		
		
    	Intent hombro = new Intent(rutinas.this,hombro.class);
    	startActivity(hombro);
    
   
    }  
	
	public void pierna(View v){
		
		
    	Intent pierna = new Intent(rutinas.this,pierna.class);
    	startActivity(pierna);
    
   
    }  
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}