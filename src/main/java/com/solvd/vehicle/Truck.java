package com.solvd.vehicle;

import com.solvd.Main;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Truck extends Vehicle{
    private static final Logger LOGGER = Logger.getLogger(Truck.class.getName());
    private String truckCode;

    public Truck(String truckCode, String model, int capacity,LocalDateTime year){
        super(model, capacity, year);
        this.truckCode=truckCode;
    }

    public String getTruckCode(){
        return truckCode;
    }

    public void setTruckCode(String truckCode){
        this.truckCode=truckCode;
    }

    @Override
    public void start() {
        LOGGER.info("dgd");
    }
    @Override
    public void stop() {

    }
    @Override
    public void recharge() {
    }
    @Override
    public String toString(){
        return "Truck{" + "truckCode='" + truckCode + '\'' + ", " + super.toString();
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true; //Сравнение по ссылке, ссылаются ли оба объекта на один и тот же участок памяти
        if (!(o instanceof Truck)) return false; //Проверка типа объекта, является ли объект о экземпляром класса truck
        Truck truck = (Truck) o;
        return Objects.equals(getTruckCode(),truck.getTruckCode()) && //создается новый объект Truck из объекта o и сравнивается поле truckCode с использованием метода Objects.equals
                super.equals(o); //расширяет метод equals родительского класса Vehicle, добавляя к сравнению еще и поле truckCode
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(getTruckCode());
    }
}
