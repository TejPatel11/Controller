package com.PojoDemo.controllers;

import com.PojoDemo.Bike;
import com.PojoDemo.Car;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public List <Car>getCars(){
    List<Car> carList = new ArrayList<Car>();
    carList.add(new Car("Chevy","Impala",20000, 180, false));
    carList.add(new Car("Ford", "Mustang", 50000, 200, false));
        System.out.println("The controller is " + carList);
    return carList;

}
//public List addCar(Car car){
//    List<Car> carList = new ArrayList<Car>();
//    carList.add(car);
//    return carList;
//}
@RequestMapping(value = "/bikes", method = RequestMethod.GET)
public List <Bike>getBikes(){
    List<Bike> bikeList = new ArrayList<Bike>();
    bikeList.add(new Bike("Suzuki","mototech","yellow", 24000));
    bikeList.add(new Bike("Harley", "Cobra 909", "Blue", 50000));
    System.out.println("The bike controller is " + bikeList);
    return bikeList;

}
}
