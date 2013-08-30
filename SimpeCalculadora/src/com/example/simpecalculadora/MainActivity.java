package com.example.simpecalculadora;

import com.example.simpecalculadora.R.string;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView Visor = (TextView) findViewById(R.id.visor);
		Visor.setBackgroundColor(33);
		
		String StringVisor = "0";
		Visor.setText(StringVisor);
		
		//iniciar numeros
		Button btZero = (Button) findViewById(R.id.zero);
		Button btUm = (Button) findViewById(R.id.um);
		Button btDois = (Button) findViewById(R.id.dois);
		Button btTres = (Button) findViewById(R.id.tres);
		Button btQuatro = (Button) findViewById(R.id.quatro);
		Button btCinco = (Button) findViewById(R.id.cinco);
		Button btSeis = (Button) findViewById(R.id.seis);
		Button btSete = (Button) findViewById(R.id.sete);
		Button btOito = (Button) findViewById(R.id.oito);
		Button btNove = (Button) findViewById(R.id.nove);
		
		//iniciar operações
		Button btSoma = (Button) findViewById(R.id.soma);
		Button btSubtracao = (Button) findViewById(R.id.subtrair);
		Button btMultiplicacao = (Button) findViewById(R.id.multiplicar);
		Button btDivisao = (Button) findViewById(R.id.divisao);
		Button btIgualdade = (Button) findViewById(R.id.igualar);
		
		//função clicar
		
				
		btZero.setOnClickListener(new OnClickListener() {
			
			TextView Visor = (TextView) findViewById(R.id.visor);

			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Zero Clicado", Toast.LENGTH_LONG).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				StringVisor += "0";
				Toast.makeText(MainActivity.this, StringVisor, Toast.LENGTH_LONG).show();
			}
		});
	
		btUm.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Um Clicado", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btDois.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Dois Clicado", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btTres.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Tres Clicado", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btQuatro.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Quatro Clicado", Toast.LENGTH_LONG).show();
				String StringVisor = "4";
				
				
				
			}
		});
		
		btCinco.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Cinco Clicado", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btSeis.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Seis Clicado", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btSete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Sete Clicado", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btOito.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Oito Clicado", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btNove.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Nove Clicado", Toast.LENGTH_LONG).show();
				
			}
		});
		
	
		//operações
		btSoma.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Operação Soma", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btSubtracao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Operação Subtracao", Toast.LENGTH_LONG).show();
				
			}
		});

		btMultiplicacao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Operação Multiplicacao", Toast.LENGTH_LONG).show();
				
			}
		});
		
		btDivisao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Operação Divisao", Toast.LENGTH_LONG).show();
				
			}
		});

		btIgualdade.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Operação Igualdade", Toast.LENGTH_LONG).show();
				
			}
		});


		//fim
	}
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
