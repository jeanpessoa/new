package com.example.simpecalculadora;

import android.widget.TextView;

import android.app.Activity;


public class BtOperacao extends Activity{
	public int Operacao(String operador, int acumulador){
		int x;
		TextView y = (TextView) findViewById(R.id.visor);
		x = Integer.parseInt(y.getText().toString());
		
		if (operador == "+"){
			x = x + acumulador;
		}
		else if(operador == "-"){
			x = x - acumulador;
		}
		else if(operador == "*"){
			x = x * acumulador;
		}
		else if(operador == "/"){
			x = x / acumulador;
		}
		return x;
	}

}
