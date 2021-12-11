package com.tiendat.liststudent.Model;

import java.util.Date;

public class Student {
    protected String id;
    protected String Hoten;
    protected String Sdt;
    protected String NgaySinh;
    protected String NienKhoa;
    protected int HinhAnh;
    protected String Lop;
    //constructor
    public Student(String id, String hoten, String sdt, String ngaySinh, String nienKhoa,int hinhAnh, String lop) {
        this.id = id;
        Hoten = hoten;
        Sdt = sdt;
        NgaySinh = ngaySinh;
        NienKhoa = nienKhoa;
        HinhAnh =hinhAnh;
        Lop = lop;
    }
    //
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getNienKhoa() {
        return NienKhoa;
    }

    public void setNienKhoa(String nienKhoa) {
        NienKhoa = nienKhoa;
    }
    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

}
