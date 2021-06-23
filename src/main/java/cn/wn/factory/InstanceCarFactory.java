package cn.wn.factory;

import cn.wn.entity.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * @author eGene
 * @date 2021/06/21
 * @description 实例工厂类
 */
public class InstanceCarFactory {

    private Map<Integer, Car> carMap;

    public InstanceCarFactory() {
        carMap = new HashMap<>();
        carMap.put(1, new Car(1, "宝马"));
        carMap.put(2, new Car(2, "奥迪"));
    }

    public Car getCar(Integer num) {
        return carMap.get(num);
    }
}
