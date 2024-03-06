package com.learning;

public class Employee {

    private String id;
    private String name;

    /**Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee : Id : " + id + " :" + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee)
            return this.id == ((Employee) obj).getId() &&
                    this.name == ((Employee) obj).getName();
        return false;
    }


    @Override
    public int hashCode() {
        int result = 17;  // Start with a non-zero constant

        // Combine the hash code with the hash codes of the object's fields
        result = 31 * result + id.hashCode();
        result = 31 * result + name.hashCode();
        // Repeat this pattern for all relevant fields

        return result;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId("11");
        employee.setName("Ashwini");

        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }


}
