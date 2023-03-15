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
        Intent i = getIntent();
        String texto = i.getStringExtra("texto");
        TextView tvExibir = findViewById(R.id.tvExibir);
        tvExibir.setText(texto);
    }
}