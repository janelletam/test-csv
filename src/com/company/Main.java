package com.company;

import com.opencsv.CSVParser;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Reader reader = new BufferedReader(new FileReader("src/com/company/mentor.csv"));

        CsvToBean<Mentor> csvReader = new CsvToBeanBuilder(reader)
                .withType(Mentor.class)
                .withSeparator(',')
                .withIgnoreLeadingWhiteSpace(true)
                .withIgnoreEmptyLine(true)
                .build();
        List<Mentor> results = csvReader.parse();
    }
}
