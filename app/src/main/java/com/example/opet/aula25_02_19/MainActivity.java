package com.example.opet.aula25_02_19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }

    public void onClick(View view){

        String texto = editText.getText().toString();
        texto = texto.toUpperCase();
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();

    }

    public void onNavegar(View view) {
        Intent novaTela = new Intent(MainActivity.this, DashBoardActivity.class);
        startActivity(novaTela);

    }
}
