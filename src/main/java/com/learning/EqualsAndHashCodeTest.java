package com.learning;

import java.util.HashMap;
import java.util.Map;

class Team {

    String city;
    String department;

    public Team(String city, String department) {
        this.city = city;
        this.department = department;
    }

    @Override
    public final boolean equals(Object o) {
        // implementation
        if (o == this)
            return true;

        if (!(o instanceof Team other))
            return false;
        //Team other = (Team) o;

        boolean cityEquals = (this.city == null && other.city == null)
                || (this.city != null && this.city.equals(other.city));
        boolean departmentEquals = (this.department == null && other.department == null)
                || (this.department != null && this.department.equals(other.department));
        return cityEquals && departmentEquals;
    }

    @Override
    public final int hashCode() {
        int result = 17;
        if (city != null) {
            result = 31 * result + city.hashCode();
        }
        if (department != null) {
            result = 31 * result + department.hashCode();
        }
        return result;
    }
}

public class EqualsAndHashCodeTest {

    public static void main(String[] args) {
        Map<Team, String> leaders = new HashMap<>();
        leaders.put(new Team("New York", "development"), "Anne");
        leaders.put(new Team("Boston", "development"), "Brian");
        leaders.put(new Team("Boston", "marketing"), "Charlie");

        Team myTeam = new Team("New York", "development");
        Team myTeam2 = new Team("New York", "development");
        System.out.println("Are myTeam and myTeam2 equal? :" + myTeam.equals(myTeam2));
        System.out.println(myTeam.hashCode() + " " + myTeam2.hashCode());
        boolean hashCodeEqual = String.valueOf(myTeam.hashCode()).equals(String.valueOf(myTeam2.hashCode()));
        System.out.println("Are myTeam and myTeam2 hashCodes equal? :" + hashCodeEqual);
        String myTeamLeader = leaders.get(myTeam);

        System.out.println(myTeamLeader);
        System.out.println(myTeam.getClass());
    }
}

