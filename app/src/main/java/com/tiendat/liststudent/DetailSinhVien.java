package com.tiendat.liststudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailSinhVien extends AppCompatActivity {
    TextView tvHotensv, tvNgaysinh, tvid, tvLop, tvKhoa;
    ImageView imgAnhsv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sinh_vien);
        //ánh xạ

        tvHotensv = (TextView) findViewById(R.id.tvHotensv);
        tvNgaysinh = (TextView) findViewById(R.id.tvNgaysinh);
        tvid = (TextView) findViewById(R.id.tvid);
        tvLop = (TextView) findViewById(R.id.tvLop);
        tvKhoa = (TextView) findViewById(R.id.tvKhoa);
        imgAnhsv = (ImageView)findViewById(R.id.imageViewStudent);
        //nhạn dữ liệu
        int HinhAnh = getIntent().getIntExtra("HinhAnh",R.drawable.sv1);
        String hoten = getIntent().getStringExtra("hoten");
        String ngaySinh = getIntent().getStringExtra("ngaySinh");
        String id = getIntent().getStringExtra("id");
        String lop = getIntent().getStringExtra("lop");
        String nienKhoa = getIntent().getStringExtra("nienKhoa");
        //hiển thị dữ liệu
        tvHotensv.setText(hoten);
        tvNgaysinh.setText(ngaySinh);
        tvid.setText(id);
        tvLop.setText(lop);
        tvKhoa.setText(nienKhoa);

    }
}