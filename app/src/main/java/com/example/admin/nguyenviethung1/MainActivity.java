package com.example.admin.nguyenviethung1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.EditText
import android.widget.CheckBox

public class MainActivity extends AppCompatActivity {
   EditText edtMacd,edtTuacd,edtDgia,edtSl;
   CheckBox cbNhac,cbPhim,cbHai;
   Button btnXoa,btnThem;
    ListView lvDS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMacd = (EditText) findViewById(R.id.edtMacd1);
        edtTuacd = (EditText) findViewById(R.id.edtTuacd1);
        edtDgia = (EditText) findViewById(R.id.edtDgia1);
        edtSl = (EditText) findViewById(R.id.edtSluong1);
        cbNhac = (CheckBox) findViewById(R.id.cbNhac1);
        cbHai = (CheckBox) findViewById(R.id.cbHai1);
        cbPhim = (CheckBox)findViewById(R.id.cbPhim1);
        btnThem = (Button) findViewById(R.id.btnThem1);
        btnXoa = (Button) findViewById(R.id.btnXoa1);
        lvDS = (ListView) findViewById(R.id.lvDS1)

        };

    }
