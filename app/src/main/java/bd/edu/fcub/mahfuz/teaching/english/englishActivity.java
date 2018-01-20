package bd.edu.fcub.mahfuz.teaching.english;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bd.edu.fcub.mahfuz.R;

public class englishActivity extends AppCompatActivity {

    Button joy;
    Button mamun;
    Button marof;
    Button shoeb;
    Button tohfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);


        joy=(Button)findViewById(R.id.joy);
        mamun=(Button)findViewById(R.id.mamun);
        marof=(Button)findViewById(R.id.marof);
        shoeb=(Button)findViewById(R.id.shoeb);
        tohfa=(Button)findViewById(R.id.tohfa);



        joy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent joy = new Intent(englishActivity.this, amirulActivity.class);
                startActivity(joy);
            }
        });


        mamun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mamun = new Intent(englishActivity.this, mamunActivity.class);
                startActivity(mamun);
            }
        });

        marof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marof = new Intent(englishActivity.this, marofActivity.class);
                startActivity(marof);
            }
        });

        shoeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoeb = new Intent(englishActivity.this, shoebActivity.class);
                startActivity(shoeb);
            }
        });

        tohfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tohfa = new Intent(englishActivity.this, tohfaActivity.class);
                startActivity(tohfa);
            }
        });
    }
}
