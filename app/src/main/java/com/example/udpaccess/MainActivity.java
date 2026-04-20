package com.example.udpaccess;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TextView tv = new TextView(this);
        //tv.setText("Ative o serviço de acessibilidade.");
        //setContentView(tv);
		setContentView(R.layout.activity_main);
    }
}
