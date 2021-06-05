/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Phuong Thao
 */
//Junit5
public class ChuyenDeTest_demo {
    
    public ChuyenDeTest_demo() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ChuyenDe instance = new ChuyenDe();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaCD method, of class ChuyenDe.
     */
    //mong muốn chuỗi rỗng vì chưa nhập gì
    @Test
    public void testGetMaCD() {
        
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getMaCD();
        assertEquals(expResult, result);
        
    }

    //
    @Test
    public void testSetMaCD() { 
        String maCD = "JAV01";
        ChuyenDe instance = new ChuyenDe();
        instance.setMaCD(maCD);
        String expected = "JAV01";
        assertEquals(expected, instance.getMaCD());
    }

    @Test
    public void testGetTenCD() {
        
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getTenCD();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTenCD() {
        
        String tenCD = "Lập trình Java cơ bản";
        ChuyenDe instance = new ChuyenDe();
        instance.setTenCD(tenCD);
        String expected = "Lập trình Java cơ bản";
        assertEquals(expected, instance.getTenCD());
    }

    /**
     * Test of getHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testGetHocPhi() {
        ChuyenDe instance = new ChuyenDe();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetHocPhi() {
        double hocPhi = 600;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(hocPhi);
        double expected = 600;
        double result = instance.getHocPhi();
        assertEquals(expected, result, 0.0);
    }

    //Test giá trị âm
    @Test
    public void testSetHocPhiWithNegative() {
        double hocPhi = -600;
        ChuyenDe instance = new ChuyenDe();
      //  Exception exception = assertThrows(Exception.class, ()-> instance.setHocPhi(hocPhi));
    }
    
    //Test giá trị quá lớn
    @Test
    public void testSetHocPhiWithLarge() {
        double hocPhi = 250000000;
        ChuyenDe instance = new ChuyenDe();
      //  Exception exception = assertThrows(Exception.class, ()-> instance.setHocPhi(hocPhi));
    }
    
    
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        ChuyenDe instance = new ChuyenDe();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testSetThoiLuong() {
        
        int thoiLuong = 10;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(thoiLuong);
        int expected = 10;
        int result = instance.getThoiLuong();
        assertEquals(expected, result);
    }

    //Test thời lượng âm
    @Test
    public void testSetThoiLuongWithNegative() {
        
        int thoiLuong = -10;
        ChuyenDe instance = new ChuyenDe();
      //  Exception ex = assertThrows(Exception.class, ()->instance.setThoiLuong(thoiLuong));
        
        
    }
    
    @Test
    public void testGetHinh() {
        System.out.println("getHinh");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getHinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHinh method, of class ChuyenDe.
     */
    @Test
    public void testSetHinh() {
        System.out.println("setHinh");
        String hinh = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setHinh(hinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoTa method, of class ChuyenDe.
     */
    @Test
    public void testGetMoTa() {
        System.out.println("getMoTa");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getMoTa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoTa method, of class ChuyenDe.
     */
    @Test
    public void testSetMoTa() {
        System.out.println("setMoTa");
        String moTa = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa(moTa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
