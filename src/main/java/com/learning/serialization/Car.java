package com.learning.serialization;

import java.io.*;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String make;
    private int year;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car bmw = new Car("BMW", 1999);
        Car mazda = new Car("mazda", 2000);

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("OutPutFile.txt"));

            oos.writeObject(bmw);
            System.out.println(bmw);
            oos.writeObject(mazda);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            if (oos != null) {
                oos.close();
            }
        }

        /*
        try (
                FileInputStream fileInputStream = new FileInputStream("OutPutFile.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Car bmw1 = (Car) objectInputStream.readObject();

            System.out.println(bmw1.getMake());
            System.out.println(bmw1.getYear());
        }*/
    }
}

