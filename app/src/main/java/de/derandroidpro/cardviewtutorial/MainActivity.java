package de.derandroidpro.cardviewtutorial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    CardView cv1,cv2,cv3,cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 =(CardView) findViewById(R.id.cardview1);
        cv1.setOnClickListener(this);
        cv2 =(CardView) findViewById(R.id.cardview2);
        cv2.setOnClickListener(this);
        cv3 =(CardView) findViewById(R.id.cardview3);
        cv3.setOnClickListener(this);
        cv4 =(CardView) findViewById(R.id.cardview4);
        cv4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


        switch(v.getId()){

            case R.id.cardview1:{

                Toast.makeText(getApplicationContext(),"Karte1",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.cardview2:{

                Toast.makeText(getApplicationContext(),"Karte2",Toast.LENGTH_SHORT).show();
                break;
            }
              case R.id.cardview3:{

                Toast.makeText(getApplicationContext(),"Karte3",Toast.LENGTH_SHORT).show();
                  break;

            }
            case R.id.cardview4:{

                Toast.makeText(getApplicationContext(),"Karte4",Toast.LENGTH_SHORT).show();
                break;
            }

        }

    }
}
