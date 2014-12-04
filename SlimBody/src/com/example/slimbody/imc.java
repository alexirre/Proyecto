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

public class imc extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imc_main);              
        
        Button btnCalcular = (Button) findViewById(R.id.calcular);
        
	}
    public void calcular(View v) {
    	
			EditText peso = (EditText) findViewById(R.id.peso);
		    EditText altura = (EditText) findViewById(R.id.altura);
		    TextView resultado = (TextView) findViewById(R.id.resultado);
					       
			String stringpeso = peso.getText().toString();	    
			String stringaltura = altura.getText().toString();	
			
			float valorpeso = Float.parseFloat(stringpeso);
			float valoraltura = Float.parseFloat(stringaltura)/100;
			float imc = valorpeso / (valoraltura * valoraltura);
			resultado.setText(""+imc);
			
			if (imc < 18.5){
				Toast.makeText(getApplicationContext(), "Delgado", Toast.LENGTH_SHORT).show();
			}
			if (imc >= 18.5 && imc <= 24.9){
				Toast.makeText(getApplicationContext(), "Peso Normal", Toast.LENGTH_SHORT).show();
			}
			if (imc >= 25 && imc <= 29.9){
				Toast.makeText(getApplicationContext(), "Sobrepeso", Toast.LENGTH_SHORT).show();
			}
			if (imc >= 30 && imc <= 34.9){
				Toast.makeText(getApplicationContext(), "Obesidad", Toast.LENGTH_SHORT).show();
			}
			if (imc >= 35 && imc <= 39.9){
				Toast.makeText(getApplicationContext(), "Obesidad Grave", Toast.LENGTH_SHORT).show();
			}
			if (imc >= 40){
				Toast.makeText(getApplicationContext(), "Obesidad Morbida", Toast.LENGTH_SHORT).show();
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
