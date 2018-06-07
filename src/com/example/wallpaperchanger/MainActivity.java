package com.example.wallpaperchanger;

import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity  implements OnClickListener {
	
	ImageView display;
    int toPhone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		toPhone = R.drawable.p1;
        display = (ImageView) findViewById(R.id.IVdisplay);
        Button setWall = (Button) findViewById(R.id.WallPaperButton);

        ImageView image1 = (ImageView) findViewById(R.id.IVimage1);
        ImageView image2 = (ImageView) findViewById(R.id.IVimage2);
        ImageView image3 = (ImageView) findViewById(R.id.IVimage3);
        ImageView image4 = (ImageView) findViewById(R.id.IVimage4);
        ImageView image5 = (ImageView) findViewById(R.id.IVimage5);
        ImageView image6 = (ImageView) findViewById(R.id.IVimage6);
        ImageView image7 = (ImageView) findViewById(R.id.IVimage7);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        setWall.setOnClickListener(this);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		switch (arg0.getId()){
        case R.id.IVimage1:
            display.setImageResource(R.drawable.p1);
            toPhone = R.drawable.p1;
            break;
        case R.id.IVimage2:
            display.setImageResource(R.drawable.p2);
            toPhone = R.drawable.p2;
            break;
        case R.id.IVimage3:
            display.setImageResource(R.drawable.p3);
            toPhone = R.drawable.p3;
            break;
        case R.id.IVimage4:
            display.setImageResource(R.drawable.p4);
            toPhone = R.drawable.p4;
            break;
        case R.id.IVimage5:
            display.setImageResource(R.drawable.p5);
            toPhone = R.drawable.p5;
            break;
        case R.id.IVimage6:
            display.setImageResource(R.drawable.p6);
            toPhone = R.drawable.p6;
            break;
        case R.id.IVimage7:
            display.setImageResource(R.drawable.p7);
            toPhone = R.drawable.p7;
            break;
        case R.id.WallPaperButton:
            InputStream yeaaaa = getResources().openRawResource(toPhone);
            Bitmap whatever = BitmapFactory.decodeStream(yeaaaa);
            try{
                getApplicationContext().setWallpaper(whatever);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            break;
    }

		
		
	}

}
