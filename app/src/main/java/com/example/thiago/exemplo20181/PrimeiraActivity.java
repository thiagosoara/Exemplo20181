package com.example.thiago.exemplo20181;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        TextView tvMsg = (TextView) findViewById(R.id.tv_msg);
        Button btChange = (Button) findViewById(R.id.bt_change);

        final String msg = tvMsg.getText().toString();

        btChange.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(PrimeiraActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        Button btExit = (Button) findViewById(R.id.bt_exit);

        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
