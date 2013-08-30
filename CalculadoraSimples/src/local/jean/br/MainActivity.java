package local.jean.br;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void adicionarNumero(View view) {
	    String numero = ((TextView) view).getText().toString();
	    TextView resultado = (TextView) findViewById(R.id.resultado);
	    resultado.setText(resultado.getText() + numero);
	}

}
