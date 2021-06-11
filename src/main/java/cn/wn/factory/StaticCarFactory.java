package cn.wn.factory;

import cn.wn.entity.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * @author eGene
 * @date 2021/06/11
 * @description
 */
public class StaticCarFactory {

    private static Map<Integer, Car> carMap;

    static {
        carMap = new HashMap<>();
        carMap.put(1, new Car(1, "宝马"));
        carMap.put(2, new Car(2, "奥迪"));
    }

    public static Car getCar(Integer num) {
        return carMap.get(num);
    }

}
