package com.kaiman21.studyguide.kaiman.studyguide;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Kaiman on 12/22/14.
 */
public class TestForReadingQuestion {
    public void main(String[] args) {
        /** Scanner to read the data for the question. */
        try {
            FileReader _reader = new FileReader("raw/categorytest0.txt");
            Scanner _inp = new Scanner(_reader);

        } catch (IOException e) {
            System.out.println("There was an error, the file was not found");
        }
    }

}
