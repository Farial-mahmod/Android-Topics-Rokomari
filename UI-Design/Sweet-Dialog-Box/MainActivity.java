package com.khalnayak.sweetdialog;

import androidx.appcompat.app.AppCompatActivity;
import cn.pedant.SweetAlert.SweetAlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSuccess = findViewById(R.id.successButton);
        buttonSuccess.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this)
                        .setTitleText("Here's a message!")
                        .show();
            }
        });
        Button buttonWarning = findViewById(R.id.confirmationButton);
        buttonWarning.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Are you sure?")
                        .setContentText("You won't be able to recover this file!")
                        .setConfirmText("Delete!")
                        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sDialog) {
                                sDialog.dismissWithAnimation();
                            }
                        })
                        .setCancelButton("Cancel", new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sDialog) {
                                sDialog.dismissWithAnimation();
                            }
                        })
                        .show();
            }
        });

        // 3. Error message
        Button buttonDanger = findViewById(R.id.errorButton);
        buttonDanger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("Oops...")
                        .setContentText("Something went wrong!")
                        .show();
            }
        });

        // 4. Loading message
        Button buttonLoading = findViewById(R.id.loadingButton);
        buttonLoading.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SweetAlertDialog pDialog = new SweetAlertDialog(MainActivity.this, SweetAlertDialog.PROGRESS_TYPE);
                pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
                pDialog.setTitleText("Loading ...");
                pDialog.setCancelable(true);
                pDialog.show();
            }
        });

        // 5. Confirm success
        Button buttonConfirmSuccess = findViewById(R.id.confirmSuccessButton);
        buttonConfirmSuccess.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.WARNING_TYPE)
                        .setTitleText("Are you sure?")
                        .setContentText("Won't be able to recover this file!")
                        .setConfirmText("Yes,delete it!")
                        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sDialog) {
                                sDialog
                                        .setTitleText("Deleted!")
                                        .setContentText("Your imaginary file has been deleted!")
                                        .setConfirmText("OK")
                                        .setConfirmClickListener(null)
                                        .changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
                            }
                        })
                        .show();
            }
        });
    }
}
