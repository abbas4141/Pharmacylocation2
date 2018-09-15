package org.codeforiraq.pharmacylocation;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;
import static android.R.attr.x;
import static org.codeforiraq.pharmacylocation.R.id.editTextname;
import static org.codeforiraq.pharmacylocation.R.id.editTextplace;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class Addpharmacy extends AppCompatActivity {
    DataBaseHelper helper;
    EditText txtplacename,txtplacecity;
    String longitude;
    String latitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpharmacy);
        helper=new DataBaseHelper(this);
        txtplacename=(EditText)findViewById(R.id.editTextname);
        txtplacecity=(EditText)findViewById(R.id.editTextplace);
        Bundle b=getIntent().getExtras();
        this.latitude=b.getString("latitude");
        this.longitude=b.getString("longitude");


        Button btnadd =(Button)findViewById(R.id.btnadd);
        TextView textViewtitle= (TextView) findViewById(R.id.textViewtitle);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"ae-almothnna-bold.ttf");

        btnadd.setTypeface(typeface);
        textViewtitle.setTypeface(typeface);
        txtplacename.setTypeface(typeface);
        txtplacecity.setTypeface(typeface);


    }
    public void ClickAdd(View view) {
        try
        {
            LocationInfo info=new LocationInfo(String.valueOf(txtplacename.getText()),String.valueOf(txtplacecity.getText()),longitude,latitude);
            helper.InsertLocation(info);
            Intent intent =new Intent(this,MapsActivity.class);
            startActivity(intent);
        }
        catch (Exception ex)
        {
            Toast.makeText(getApplicationContext(),ex.getMessage(),Toast.LENGTH_LONG).show();
        }

    }
}
