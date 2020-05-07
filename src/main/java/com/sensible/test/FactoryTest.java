package com.sensible.test;

import com.sensible.factory.AbstractCarFactory;
import com.sensible.factory.AudiCar;
import com.sensible.factory.CarFactory;

/**
 * @author liuyc
 * @Description: 工厂模式测试
 * @date 2020/5/7 00079:37
 */
public class FactoryTest {
    public static void main(String[] args) {
        AbstractCarFactory carFactory = new CarFactory();
        carFactory.createCar(AudiCar.class);
    }
}
