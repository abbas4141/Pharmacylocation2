package org.codeforiraq.pharmacylocation;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.attr.button;

public class codeforiraq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeforiraq);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"ae-almothnna-bold.ttf");
        TextView textcodeforiraq=(TextView)findViewById(R.id.textcodeforiraq);
        textcodeforiraq.setTypeface(typeface);

    }
}
