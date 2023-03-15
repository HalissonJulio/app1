package pereira.lopes.julio.app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    //Método de selecionar o texto no evento de clique
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //Seleciona o o layout da pasta resources

        setContentView(R.layout.activity_main);
        //Cria o botão 'btnEnviar'
        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                //Retira o texto da variável 'etDigiteAqui' e converte para o tipo string
                String texto = etDigiteAqui.getText().toString();

                //Cria um Intent que serve para ativar a proxima Activity
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                intent.putExtra("texto", texto);

                //Roda o Intent e troca de Activity
                startActivity(intent);
            }
        });
    }
}