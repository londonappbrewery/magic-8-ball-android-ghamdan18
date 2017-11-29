package com.ghamdansoft.magiceightball;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    private ImageView image_eightBall;
    final int ballsArray[] = {
            com.ghamdansoft.magiceightball.R.drawable.ball1,
            com.ghamdansoft.magiceightball.R.drawable.ball2,
            com.ghamdansoft.magiceightball.R.drawable.ball3,
            com.ghamdansoft.magiceightball.R.drawable.ball4,
            com.ghamdansoft.magiceightball.R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.ghamdansoft.magiceightball.R.layout.activity_main);
        Button askButton =  findViewById(com.ghamdansoft.magiceightball.R.id.askButton);
        image_eightBall = findViewById(com.ghamdansoft.magiceightball.R.id.image_eightBall);
        updateImage();

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateImage();
            }
        });
    }

    private void updateImage(){
        Random randomBall = new Random();
        int imageID = ballsArray[randomBall.nextInt(5)];
        image_eightBall.setImageResource(imageID);
    }

}
