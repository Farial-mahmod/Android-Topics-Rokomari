package com.khalnayak.camera;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    // any random number that confirms a camera's response
    private static final int CAMERA_REQUEST = 1888;

    ImageView iv;
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = this.findViewById(R.id.i1);
        Button photoButton = this.findViewById(R.id.b1);

        photoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            iv.setImageBitmap(photo);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflating the menu
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
