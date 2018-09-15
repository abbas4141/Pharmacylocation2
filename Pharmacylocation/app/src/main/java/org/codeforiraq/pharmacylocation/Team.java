package org.codeforiraq.pharmacylocation;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.attr.typeface;

public class Team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"ae-almothnna-bold.ttf");
        TextView textprogdesgin=(TextView)findViewById(R.id.textprogdesgin);
        TextView textabbas=(TextView)findViewById(R.id.textabbas);
        TextView textzaid=(TextView)findViewById(R.id.textzaid);
        TextView textzahraa=(TextView)findViewById(R.id.textzahraa);

        textprogdesgin.setTypeface(typeface);
        textabbas.setTypeface(typeface);
        textzaid.setTypeface(typeface);
        textzahraa.setTypeface(typeface);

    }
}
