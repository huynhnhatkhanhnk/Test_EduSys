/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.KhoaHoc;
import com.edusys.utils.XJdbc;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author Phuong Thao
 */
 @PrepareForTest({XJdbc.class, KhoaHocDAO.class})
public class KhoaHocDAONGTest {
     
     KhoaHocDAO khoaHocDAO;
     KhoaHocDAO khoaHocDAOSpy;
    
    public KhoaHocDAONGTest() {
    }

    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        khoaHocDAO = new KhoaHocDAO();
        PowerMockito.mockStatic(XJdbc.class);
        khoaHocDAOSpy = PowerMockito.spy(new KhoaHocDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertWithNullModel() { 
        System.out.println("insert");
        KhoaHoc model = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(model);
    }
    
    //chưa thiết lập giá trị
    @Test(expectedExceptions = Exception.class)
    public void testInsertWithEmptyModel() {
        System.out.println("insert");
        KhoaHoc model = new KhoaHoc();
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(model);
    }

    @Test
    public void testInsertWithValidModel() {
        System.out.println("insert");
        KhoaHoc model = new KhoaHoc(); 
        model.setGhiChu("");
        model.setHocPhi(20);
        model.setMaCD("12");
        model.setMaKH(1);
        model.setMaNV("N01");
        model.setNgayKG(new Date());
        model.setNgayTao(new Date());
        model.setThoiLuong(200);
        
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(model); 
    }
    
    @Test
    public void testUpdate() {
        System.out.println("update");
        KhoaHoc model = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.update(model);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaKH = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.delete(MaKH);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        KhoaHocDAO instance = new KhoaHocDAO();
        List expResult = null;
        List result = instance.selectAll();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectByIdWithValidID() throws Exception{
        System.out.println("selectById");
        Integer makh = 12;
        
        KhoaHoc expectedResult = new KhoaHoc();
        List<KhoaHoc> resultList = new ArrayList<>();
        resultList.add(expectedResult);
        
        PowerMockito.doReturn(resultList).when(khoaHocDAOSpy, "selectBySql", ArgumentMatchers.anyString(),
                ArgumentMatchers.any());
        
        KhoaHoc result = khoaHocDAOSpy.selectById(makh);
        
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }
    
    @Test
    public void testSelectByIdWithNotFoundID() throws Exception{
        System.out.println("selectById");
        Integer makh = -1;
        
        KhoaHoc expectedResult = null;
        List<KhoaHoc> resultList = new ArrayList<>();
        //resultList.add(expectedResult);
        
        PowerMockito.doReturn(resultList).when(khoaHocDAOSpy, "selectBySql", ArgumentMatchers.anyString(),
                ArgumentMatchers.any());
        
        KhoaHoc result = khoaHocDAOSpy.selectById(makh);
        
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        List expResult = null;
        List result = instance.selectBySql(sql, args);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectByChuyenDe() {
        System.out.println("selectByChuyenDe");
        String macd = "";
        KhoaHocDAO instance = new KhoaHocDAO();
        List expResult = null;
        List result = instance.selectByChuyenDe(macd);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectYears() {
        System.out.println("selectYears");
        KhoaHocDAO instance = new KhoaHocDAO();
        List expResult = null;
        List result = instance.selectYears();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }
    
}
