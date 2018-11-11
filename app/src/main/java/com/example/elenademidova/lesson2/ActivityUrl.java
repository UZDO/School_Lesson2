package com.example.elenademidova.lesson2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityUrl extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        TextView tvText = (TextView) findViewById(R.id.tvText);
        tvText.setText("http://crosti.ru/patterns/00/11/38/ba8fee7cfe/picture.jpg");
    }
}
