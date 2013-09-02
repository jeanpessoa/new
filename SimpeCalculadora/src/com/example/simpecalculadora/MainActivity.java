package com.example.simpecalculadora;

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
		
		//iniviar botões auxiliares
		
		Button btLimpar = (Button) findViewById(R.id.limpar);
		
		//função clicar
		
				
		btZero.setOnClickListener(new OnClickListener() {
			
			TextView Visor = (TextView) findViewById(R.id.visor);

			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Zero Clicado", Toast.LENGTH_SHORT).show();
				
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText(StringVisor);
				else{
				StringVisor += "0";
				Visor.setText(StringVisor);
				}
				//Toast.makeText(MainActivity.this, StringVisor, Toast.LENGTH_SHORT).show();
			}
		});
	
		btUm.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Um Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("1");
				else{
				StringVisor += "1";
				Visor.setText(StringVisor);
				}
			}
		});
		
		btDois.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Dois Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("2");
				else{
				StringVisor += "2";
				Visor.setText(StringVisor);
				}
			}
		});
		
		btTres.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Tres Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("3");
				else{
				StringVisor += "3";
				Visor.setText(StringVisor);
				}
			}
		});
		
		btQuatro.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Quatro Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("4");
				else{
				StringVisor += "4";
				Visor.setText(StringVisor);
				}
				
				
				
			}
		});
		
		btCinco.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Cinco Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("5");
				else{
				StringVisor += "5";
				Visor.setText(StringVisor);
				}
			}
		});
		
		btSeis.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Seis Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("6");
				else{
				StringVisor += "6";
				Visor.setText(StringVisor);
				}
			}
		});
		
		btSete.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Sete Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("7");
				else{
				StringVisor += "7";
				Visor.setText(StringVisor);
				}
			}
		});
		
		btOito.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Oito Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("8");
				else{
				StringVisor += "8";
				Visor.setText(StringVisor);
				}
			}
		});
		
		btNove.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Nove Clicado", Toast.LENGTH_SHORT).show();
				String StringVisor;
				StringVisor = Visor.getText().toString();
				if (StringVisor == "0")
					Visor.setText("9");
				else{
				StringVisor += "9";
				Visor.setText(StringVisor);
				}
			}
		});
		
	
		//operações
		btSoma.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Operação Soma", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		btSubtracao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Operação Subtracao", Toast.LENGTH_SHORT).show();
				
			}
		});

		btMultiplicacao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Operação Multiplicacao", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		btDivisao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Operação Divisao", Toast.LENGTH_SHORT).show();
				
			}
		});

		btIgualdade.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "Operação Igualdade", Toast.LENGTH_SHORT).show();
				
			}
		});
		btLimpar.setOnClickListener(new OnClickListener() {
			TextView Visor = (TextView) findViewById(R.id.visor);
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Limpar pressionado", Toast.LENGTH_SHORT).show();
				Visor.setText("0");
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
