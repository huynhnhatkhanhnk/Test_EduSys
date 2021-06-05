/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.entity;

import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Phuong Thao
 */
public class KhoaHocNGTest {
    
    public KhoaHocNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaKH() {
        System.out.println("getMaKH");
        KhoaHoc instance = new KhoaHoc();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaKH() {
        System.out.println("setMaKH");
        int maKH = 0;
        KhoaHoc instance = new KhoaHoc();
        instance.setMaKH(maKH);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaCD() {
        System.out.println("getMaCD");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getMaCD();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaCD() {
        System.out.println("setMaCD");
        String maCD = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaCD(maCD);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHocPhi() {
        
        KhoaHoc instance = new KhoaHoc();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(result, expResult, 0.0);
        
    }

    //học phí âm
    @Test(expectedExceptions = Exception.class)
    public void testSetHocPhiWithNegative() {
        System.out.println("setHocPhi");
        double hocPhi = -10.0;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);
        
    }
    
    //Học phí dương
    @Test()
    public void testSetHocPhiWithPostive() {
        System.out.println("setHocPhi");
        double hocPhi = 10.0;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);
        double actual = instance.getHocPhi();
        
        assertEquals(actual, hocPhi);
    }
    
    //Học phí = 0
    @Test()
    public void testSetHocPhiWithZero() {
        System.out.println("setHocPhi");
        double hocPhi = 0.0;
        KhoaHoc instance = new KhoaHoc();
        instance.setHocPhi(hocPhi);
        double actual = instance.getHocPhi();
        
        assertEquals(actual, hocPhi);
    }

    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        KhoaHoc instance = new KhoaHoc();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(result, expResult);
        
    }

    @Test(expectedExceptions = Exception.class)
    public void testSetThoiLuongWithNegative() {
        System.out.println("setThoiLuong");
        int thoiLuong = -12;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);
        
    }

    @Test(expectedExceptions = Exception.class)
    public void testSetThoiLuongWithZero() {
        System.out.println("setThoiLuong");
        int thoiLuong = 0;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);
        
    }
    
    @Test
    public void testSetThoiLuongWithValid() {
        System.out.println("setThoiLuong");
        int thoiLuong = 10;
        KhoaHoc instance = new KhoaHoc();
        instance.setThoiLuong(thoiLuong);
        int actual = instance.getThoiLuong();
        assertEquals(actual, thoiLuong);
    }
    
    @Test
    public void testGetNgayKG() {
        System.out.println("getNgayKG");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayKG();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgayKG() {
        System.out.println("setNgayKG");
        Date ngayKG = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayKG(ngayKG);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetGhiChu() {
        System.out.println("getGhiChu");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getGhiChu();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetGhiChu() {
        System.out.println("setGhiChu");
        String ghiChu = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setGhiChu(ghiChu);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        KhoaHoc instance = new KhoaHoc();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "";
        KhoaHoc instance = new KhoaHoc();
        instance.setMaNV(maNV);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNgayTao() {
        System.out.println("getNgayTao");
        KhoaHoc instance = new KhoaHoc();
        Date expResult = null;
        Date result = instance.getNgayTao();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNgayTao() {
        System.out.println("setNgayTao");
        Date ngayTao = null;
        KhoaHoc instance = new KhoaHoc();
        instance.setNgayTao(ngayTao);
        fail("The test case is a prototype.");
    }
    
}
