package org.codeforiraq.pharmacylocation;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Writingbtn(R.id.btnshowpharmacy);
        Writingbtn(R.id.btnabout);


    }

    public void Writingbtn(int x){
        Button button = (Button) findViewById(x);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"ae-almothnna-bold.ttf");
        button.setTypeface(typeface);
    }

    public void btnshowpharmacy(View view) {
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void btnabout(View view) {
        Intent intent=new Intent(this,About.class);
        startActivity(intent);
    }


}
