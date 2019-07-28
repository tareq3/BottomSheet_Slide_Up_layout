package com.mti.bottomsheet_slide_up_layout;

import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

BottomSheetBehavior sheetBehavior;

ImageView slide_Helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*   slide_Helper=findViewById(R.id.imageView2);
        sheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottom_Sheet));

        *//**
         * bottom sheet state change listener
         * we are changing button text when sheet changed state
         * *//*
        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_HIDDEN:
                        break;
                    case BottomSheetBehavior.STATE_EXPANDED: {
                        //"Close Sheet
                        //TODO: Change icon to Down
                        slide_Helper.setImageResource(R.drawable.ic_arrow_downward_black_24dp);
                    }
                    break;
                    case BottomSheetBehavior.STATE_COLLAPSED: {
                       //Expand Sheet
                        //TODO: Change icon to Up
                        slide_Helper.setImageResource(R.drawable.ic_arrow_upward_black_24dp);
                    }
                    break;
                    case BottomSheetBehavior.STATE_DRAGGING:
                        break;
                    case BottomSheetBehavior.STATE_SETTLING:
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

//TODO: If user use button instead of drag...
        slide_Helper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                    sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                    //TODO: Change icon to Down
                    slide_Helper.setImageResource(R.drawable.ic_arrow_downward_black_24dp);
                } else {
                    sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    //TODO: Change icon to Up
                    slide_Helper.setImageResource(R.drawable.ic_arrow_upward_black_24dp);
                }
            }
        });
*/
    }

}
