package com.example.mihai.realplay;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.mihai.realplay.Utils.Util;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    private Context context = LoginActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.loginButton)
    public void login(View view) {
        switch (view.getId()){
            case R.id.loginButton:
                Util.openActivityClosingParent(context, MainActivity.class);
                break;
        }

    }
}
