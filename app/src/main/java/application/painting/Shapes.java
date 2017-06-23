package application.painting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Ebin-Turki on 2017-06-22.
 */

public class Shapes extends Activity {


    Button circle1;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        circle1 = (Button) findViewById(R.id.btn1);
        text1= (TextView) findViewById(R.id.text);


        circle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 text1.setText("Good job Saad!");
            }
        });

    }


}