package bd.edu.fcub.mahfuz.teaching.sociology;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bd.edu.fcub.mahfuz.R;

public class sociologyActivity extends AppCompatActivity {

    Button amirul;
    Button farjana;
    Button razwan;
    Button shamsun;
    Button sujauddin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociology);


        amirul=(Button)findViewById(R.id.amirul);
        farjana=(Button)findViewById(R.id.farjana);
        razwan=(Button)findViewById(R.id.razwan);
        shamsun=(Button)findViewById(R.id.shamsun);
        sujauddin=(Button)findViewById(R.id.sujauddin);

        amirul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amirul = new Intent(sociologyActivity.this, amirulActivity.class);
                startActivity(amirul);
            }
        });


        farjana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent farjana = new Intent(sociologyActivity.this, farjanaActivity.class);
                startActivity(farjana);
            }
        });


        razwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent razwan = new Intent(sociologyActivity.this, razwanActivity.class);
                startActivity(razwan);
            }
        });


        shamsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shamsun = new Intent(sociologyActivity.this, shamsunActivity.class);
                startActivity(shamsun);
            }
        });


        sujauddin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sujauddin = new Intent(sociologyActivity.this, sujauddinActivity.class);
                startActivity(sujauddin);
            }
        });

    }
}
