package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //inserindo o menu na barra de aplicativos
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.exemplo, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //Criando método para clicar nos itens do menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mCadastrar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mComsultar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Comsultar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mALterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no ALterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mDinheiro:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Dinheiro",
                        Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}