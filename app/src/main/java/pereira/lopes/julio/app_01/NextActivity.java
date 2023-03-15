package pereira.lopes.julio.app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //Recebe a intent da Activity anterior
        Intent i = getIntent();

        //Texto
        String texto = i.getStringExtra("texto");

        //Pega o id do campo para exibir o texto
        TextView tvExibir = findViewById(R.id.tvExibir);

        //Define o texto a ser definido
        tvExibir.setText(texto);

    }
}