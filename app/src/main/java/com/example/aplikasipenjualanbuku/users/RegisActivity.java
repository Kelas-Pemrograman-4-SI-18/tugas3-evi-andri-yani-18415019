package com.example.aplikasipenjualanbuku.users;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.aplikasipenjualanbuku.R;

public class RegisActivity extends AppCompatActivity {

    Button btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        getSupportActionBar().hide();

        btnRegis = (Button) findViewById(R.id.btnLogin);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
