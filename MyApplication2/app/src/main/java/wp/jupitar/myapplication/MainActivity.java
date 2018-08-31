package wp.jupitar.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper=findViewById(R.id.viewfliper);
        viewFlipper.addView(View.inflate(this, R.layout.one_ads, null));
//        viewFlipper.addView(View.inflate(this, R.layout.two_ads, null));


    }







}
