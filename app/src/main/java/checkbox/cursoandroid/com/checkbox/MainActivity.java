package checkbox.cursoandroid.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cavaleiroDoZodiaco;
    private CheckBox dragonBall;
    private CheckBox pokemon;
    private CheckBox bobEsponja;

    private Button botaomostrar;
    private TextView msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cavaleiroDoZodiaco = (CheckBox) findViewById(R.id.checkBoxCDZ_ID);
        dragonBall = (CheckBox) findViewById(R.id.checkBoxDragonBall_ID);
        pokemon = (CheckBox) findViewById(R.id.checkBoxPokemon_ID);
        bobEsponja = (CheckBox) findViewById(R.id.checkBoxBobEsponja_ID);

        botaomostrar = (Button) findViewById(R.id.mostrarID);
        msg = (TextView) findViewById(R.id.textoID);

        botaomostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String desenhosSelecionados = "";

                desenhosSelecionados += "Desenho: " + cavaleiroDoZodiaco.getText() + "Status:" + cavaleiroDoZodiaco.isChecked() + "\n";
                desenhosSelecionados += "Desenho: " + dragonBall.getText() + "Status:" + dragonBall.isChecked() + "\n";
                desenhosSelecionados += "Desenho: " + pokemon.getText()+ "Status:" + pokemon.isChecked() + "\n";
                desenhosSelecionados += "Desenho: " + bobEsponja.getText()+ "Status:" + bobEsponja.isChecked();

                msg.setText(desenhosSelecionados);

            }
        });


    }
}
