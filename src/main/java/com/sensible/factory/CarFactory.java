package com.sensible.factory;

/**
 * @author liuyc
 * @Description: 汽车工厂实现类
 * @date 2020/5/6 000616:42
 */
public class CarFactory extends AbstractCarFactory{
    @Override
    public <T extends Car> T createCar(Class<T> tClass) {
        Car car = null;
        try{
            car = (T)Class.forName(tClass.getName()).newInstance();
        }catch (Exception e){

        }
        return (T)car;
    }
}
