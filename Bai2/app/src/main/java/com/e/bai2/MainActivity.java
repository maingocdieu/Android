package com.e.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edita,editb;
    TextView txtKetQua;
    Button btnCong;
    Button btnNhan;
    Button btnTru;
    Button btnChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvents();
    }

    private void addEvents() {
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLiCong();
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLiTru();
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLiPhepNhan();
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLiPhepChia();
            }
        });


    }

    private void addControl() {
        edita=(EditText) findViewById(R.id.edita);
        editb=(EditText)findViewById(R.id.editb);
        txtKetQua=(TextView)findViewById(R.id.txtKetQua);
        btnCong=(Button)findViewById(R.id.btnCong);
        btnTru=(Button)findViewById(R.id.btnTru);
        btnNhan=(Button)findViewById(R.id.btnNhan);
        btnChia=(Button)findViewById(R.id.btnChia);
    }

    private void xuLiPhepChia() {
        int a=Integer.parseInt(edita.getText().toString());
        int b=Integer.parseInt(editb.getText().toString());
        float c=a/b;

        txtKetQua.setText("Result:"+ c);



    }

    private void xuLiPhepNhan() {

        int a=Integer.parseInt(edita.getText().toString());
        int b=Integer.parseInt(editb.getText().toString());
        int c=a*b;

        txtKetQua.setText("Result:"+ c);
    }

    private void xuLiTru() {
        int a=Integer.parseInt(edita.getText().toString());
        int b=Integer.parseInt(editb.getText().toString());
        int c=a-b;
        txtKetQua.setText("Result:"+ c);
    }

    private void xuLiCong() {
        int a=Integer.parseInt(edita.getText().toString());
        int b=Integer.parseInt(editb.getText().toString());
        int c=a+b;
        txtKetQua.setText("Result:"+ c);
    }
}
