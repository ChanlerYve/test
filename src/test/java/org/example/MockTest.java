package org.example;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class MockTest {
    @Test
    public void myTest(){
        //创建mock对象
        App app = mock(App.class);
        //设置stub代替checkDay()方法


        when(app.checkDay()).thenReturn(true);
        when(app.checkMonth()).thenReturn(1);
        when(app.judgeAll()).thenReturn(true);
//        //验证stub是否代替成功
//        boolean retStub = (Integer)app.checkDay();
//        Assert.assertEquals(true,retStub);

        //checkDay中注入了一个错误，检测stub是否能屏蔽掉
        app.setMonth(12);
        app.setDay(31);
        Assert.assertEquals(true,app.checkDay());
        Assert.assertEquals(1,app.checkMonth());
        Assert.assertEquals(true,app.judgeAll());

    }

}
