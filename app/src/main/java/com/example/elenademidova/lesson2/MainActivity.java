package com.example.elenademidova.lesson2;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnUrl = (Button) findViewById(R.id.btnUrl);
        btnUrl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent("http://crosti.ru/patterns/00/11/38/ba8fee7cfe/picture.jpg");
        startActivity(intent);
    }
}
