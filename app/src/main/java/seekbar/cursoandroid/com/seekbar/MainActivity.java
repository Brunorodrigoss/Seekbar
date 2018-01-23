package seekbar.cursoandroid.com.seekbar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private SeekBar seekbar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = findViewById(R.id.seekBarId);
        textoExibicao = findViewById(R.id.textoExibicaoId);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) { // chamado quando movimentar a seekbar
                // i = valor referente ao progresso da seekbar
                textoExibicao.setText("Progresso: "+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { //chamado quando a seekbar é pressionada
                Toast.makeText(MainActivity.this, "Seekbar pressionado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { // chamado quando o boltao da seekbar é solto
                Toast.makeText(MainActivity.this, "Botão seekbar não esta pressionado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
