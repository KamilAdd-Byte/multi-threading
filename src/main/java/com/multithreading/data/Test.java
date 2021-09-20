package com.multithreading.data;

public class Test {

    private  static PathManager pathManager = new PathManager();
    private static PersonalDataService personalDataService = new PersonalDataService();
    public static void main(String[] args) {

//        String file = "data1.txt";
//        String absoluteResourceFilePath = pathManager.createAbsoluteResourceFilePath(file);
//        System.out.println(absoluteResourceFilePath);


        personalDataService.getCalculatedPersonalData(pathManager.createAbsoluteResourceFilePath("data2.txt"));
   }
}
