package com.mti.bottomsheet_slide_up_layout;

import android.content.Context;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
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
                View view=getLayoutInflater().inflate(R.layout.bottom_sheet_dialog,null);

                BottomSheetDialog dialog=new BottomSheetDialog(mContext);
                dialog.setContentView(view);
                dialog.show();

            }
        });



    }

}
