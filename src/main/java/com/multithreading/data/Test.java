package com.multithreading.data;

import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class Test {

    private  static PathManager pathManager = new PathManager();
    private static PersonalDataService personalDataService = new PersonalDataService();
    public static void main(String[] args) {

        // Metoda absolute path () ściażka do pliku
        String file = "data1.txt";
        String absoluteResourceFilePath = pathManager.createAbsoluteResourceFilePath(file);
        log.info(absoluteResourceFilePath);


        List<String> fileNamesList = Arrays.asList("data1.txt", "data2.txt", "data3.txt", "data4.txt", "data5.txt", "data6.txt"
                , "data7.txt", "data8.txt", "data9.txt", "data10.txt", "data11.txt", "data12.txt");


        long start = System.currentTimeMillis();
        CalculatedPersonalDataDto dataDto = multiThread(fileNamesList);
        long stop = System.currentTimeMillis();


        System.out.println(dataDto + " czas wykonania: " + (stop-start));
    }

    // czas 1953 milis
    public static CalculatedPersonalDataDto singleThread(List<String> fileNames){
       CalculatedPersonalDataDto dto = new CalculatedPersonalDataDto();
        for (String fileName : fileNames) {
            dto.add(personalDataService.getCalculatedPersonalData(pathManager.createAbsoluteResourceFilePath(fileName)));
        }
    return dto;
    }

    // czas < 1300 milis
    public static CalculatedPersonalDataDto multiThread (List<String> fileNames){
        CalculatedPersonalDataDto dto = new CalculatedPersonalDataDto();
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<CalculatedPersonalDataDto> submit1 = service.submit(() -> singleThread(fileNames.subList(0, 5)));
        Future<CalculatedPersonalDataDto> submit = service.submit(() -> singleThread(fileNames.subList(6, 9)));
        Future<CalculatedPersonalDataDto> submit2 = service.submit(() -> singleThread(fileNames.subList(10, 12)));

        try {
            dto.add(submit.get());
            dto.add(submit1.get());
            dto.add(submit2.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.getMessage();
        }
         return dto;
    }
}
