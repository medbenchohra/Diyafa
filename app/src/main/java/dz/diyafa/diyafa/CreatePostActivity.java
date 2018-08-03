package dz.diyafa.diyafa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class CreatePostActivity extends AppCompatActivity {
    String foodTpe;
    String foodName;
    int time;
    boolean[] ingredients;
    int quantity=1;
    String location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        SeekBar sk = findViewById(R.id.seekBar);
        final TextView timeView = findViewById(R.id.time_c);

        sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                // TODO Auto-generated method stub

                timeView.setText(progress+"min");


            }
        });
    }

    public void onMinus(View view) {
        if (quantity>1){
            quantity--;
            TextView q=findViewById(R.id.quantity_c);
            q.setText(quantity+"");
        }

    }

    public void onPlus(View view) {
        if (quantity<9){
            quantity++;
            TextView q=findViewById(R.id.quantity_c);
            q.setText(quantity+"");
        }

    }

    public void onPost(View view) {

    }
}

