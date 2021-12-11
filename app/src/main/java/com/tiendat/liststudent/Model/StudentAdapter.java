package com.tiendat.liststudent.Model;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tiendat.liststudent.R;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Student> studentList;
    //
    public StudentAdapter(Context context, int layout, List<Student> studentList) {
        this.context = context;
        this.layout = layout;
        this.studentList = studentList;
    }
    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        //ánh xạ
        TextView tvHoten = (TextView) view.findViewById(R.id.tvNameStudent);
        TextView tvId = (TextView) view.findViewById(R.id.tvIdStudent);
        TextView tvSdt = (TextView) view.findViewById(R.id.tvSdtStudent);
        ImageView imageViewStudetn = (ImageView) view.findViewById(R.id.imageViewStudent);
        //gán giá trị
        tvHoten.setText(studentList.get(i).Hoten);
        tvId.setText(studentList.get(i).id);
        tvSdt.setText(studentList.get(i).Sdt);
        imageViewStudetn.setImageResource(studentList.get(i).HinhAnh);
        return view;
    }
}
