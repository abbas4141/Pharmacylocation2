package org.codeforiraq.pharmacylocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView imageViewhome;
    private Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewhome =(ImageView)findViewById(R.id.imageviewhome);
        anim= AnimationUtils.loadAnimation(this,R.anim.anim1);



        imageViewhome.setAnimation(anim);



      final Intent intent=new Intent(this,Homepage.class);


        Thread timer =new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
                timer.start();
    }
}
