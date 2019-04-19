/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.drmarker.Recommend;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author 12242
 */
public class SportRecommender {
    
    ArrayList<Sport> sports = new ArrayList<>();
    
    public SportRecommender() {
        try {
            // read.
            FileInputStream fileInputStream = new FileInputStream("src/calories.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			
            String str = new String();
            while((str = bufferedReader.readLine()) != null) {
                // each line: name, calories, type, breakfast, lunch, dinner.
                String[] sportInfo = str.split(",");
                String name = sportInfo[0];
                int calories = Integer.parseInt(sportInfo[1]);
                
                Sport sport = new Sport(name, calories);
                sports.add(sport); // add into arraylist.
            }

            // close.
            fileInputStream.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.getStackTrace();
            System.out.println("Error for checking file's exist.");
        } catch (NumberFormatException e) {
            e.getStackTrace();
            System.out.println("Error for raw data format.");
        }
    }
}