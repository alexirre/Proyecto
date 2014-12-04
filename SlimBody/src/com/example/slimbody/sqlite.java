package com.example.slimbody;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.graphics.Color;

public class sqlite extends SQLiteOpenHelper {
	

	
	
	public sqlite(Context context, String name, CursorFactory factory,
			int version) {
		super(context, "rutinas", factory, version);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
		db.execSQL("CREATE TABLE Pecho(ID int, Ejercicio varchar(40), Series int, Repeticiones varchar(40) )");
		db.execSQL("CREATE TABLE Espalda(ID int, Ejercicio varchar(40), Series int, Repeticiones varchar(40)  )");
		db.execSQL("CREATE TABLE Biceps(ID int, Ejercicio varchar(40), Series int, Repeticiones varchar(40)  )");
		db.execSQL("CREATE TABLE Triceps(ID int, Ejercicio varchar(40), Series int, Repeticiones varchar(40)  )");
		db.execSQL("CREATE TABLE Hombro(ID int, Ejercicio varchar(40), Series int, Repeticiones varchar(40)  )");
		db.execSQL("CREATE TABLE Pierna(ID int, Ejercicio varchar(40), Series int, Repeticiones varchar(40)  )");
		
		db.execSQL("Insert into Pecho values('1','Plano con barra','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pecho values('2','Plano con barra inclinado','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pecho values('3','Cristos','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pecho values('4','Press de barra en maquina','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pecho values('5','Pullover','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pecho values('6','Cuerda','4','Ligero - 10, Medio - 8, Pesado 6')");
		
		db.execSQL("Insert into Espalda values('1','Remo','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Espalda values('2','Dominadas','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Espalda values('3','Polea al pecho','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Espalda values('4','Polea tras nuca','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Espalda values('5','Espalda baja','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Espalda values('6','Peso muerto','4','Ligero - 10, Medio - 8, Pesado 6')");
		
		db.execSQL("Insert into Biceps values('1','Maquina','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Biceps values('2','Barra','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Biceps values('3','Mancuernas','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Biceps values('4','Concentrado','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Biceps values('5','Hercules','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Biceps values('6','21 en polea','4','Ligero - 10, Medio - 8, Pesado 6')");
		
		db.execSQL("Insert into Triceps values('1','Maquina','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Triceps values('2','Copa','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Triceps values('3','Soga','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Triceps values('4','Fondos','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Triceps values('5','Press frances','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Triceps values('6','Jalon','4','Ligero - 10, Medio - 8, Pesado 6')");
		
		db.execSQL("Insert into Hombro values('1','Elevacion al frente con mancuerna','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Hombro values('2','Elevacion con barra tras nuca','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Hombro values('3','Elevaciones laterales en maquina','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Hombro values('4','Frontal con mancuerna','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Hombro values('5','Elevaciones frontales alternadas','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Hombro values('6','Maquina','4','Ligero - 10, Medio - 8, Pesado 6')");
		
		db.execSQL("Insert into Pierna values('1','Pantorrilla','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pierna values('2','Peso muerto','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pierna values('3','Gluteo','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pierna values('4','Sentadillas','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pierna values('5','Extensiones','4','Ligero - 10, Medio - 8, Pesado 6')");
		db.execSQL("Insert into Pierna values('6','Hack','4','Ligero - 10, Medio - 8, Pesado 6')");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

	
	
  

}