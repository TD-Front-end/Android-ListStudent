package com.tiendat.liststudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.tiendat.liststudent.Model.Student;
import com.tiendat.liststudent.Model.StudentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Student> studentArrayList;
    StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        listView =(ListView) findViewById(R.id.LvStudent);
        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("1911075888", "Đinh Hoàng Chương", "08081508", "05/10/2001", "2019-2023", R.drawable.sv1, "19DTHA1"));
        studentArrayList.add(new Student("1711022355", "Lại Thị Hạnh", "0906122355", "15/12/1999", "2017-2021", R.drawable.sv2, "17QTKD1"));
        studentArrayList.add(new Student("1911067293", "Vũ Văn Huy", "0969696969", "06/09/2001", "2019-2023", R.drawable.sv3, "19DTHE5"));
        studentArrayList.add(new Student("1812022322", "Vũ Thị Ngọc", "0835674411", "12/12/2000", "2018-2022", R.drawable.sv4, "18DLLH2"));
        studentAdapter = new StudentAdapter(this, R.layout.liststudent, studentArrayList);
        listView.setAdapter(studentAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                showInfoStudent(i);
            }

        });
    }
    private void showInfoStudent(int i)
    {
        Student student = studentArrayList.get(i);
        Intent intent = new Intent(this, DetailSinhVien.class);
        intent.putExtra("HinhAnh", student.getHinhAnh());
        intent.putExtra("hoten", student.getHoten());
        intent.putExtra("ngaySinh", student.getNgaySinh());
        intent.putExtra("id", student.getId());
        intent.putExtra("lop", student.getLop());
        intent.putExtra("nienKhoa", student.getNienKhoa());
        startActivity(intent);
    }
}