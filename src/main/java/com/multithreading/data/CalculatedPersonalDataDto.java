package com.multithreading.data;

public class CalculatedPersonalDataDto {

    private long amountOfFemales;
    private long amountOfMales;
    private long amountOfShortName;
    private long amountOfLongName;


    public  void add (CalculatedPersonalDataDto calculatedPersonalDataDto){
        this.setAmountOfFemales(this.getAmountOfFemales() + calculatedPersonalDataDto.getAmountOfFemales());
        this.setAmountOfLongName(this.getAmountOfLongName() + calculatedPersonalDataDto.amountOfLongName);
        this.setAmountOfMales(this.getAmountOfMales() + calculatedPersonalDataDto.amountOfFemales);
        this.setAmountOfShortName(this.getAmountOfShortName() + calculatedPersonalDataDto.amountOfShortName);
    }

    public void calculateLine(String line){
        String[] split = line.split(",");
        if (split[0].length() <= 6){
            amountOfShortName++;
        }else {
            this.amountOfLongName++;
        }
        if ("Female".equals(split[3])){
            this.amountOfFemales++;
        }else {
            this.amountOfMales++;
        }
    }

    public long getAmountOfFemales() {
        return amountOfFemales;
    }

    public void setAmountOfFemales(long amountOfFemales) {
        this.amountOfFemales = amountOfFemales;
    }

    public long getAmountOfMales() {
        return amountOfMales;
    }

    public void setAmountOfMales(long amountOfMales) {
        this.amountOfMales = amountOfMales;
    }

    public long getAmountOfShortName() {
        return amountOfShortName;
    }

    public void setAmountOfShortName(long amountOfShortName) {
        this.amountOfShortName = amountOfShortName;
    }

    public long getAmountOfLongName() {
        return amountOfLongName;
    }

    public void setAmountOfLongName(long amountOfLongName) {
        this.amountOfLongName = amountOfLongName;
    }

    @Override
    public String toString() {
        return "CalculatedPersonalDataDto{" +
                "amountOfFemales=" + amountOfFemales +
                ", amountOfMales=" + amountOfMales +
                ", amountOfShortName=" + amountOfShortName +
                ", amountOfLongName=" + amountOfLongName +
                '}';
    }
}
