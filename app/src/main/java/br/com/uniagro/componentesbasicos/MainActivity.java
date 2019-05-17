package br.com.uniagro.componentesbasicos;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView resultado;
    private CheckBox cbBranco,cbVerde,cbVermelho;
    List<String> check = new ArrayList<String>(); //Criando uma lista chamada check
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextViews
        campoProduto = (TextInputEditText) findViewById(R.id.etNomeProduto);
        resultado = (TextView) findViewById(R.id.tvResultado);

        //CheckBox
        cbBranco = (CheckBox) findViewById(R.id.cbBranco);
        cbVerde = (CheckBox) findViewById(R.id.cbVerde);
        cbVermelho = (CheckBox) findViewById(R.id.cbVermelho);

        //RadioGroup
        rgEstoque = (RadioGroup) findViewById(R.id.rgEstoque);
        verificaRadioButton();


    }

    public void verificaCheck(){

        check.clear();//Vai limpar a lista sempre que o método verificaCheck for chamado

        // isChecked Verifica se o CheckBox está selecionado
       if(cbBranco.isChecked()){
           check.add(cbBranco.getText().toString());//Pega o texto que se encontra dento de cbBranco
       }
       if(cbVerde.isChecked()){
           check.add(cbVerde.getText().toString());//Pega o texto que se encontra dento de cbVerde
       }
       if(cbVermelho.isChecked()){
           check.add(cbVermelho.getText().toString());//Pega o texto que se encontra dento de cbVermelho
       }
       resultado.setText(check.toString());//toString convert a lista check para string
    }

    public void verificaRadioButton(){

        //Adiciona um evento que escuta o que esta acontecendo e vai verificar se um so itens dentro do RadioGroup foi selecionado e qual item foi
        rgEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //Recupera o valor do rbSim para comparar com o valor int checkedId
                if(checkedId == R.id.rbSim){
                    resultado.setText("Sim");
                }else{
                    resultado.setText("Não");
                }
            }
        });


    }

    public void btEnviar(View view){

        /*
        //Recupera o que está dento do campo produto na TextView recupera como toString
        String nomeProduto = campoProduto.getText().toString();
        resultado.setText(nomeProduto);
        */
        //verificaCheck();


    }
}
