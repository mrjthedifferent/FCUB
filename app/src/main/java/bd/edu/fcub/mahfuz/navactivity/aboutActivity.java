package bd.edu.fcub.mahfuz.navactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bd.edu.fcub.mahfuz.MainActivity;
import bd.edu.fcub.mahfuz.R;

public class aboutActivity extends AppCompatActivity {

    Button checkbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        checkbutton = (Button) findViewById(R.id.checkbutton);
        checkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=bd.edu.fcub.mahfuz")));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=bd.edu.fcub.mahfuz")));
                }
            }

        });

    }
    @Override
    public void onBackPressed() {
        Intent gotomain = new Intent(aboutActivity.this, MainActivity.class);
        startActivity(gotomain);
        return;
    }

}