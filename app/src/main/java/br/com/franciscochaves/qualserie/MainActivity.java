package br.com.franciscochaves.qualserie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar mSeekBar;
    private ImageView mImageExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSeekBar = (SeekBar) findViewById(R.id.seekBar_serie);
        mImageExibicao = findViewById(R.id.image_serie);

       mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               int valorProgesso = i;

               switch (valorProgesso){
                   case 1:
                       mImageExibicao.setImageResource(R.drawable.pouco);
                       break;
                   case 2:
                       mImageExibicao.setImageResource(R.drawable.medio);
                       break;
                   case 3:
                       mImageExibicao.setImageResource(R.drawable.muito);
                       break;
                   case 4:
                       mImageExibicao.setImageResource(R.drawable.susto);
                       break;
               }
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });
    }
}
