package com.example.thedata_minors.recified.login.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.thedata_minors.recified.R;

/**
 * Created by tiffanyxu on 2016-11-11.
 */

public class CheckIn extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
    }

    /** Called when the user clicks the Check in button */
    public void popUp(View view) {
        Intent intent = new Intent(this, ShowPopUp.class);
        startActivity(intent);

    }
}
