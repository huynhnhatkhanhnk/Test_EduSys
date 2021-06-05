/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.utils.XJdbc;
import com.mockrunner.mock.jdbc.MockConnection;
import com.mockrunner.mock.jdbc.MockResultSet;
import com.mockrunner.mock.jdbc.MockStatement;
import java.util.List;

import static org.junit.Assert.*;

import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author Phuong Thao
 */

@PrepareForTest({XJdbc.class, ThongKeDAO.class})
public class ThongKeDAOngTest1 extends PowerMockTestCase{
    ThongKeDAO thongKeDAOSpy;
    
    @Mock
    MockConnection connection;
    @Mock
    MockStatement statement;
    @Spy
    @InjectMocks
    MockResultSet rs = new MockResultSet("myMock");
    
    
    public ThongKeDAOngTest1() {
    }
    
    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
    
    @BeforeMethod
    public void setUp() {
        PowerMockito.mockStatic(XJdbc.class);
        thongKeDAOSpy = PowerMockito.spy(new ThongKeDAO());
    }
    
    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testGetLuongNguoiHoc() throws Exception {
        System.out.println("getluongnuoihoc");
        
        rs = initMockResultSet();
        
        PowerMockito.when(XJdbc.query(ArgumentMatchers.anyString())).thenReturn(rs);
        
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = thongKeDAOSpy.getLuongNguoiHoc();
        
        assertEquals(1, result.size());
    }
    
    @Test
    public void testGetLuongNguoiHocWithMultipleDate() throws Exception {
        System.out.println("getluongnuoihoc");
        
        rs = initMultipleDateMockResultSet();
        
        PowerMockito.when(XJdbc.query(ArgumentMatchers.anyString())).thenReturn(rs);
        
        PowerMockito.when(rs.getStatement()).thenReturn(statement);
        PowerMockito.when(statement.getConnection()).thenReturn(connection);
        
        List result = thongKeDAOSpy.getLuongNguoiHoc();
        
        assertEquals(3, result.size());
    }
    
    @Test
    public void testGetBangDiem() {
    }

    @Test
    public void testGetDiemChuyenDe() {
    }

    @Test
    public void testGetDoanhThu() {
    }

    private MockResultSet initMockResultSet() throws Exception{
        rs.addColumn("Nam", new Integer[]{1});
        rs.addColumn("SoLuong", new Integer[]{1});
        rs.addColumn("Dautien", new java.sql.Date[]{
            new java.sql.Date(new java.util.Date().getTime())
        });
        rs.addColumn("Cuoicung", new java.sql.Date[]{
            new java.sql.Date(new java.util.Date().getTime())
        });
        rs.beforeFirst();
        return rs;
    }

    private MockResultSet initMultipleDateMockResultSet() throws Exception{
        rs.addColumn("Nam", new Integer[]{1,2,5});
        rs.addColumn("SoLuong", new Integer[]{1,5,7});
        rs.addColumn("Dautien", new java.sql.Date[]{
            new java.sql.Date(new java.util.Date().getTime()),
            new java.sql.Date(new java.util.Date().getTime())
        });
        rs.addColumn("Cuoicung", new java.sql.Date[]{
            new java.sql.Date(new java.util.Date().getTime()),
            new java.sql.Date(new java.util.Date().getTime()),
            new java.sql.Date(new java.util.Date().getTime())
        });
        rs.beforeFirst();
        return rs;
    }
    
}
