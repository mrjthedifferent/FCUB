package bd.edu.fcub.mahfuz.teaching.ph;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bd.edu.fcub.mahfuz.R;

public class phActivity extends AppCompatActivity {

    Button mohbub;
    Button mahmudul;
    Button nazmul;
    Button rocky;
    Button sazin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph);


        mohbub=(Button)findViewById(R.id.mohbub);
        mahmudul=(Button)findViewById(R.id.mahmudul);
        nazmul=(Button)findViewById(R.id.nazmul);
        rocky=(Button)findViewById(R.id.rocky);
        sazin=(Button)findViewById(R.id.sazin);

        mohbub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mohbub = new Intent(phActivity.this, mohbubActivity.class);
                startActivity(mohbub);
            }
        });


        mahmudul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mahmudul = new Intent(phActivity.this, mahmudulActivity.class);
                startActivity(mahmudul);
            }
        });


        nazmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nazmul = new Intent(phActivity.this, nazmulActivity.class);
                startActivity(nazmul);
            }
        });


        rocky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rocky = new Intent(phActivity.this, rockyActivity.class);
                startActivity(rocky);
            }
        });


        sazin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sazin = new Intent(phActivity.this, sazinActivity.class);
                startActivity(sazin);
            }
        });



    }
}
