package com.example.mihai.realplay.CustomViews;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.EditText;

import com.example.mihai.realplay.R;

/**
 * Created by mihai on 25.10.2016.
 */

public class RoundEditText extends EditText {


    public RoundEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setSingleLine(true);
        this.setInputType(this.getInputType());
        this.setPadding(15,0,0,0);
        this.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);
        this.setTextColor(getResources().getColor(R.color.black));
        int originalDrawable = R.drawable.round_border_edit_text;
        int sdk = android.os.Build.VERSION.SDK_INT;
        int jellyBean = android.os.Build.VERSION_CODES.JELLY_BEAN;
        if (sdk < jellyBean) {
            this.setBackgroundDrawable(getResources().getDrawable(originalDrawable));
        } else {
            this.setBackground(getResources().getDrawable(originalDrawable));
        }



    }



}
