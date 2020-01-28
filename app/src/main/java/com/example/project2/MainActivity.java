package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvnama;
    EditText txtuser;
    EditText txtpass;
    Button btnklik;
    TextView tvbawah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvnama = findViewById(R.id.tvnama);
        txtuser = findViewById(R.id.txtuser);
        txtpass = findViewById(R.id.txtpass);
        btnklik = findViewById(R.id.btnklik);
        tvbawah = findViewById(R.id.tvbawah);
    btnklik.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(txtuser.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Jangan Kosong", Toast.LENGTH_SHORT).show();
            } else if (txtpass.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Jangan Kosong", Toast.LENGTH_SHORT).show();
            } else if(txtuser.getText().toString().equals("Hanif")&&(txtpass.getText().toString().equals("Cahyo"))){
                Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
//                Pindah
                Intent intenku = new Intent(MainActivity.this, Calculator.class);
                startActivity(intenku);
            } else{
                Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();}
        }
    });
    }
}
