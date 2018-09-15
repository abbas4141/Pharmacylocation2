package org.codeforiraq.pharmacylocation;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Typeface typefaceone = Typeface.createFromAsset(getAssets(),"MTCORSVA.TTF");

        Typeface typeface = Typeface.createFromAsset(getAssets(),"ae-almothnna-bold.ttf");
        Button btnapplicationabout=(Button)findViewById(R.id.btnapplicationabout);
        Button btnteam=(Button)findViewById(R.id.btnteam);
        Button btncodeforiraq=(Button)findViewById(R.id.btncodeforiraq);
        btnapplicationabout.setTypeface(typeface);
        btnteam.setTypeface(typeface);
        btncodeforiraq.setTypeface(typefaceone);




    }

    public void btnapplicationabout(View view) {
        Intent intent=new Intent(this,Applicationabout.class);
        startActivity(intent);
    }

    public void btnteam(View view) {
        Intent intent=new Intent(this,Team.class);
        startActivity(intent);
    }

    public void codeforiraq(View view) {
        Intent intent=new Intent(this,codeforiraq.class);
        startActivity(intent);
    }
}
