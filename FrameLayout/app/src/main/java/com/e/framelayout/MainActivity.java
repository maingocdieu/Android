package com.e.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtThongBao;
    Button btnNut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnNut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongBao.setText("Dieu dep trai");
            }
        });
    }

    private void addControls() {
        txtThongBao=findViewById(R.id.txtThongBao);
        btnNut=findViewById(R.id.btnNut);
    }
}
