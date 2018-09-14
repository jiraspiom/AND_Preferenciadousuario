package br.com.example.alalgi.preferenciadousuario;

import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonSalvar;
    private TextInputEditText editNome;
    private TextView textResultado;
    private final static String ARQUIVO_PREFRENCIA = "Arquivo preferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSalvar = findViewById(R.id.buttonSalvar);
        editNome = findViewById(R.id.textInputNome);
        textResultado = findViewById(R.id.textInputNome);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFRENCIA, 0);
                SharedPreferences.Editor editor = preferences.edit();

                if(editNome.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Preencha o campo nome", Toast.LENGTH_SHORT).show();

                }else{
                    String nome = editNome.getText().toString();
                    editor.commit();
                }

            }
        });

    }
}
