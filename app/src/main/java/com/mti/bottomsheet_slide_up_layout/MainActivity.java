package com.mti.bottomsheet_slide_up_layout;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

BottomSheetBehavior sheetBehavior;

Button slide_Helper;
Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;

        slide_Helper = findViewById(R.id.slide_Up);

        /**
         * bottom sheet state change listener
         * we are changing button text when sheet changed state
         * */
        slide_Helper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BottomSheetFragment bottomSheetFragment=new BottomSheetFragment();

                bottomSheetFragment.show(getSupportFragmentManager(),bottomSheetFragment.getTag());
            }
        });



    }

}
