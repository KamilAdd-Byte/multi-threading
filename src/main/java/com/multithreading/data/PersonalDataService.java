package com.multithreading.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PersonalDataService {

    public CalculatedPersonalDataDto getCalculatedPersonalData(String filePath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            return readAndCalculateLine(reader);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private CalculatedPersonalDataDto readAndCalculateLine(BufferedReader reader) throws IOException {
        CalculatedPersonalDataDto calculatedPersonalDataDto = new CalculatedPersonalDataDto();
        String line = reader.readLine();
        while (line != null) {
            calculatedPersonalDataDto.calculateLine(line);
            line = reader.readLine();

        }
        return calculatedPersonalDataDto;
    }
}
