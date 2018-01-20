package bd.edu.fcub.mahfuz.teaching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bd.edu.fcub.mahfuz.R;
import bd.edu.fcub.mahfuz.teaching.buadm.aminulActivity;
import bd.edu.fcub.mahfuz.teaching.buadm.astarulActivity;
import bd.edu.fcub.mahfuz.teaching.buadm.mostafijurActivity;
import bd.edu.fcub.mahfuz.teaching.buadm.najmulActivity;
import bd.edu.fcub.mahfuz.teaching.buadm.sabujActivity;

public class buadmActivity extends AppCompatActivity {

    Button aminul;
    Button astarul;
    Button mostafijur;
    Button najmul;
    Button sabuj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buadm);

        aminul=(Button)findViewById(R.id.aminul);
        astarul=(Button)findViewById(R.id.astarul);
        mostafijur=(Button)findViewById(R.id.mostafijur);
        najmul=(Button)findViewById(R.id.najmul);
        sabuj=(Button)findViewById(R.id.sabuj);

        aminul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aminul = new Intent(buadmActivity.this, aminulActivity.class);
                startActivity(aminul);
            }
        });


        astarul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent astarul = new Intent(buadmActivity.this, astarulActivity.class);
                startActivity(astarul);
            }
        });


        mostafijur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mostafijur = new Intent(buadmActivity.this, mostafijurActivity.class);
                startActivity(mostafijur);
            }
        });


        najmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent najmul = new Intent(buadmActivity.this, najmulActivity.class);
                startActivity(najmul);
            }
        });


        sabuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabuj = new Intent(buadmActivity.this, sabujActivity.class);
                startActivity(sabuj);
            }
        });

    }
}
