
package com.codegym.quanlysinhvien;

public class Student {
private String maSinhVien;
private String tenSinhVien;
private int tuoiSinhVien;
private String diaChi;
private String soDienThoai;
private String gioiTinh;
private float diemLyThuyet=0;
private float diemThucHanh=0;
private float diemTrungBinh;
public Student(){}

    public Student(String maSinhVien, String tenSinhVien, int tuoiSinhVien, String diaChi, String soDienThoai, String gioiTinh, float diemLyThuyet, float diemThucHanh) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tuoiSinhVien = tuoiSinhVien;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public Student(String maSinhVien, String tenSinhVien, int tuoiSinhVien, String diaChi, String soDienThoai, String gioiTinh, float diemLyThuyet, float diemThucHanh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tuoiSinhVien = tuoiSinhVien;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        this.diemTrungBinh = diemTrungBinh;
    }


    
    public Student(String maSinhVien, String tenSinhVien, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diemTrungBinh = diemTrungBinh;

    }


    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getTuoiSinhVien() {
        return tuoiSinhVien;
    }

    public void setTuoiSinhVien(int tuoiSinhVien) {
        this.tuoiSinhVien = tuoiSinhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(float diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public float getDiemThucHanh() {

        return diemThucHanh;
    }

    public void setDiemThucHanh(float diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }
    

    public float getDiemTrungBinh() {
        return (diemThucHanh+diemLyThuyet)/2;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = (diemThucHanh+diemLyThuyet)/2;
    }

    @Override
    public String toString() {
        return "Th??ng tin sinh vi??n: " + "\n"
                + "    - M?? sinh vi??n : " + maSinhVien + "\n"
                + "    - T??n sinh vi??n : " + tenSinhVien + "\n"
                + "    - Tu???i sinh vi??n : " + tuoiSinhVien + "\n"
                + "    - ?????a ch??? : " +diaChi + "\n"
                + "    - S??? ??i???n tho???i : " + soDienThoai + "\n"
                + "    - Gi???i t??nh : " + gioiTinh + "\n"
                + "    - ??i???m l?? thuy???t : " + diemLyThuyet + "\n"
                + "    - ??i???m th???c h??nh : " + diemThucHanh;

    }



    


    public String list() {
        return maSinhVien + ", " + tenSinhVien + ", " + tuoiSinhVien + ", " + diaChi + ", " +
                soDienThoai + ", " + gioiTinh + ", " 
                + diemLyThuyet + ", " + diemThucHanh + ", " + diemTrungBinh;

    }

 
    




}
