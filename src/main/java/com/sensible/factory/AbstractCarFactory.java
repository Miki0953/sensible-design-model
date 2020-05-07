package com.sensible.factory;

/**
 * @author liuyc
 * @Description: 抽象汽车工厂
 * @date 2020/5/6 000615:58
 */
public abstract class AbstractCarFactory {
    /**
     * 工厂模式方法，生产汽车
     * @param tClass
     * @param <T>
     * @return 返回继承了Car接口的对象
     */
    public abstract <T extends Car> T createCar(Class<T> tClass);
}
