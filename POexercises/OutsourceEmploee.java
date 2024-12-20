package src.POexercises;

public class OutsourceEmploee extends Employee{
    // Método para cobranca dos funcionarios terceirizados;
     private Double additionalCharge;

     public OutsourceEmploee() {

     }

    public OutsourceEmploee(String nameEmploy, Integer hoursEmploy, Double valuePorHour, Double additionalCharge) {
        super(nameEmploy, hoursEmploy, valuePorHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }


    @Override
    public Double payment() {
         double result = super.payment() + additionalCharge * 1.1;
         return  result;
    }
}
