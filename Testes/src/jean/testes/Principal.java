package jean.testes;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends Activity {

	EditText ed1, ed2, res; 
	TextView res2;
	Button btn_soma, btn_subtracao, btn_multiplicacao, btn_divisao, btn_limpar;
	double n1, n2,resultado;
	Integer a, b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		//campos
		ed1 = (EditText) findViewById(R.id.campo1);
		ed2 = (EditText) findViewById(R.id.campo2);
		//res = (EditText) findViewById(R.id.resultado);
		res2 = (TextView) findViewById(R.id.resultado2);
		//ed1.setText("0");
		//ed2.setText("0");
		//botoes
		btn_soma 			= (Button) findViewById(R.id.btn_adicao);
		btn_subtracao 		= (Button) findViewById(R.id.btn_subtracao);
		btn_multiplicacao 	= (Button) findViewById(R.id.btn_multiplicacao);
		btn_divisao 		= (Button) findViewById(R.id.btn_divisao);
		btn_limpar 			= (Button) findViewById(R.id.limpar);
		
		btn_soma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if (ed1.getText().toString().equals("") || ed2.getText().toString().equals(""))
					res2.setText("Numero invalido informado!");
				else{
				n1 = Double.parseDouble(ed1.getText().toString());
				n2 = Double.parseDouble(ed2.getText().toString());
				
				resultado = n1+n2;
				
				//res.setText(String.valueOf(resultado));
				res2.setText(String.valueOf(resultado));
				}
			}
		});
		
		
		btn_subtracao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (ed1.getText().toString().equals("") || ed2.getText().toString().equals(""))
					res2.setText("Numero invalido informado!");
				else{
				n1 = Double.parseDouble(ed1.getText().toString());
				n2 = Double.parseDouble(ed2.getText().toString());
				resultado = n1-n2;
				
				res2.setText(String.valueOf(resultado));
				}
				
			}
		});
		
		
		btn_multiplicacao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (ed1.getText().toString().equals("") || ed2.getText().toString().equals(""))
					res2.setText("Numero invalido informado!");
				else{
				n1 = Double.parseDouble(ed1.getText().toString());
				n2 = Double.parseDouble(ed2.getText().toString());
				resultado = n1*n2;
				
				res2.setText(String.valueOf(resultado));
				
				}
			}
		});
		
		btn_divisao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (ed1.getText().toString().equals("") || ed2.getText().toString().equals(""))
					res2.setText("Numero invalido informado!");
				else{
				n1 = Double.parseDouble(ed1.getText().toString());
				n2 = Double.parseDouble(ed2.getText().toString());
				resultado = n1/n2;
				
				res2.setText(String.valueOf(resultado));
				}
				
			}
		});
		
		btn_limpar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				ed1.setText(null);
				ed2.setText(null);
				res2.setText("Resultado");
				
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

}
