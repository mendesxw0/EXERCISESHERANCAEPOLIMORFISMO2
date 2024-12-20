package src.POexercises;

public class Employee {
    private String nameEmploy;
    private Integer hoursEmploy;
    private Double valuePorHour;


    public Employee() {

    }

    public Employee(String nameEmploy, Integer hoursEmploy, Double valuePorHour) {
        this.nameEmploy = nameEmploy;
        this.hoursEmploy = hoursEmploy;
        this.valuePorHour = valuePorHour;
    }

    public String getNameEmploy() {
        return nameEmploy;
    }

    public void setNameEmploy(String nameEmploy) {
        this.nameEmploy = nameEmploy;
    }

    public Integer getHoursEmploy() {
        return hoursEmploy;
    }

    public void setHoursEmploy(Integer hoursEmploy) {
        this.hoursEmploy = hoursEmploy;
    }

    public Double getValuePorHour() {
        return valuePorHour;
    }

    public void setValuePorHour(Double valuePorHour) {
        this.valuePorHour = valuePorHour;
    }


    public Double payment() {
        Double result = hoursEmploy *  valuePorHour;
        return  result;
    }
}
