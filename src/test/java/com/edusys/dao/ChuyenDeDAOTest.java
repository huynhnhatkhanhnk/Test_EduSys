/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.ChuyenDe;
import com.edusys.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author Phuong Thao
 */
//Sử dụng Junit4 và Mockito,Powermock
@RunWith(PowerMockRunner.class)
@PrepareForTest({XJdbc.class, ChuyenDeDAO.class})
public class ChuyenDeDAOTest {
    
    ChuyenDeDAO chuyenDeDAO;
    ChuyenDeDAO chuyenDeDaoSpy;
    
    public ChuyenDeDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        chuyenDeDAO = new ChuyenDeDAO();
        PowerMockito.mockStatic(XJdbc.class);
        chuyenDeDaoSpy = PowerMockito.spy(new ChuyenDeDAO());
    }
    
    @After
    public void tearDown() {
    }
    
    //chèn với giá trị null
    @Test(expected = Exception.class)
    public void testInsertWithNullModel() {
        
        ChuyenDe model = null;
        chuyenDeDAO.insert(model);
        
    }
    
    //chèn giá trị rỗng
    @Test(expected = Exception.class)
    public void testInsertWithEmptyModel() {
        
        ChuyenDe model = new ChuyenDe();
        
        chuyenDeDAO.insert(model);
        
    }
    
    //chèn mới dữ liệu vào
    @Test
    public void testInsertWithValiModel() {
        ChuyenDe model = new ChuyenDe();
        model.setHinh("test.jsp");
        model.setHocPhi(100);
        model.setMaCD("CD01");
        model.setMoTa("Mo ta");
        model.setTenCD("chuyen de");
        model.setThoiLuong(20);
        
        
        chuyenDeDAO.insert(model);
        
    }

    //updeta null
    @Test(expected = Exception.class)
    public void testUpdateWithNullModel() {    
        ChuyenDe model = null;
        chuyenDeDAO.update(model);
    }
    
    //update rỗng
    @Test(expected = Exception.class)
    public void testUpdateWithEmptyModel() {    
        ChuyenDe model = new ChuyenDe();
        chuyenDeDAO.update(model);
    }

    //update với giá trị nhập
    @Test
    public void testUpdateWithValiModel() {    
        ChuyenDe model = new ChuyenDe();
        model.setHinh("test.jsp");
        model.setHocPhi(100);
        model.setMaCD("CD01");
        model.setMoTa("Mo ta");
        model.setTenCD("chuyen de");
        model.setThoiLuong(20);
        
        
        chuyenDeDAO.update(model);
    }
    
    //xóa rỗng
    @Test(expected = Exception.class)
    public void testDeleteWithEmptyId() {
        String MaCD = "";
        chuyenDeDAO.delete(MaCD);
    }
    
    //xóa null
    @Test(expected = Exception.class)
    public void testDeleteWithNullId() {
        String MaCD = null;
        chuyenDeDAO.delete(MaCD);
    }
    
    //xóa một giá trị
    @Test
    public void testDeleteWithValiId() {
        String MaCD = "10";
        chuyenDeDAO.delete(MaCD);
    } 

    @Test
    public void testSelectAll() throws Exception{
        System.out.println("selectAll");
        
        ChuyenDe chuyenDe = new ChuyenDe();
        List<ChuyenDe> expResult = new ArrayList<>();   
        expResult.add(chuyenDe);
        
        PowerMockito.doReturn(expResult)
                .when(chuyenDeDaoSpy, "selectBySql", ArgumentMatchers.anyString());
        
        List<ChuyenDe> result = chuyenDeDaoSpy.selectAll();
        assertThat(result, CoreMatchers.is(expResult));
    }

    //Ko tìm thấy
    @Test
    public void testSelectByIdWithNotFound() throws Exception{
        System.out.println("selectById");
        String macd = "";
        
        ChuyenDe expResult = null;
        List<ChuyenDe> resultList = new ArrayList<>();   
        
        
        PowerMockito.doReturn(resultList)
                .when(chuyenDeDaoSpy, "selectBySql", ArgumentMatchers.anyString(),ArgumentMatchers.any());
       
        ChuyenDe result = chuyenDeDaoSpy.selectById(macd);
        assertThat(result, CoreMatchers.is(expResult));
    }
    
    @Test
    public void testSelectByIdWithFound() throws Exception{
        System.out.println("selectById");
        String macd = "12";
        
        ChuyenDe expResult = new ChuyenDe();
        List<ChuyenDe> resultList = new ArrayList<>();   
        resultList.add(expResult);
        
        
        PowerMockito.doReturn(resultList)
                .when(chuyenDeDaoSpy, "selectBySql", ArgumentMatchers.anyString(),ArgumentMatchers.any());
       
        ChuyenDe result = chuyenDeDaoSpy.selectById(macd);
        assertThat(result, CoreMatchers.is(expResult));
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        List<ChuyenDe> expResult = null;
        List<ChuyenDe> result = instance.selectBySql(sql, args);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
