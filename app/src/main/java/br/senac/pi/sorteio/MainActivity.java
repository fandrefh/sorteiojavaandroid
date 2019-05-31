package br.senac.pi.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escolherNumero(View view) {
        TextView txtExibirNumeroEscolhido = findViewById(R.id.txtExibirNumeroEscolhido);
        EditText edtNumeroUsuario = findViewById(R.id.edtNumeroUsuario);
        int escolhaUsuario = Integer.parseInt(edtNumeroUsuario.getText().toString());
        Random random = new Random();
        int numeroEscolhido = random.nextInt(11);
        if (escolhaUsuario == numeroEscolhido) {
            txtExibirNumeroEscolhido.setText("Parabéns, você acertou!!!");
        } else {
            txtExibirNumeroEscolhido.setText("Você perdeu. O número sorteado foi: " + numeroEscolhido);
        }
    }
}
