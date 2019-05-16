package br.com.uniagro.componentesbasicos;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoProduto = (TextInputEditText) findViewById(R.id.etNomeProduto);
        resultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void btEnviar(View view){

        //Recupera o que está dento do campo produto na TextView recupera como toString
        String nomeProduto = campoProduto.getText().toString();
        resultado.setText(nomeProduto);

    }
}
