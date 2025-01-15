package javaOOP.application;

import javaOOP.data.Application;
import javaOOP.data.Constant;
import javaOOP.data.Country;
import javaOOP.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,1,1));

        Country.City city = new Country.City();
        city.setName("Alabama");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
