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

public class MainActivity extends Activity {
	
	private ImageButton btnIMC;
	private ImageButton btnCalorias;
	private ImageButton btnRutinas;
	
	private TextView MasaCorporal;
	private TextView Calorias;
	private TextView Rutinas;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.btnIMC  = (ImageButton) findViewById(R.id.bascula);
		this.btnCalorias  = (ImageButton) findViewById(R.id.calorias);
		this.btnRutinas  = (ImageButton) findViewById(R.id.rutinas);
		
	    btnIMC.setBackgroundColor(Color.WHITE);
		btnCalorias.setBackgroundColor(Color.WHITE);
		btnRutinas.setBackgroundColor(Color.WHITE);
		
		this.MasaCorporal  = (TextView) findViewById(R.id.masacorporal);
		this.Calorias  = (TextView) findViewById(R.id.ingestacalorica);
		this.Rutinas  = (TextView) findViewById(R.id.ruti);
		
		MasaCorporal.setTextColor(Color.RED);
		Calorias.setTextColor(Color.RED);
		Rutinas.setTextColor(Color.RED);
	}
	
    public void imc(View v){
		
		
    	Intent imc = new Intent(MainActivity.this,imc.class);
    	startActivity(imc);
    
   
    }
    
    public void ingestacalorica(View v){
		
		
    	Intent ingestacalorica = new Intent(MainActivity.this,ingestacalorica.class);
    	startActivity(ingestacalorica);
    
   
    }
    
    public void rutinas(View v){
		
		
    	Intent rutinas = new Intent(MainActivity.this,rutinas.class);
    	startActivity(rutinas);
    
   
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
