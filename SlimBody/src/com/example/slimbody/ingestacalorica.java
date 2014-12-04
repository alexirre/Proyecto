package com.example.slimbody;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ingestacalorica extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingestacalorica_main);              
        
        Button btnCalcular = (Button) findViewById(R.id.calcularingesta);
        
	}
    public void calcularingesta(View v) {
    	    
    	    EditText sexo = (EditText) findViewById(R.id.sexo);
	        EditText edad = (EditText) findViewById(R.id.edad);
			EditText peso = (EditText) findViewById(R.id.pesoingesta);
		    EditText altura = (EditText) findViewById(R.id.alturaingesta);
		    TextView resultado = (TextView) findViewById(R.id.resultadodiario);
			
		    String stringsexo = sexo.getText().toString();
		    String stringedad = edad.getText().toString();
			String stringpeso = peso.getText().toString();	    
			String stringaltura = altura.getText().toString();	
			
			int valoredad = Integer.parseInt(stringedad);
			float valorpeso = Float.parseFloat(stringpeso);
			float valoraltura = Float.parseFloat(stringaltura);
			
			if(stringsexo.equals("hombre")){
				//(10 x peso en kg) + (6.25 x altura en cm) - (5 x edad) +5 
				float rpeso = 10 * valorpeso;
				float raltura = (float)(6.25 * valoraltura);
				int redad = (5 * valoredad);
				float ingestahombre = rpeso + raltura - redad + 5;
				
				resultado.setText(""+ingestahombre);
				
		    }else if(stringsexo.equals("mujer")){
		    	//(10 x peso en kg) + (6.25 x altura en cm) - (5 x edad) -161 
		    	float rpeso = 10 * valorpeso;
				float raltura = (float)(6.25 * valoraltura);
				float redad = (5 * valoredad);
				float ingestamujer = rpeso + raltura - redad - 161;
				
				resultado.setText(""+ingestamujer);
		    	
		    
		    }else {
		    	Toast.makeText(getApplicationContext(), "Ingrese si es hombre o mujer", Toast.LENGTH_SHORT).show();
		    }
                          
                
    }
    
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
