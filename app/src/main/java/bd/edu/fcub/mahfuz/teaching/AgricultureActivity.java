package bd.edu.fcub.mahfuz.teaching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bd.edu.fcub.mahfuz.R;
import bd.edu.fcub.mahfuz.teaching.agriculture.golamActivity;
import bd.edu.fcub.mahfuz.teaching.agriculture.mizanActivity;
import bd.edu.fcub.mahfuz.teaching.agriculture.nahidActivity;
import bd.edu.fcub.mahfuz.teaching.agriculture.shahinActivity;
import bd.edu.fcub.mahfuz.teaching.agriculture.tahmidarActivity;

public class AgricultureActivity extends AppCompatActivity {

    Button golam;
    Button mizan;
    Button nahid;
    Button shahin;
    Button tahmidar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);


        golam=(Button)findViewById(R.id.golamsorwaragriculture);
        mizan=(Button)findViewById(R.id.mizanagriculture);
        nahid=(Button)findViewById(R.id.nahidagriculture);
        shahin=(Button)findViewById(R.id.shahinagriculture);
        tahmidar=(Button)findViewById(R.id.tahmidarrahman);

        golam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent golam = new Intent(AgricultureActivity.this, golamActivity.class);
                startActivity(golam);
            }
        });


        mizan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mizan = new Intent(AgricultureActivity.this, mizanActivity.class);
                startActivity(mizan);
            }
        });


        nahid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nahid = new Intent(AgricultureActivity.this, nahidActivity.class);
                startActivity(nahid);
            }
        });


        shahin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shahin = new Intent(AgricultureActivity.this, shahinActivity.class);
                startActivity(shahin);
            }
        });


        tahmidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tahmidar = new Intent(AgricultureActivity.this, tahmidarActivity.class);
                startActivity(tahmidar);
            }
        });

    }
}
