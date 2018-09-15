package org.codeforiraq.pharmacylocation;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static org.codeforiraq.pharmacylocation.R.id.editTextname;

public class Applicationabout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicationabout);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"ae-almothnna-bold.ttf");

        TextView textversion=(TextView)findViewById(R.id.textversion);
        TextView textpharmacy=(TextView)findViewById(R.id.textpharmacy);
        textversion.setTypeface(typeface);
        textpharmacy.setTypeface(typeface);

    }
}
