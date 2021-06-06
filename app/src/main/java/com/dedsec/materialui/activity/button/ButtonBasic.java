package com.dedsec.materialui.activity.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dedsec.materialui.R;
import com.dedsec.materialui.utils.Tools;

public class ButtonBasic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_basic);

        Tools.setSystemBarColor(this, R.color.colorAccentDark);
    }
}
