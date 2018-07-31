package com.example.steven.ipedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private IpEditText ipEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ipEditText = findViewById(R.id.ip_edit);
    }

    public void onClick(View view) {
        String ipAdd = ipEditText.getIpAddress();
        if(ipAdd==null){
            Toast.makeText(this, "This is not a valid Ip Address", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, ipAdd, Toast.LENGTH_SHORT).show();
        }
    }
}
