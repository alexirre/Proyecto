package com.example.slimbody;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class biceps extends Activity {
	
	private ImageButton consultar;
	private TextView series,repe;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.biceps_main);
		
		this.consultar  = (ImageButton) findViewById(R.id.consultar);
		
		
		
		
		ArrayList<ejercicio> ejercicios = new ArrayList<ejercicio>();
		try {
			
			sqlite con = new sqlite(this,"rutinas",null,1);
			SQLiteDatabase db = con.getReadableDatabase();
			Cursor rs = db.rawQuery("select * from Biceps", null);
			ejercicio obj;
		    while(rs.moveToNext()){
		    	obj = new ejercicio();
		    	obj.setID(rs.getInt(0));
		    	obj.setEjercicio(rs.getString(1));
		    	obj.setSeries(rs.getString(2));
		    	obj.setRepeticiones(rs.getString(3));
		    	ejercicios.add(obj);
		    	
		    }
		    db.close();
		} catch (Exception e){
			
		}
		
		
		
	    Spinner pecho = (Spinner) findViewById(R.id.mostrar);
	    
		
		ArrayAdapter<ejercicio> adaptador = new ArrayAdapter<ejercicio> (this, android.R.layout.simple_list_item_1, ejercicios);
			
		pecho.setAdapter(adaptador);
	
		
		
	
	}
	
	 public void consultar(View v){
		 
		 series=(TextView)findViewById(R.id.series);
		 repe=(TextView)findViewById(R.id.repeticiones);
		
		series.setText(""+"4");
		repe.setText(""+"Ligero - 10, Medio - 8, Pesado - 6");
	   
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