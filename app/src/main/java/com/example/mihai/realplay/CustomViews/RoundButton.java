package com.example.mihai.realplay.CustomViews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.example.mihai.realplay.R;

/**
 * Created by mihai on 25.10.2016.
 */
@SuppressWarnings("deprecation")
public class RoundButton extends Button {
    public RoundButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTextScaleX(1f);
        this.setClickable(true);
        this.setTextColor(getResources().getColor(R.color.black));
        int originalDrawable = R.drawable.custom_round_button;
        int sdk = android.os.Build.VERSION.SDK_INT;
        int jellyBean = android.os.Build.VERSION_CODES.JELLY_BEAN;
        if (sdk < jellyBean) {
            this.setBackgroundDrawable(getResources().getDrawable(originalDrawable));
        } else {
            this.setBackground(getResources().getDrawable(originalDrawable));
        }
    }
}
