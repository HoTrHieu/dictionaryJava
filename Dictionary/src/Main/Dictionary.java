/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author HO TRUNG HIEU
 */
public class Dictionary {

    /**
     * @param args the command line arguments
     */
    public void saveHistory(TreeMap<String, String> mapDictionary, String fileName){
        try{
            FileWriter file = new FileWriter(fileName, true);
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            
            Set<String> keySet = mapDictionary.keySet();
            for(String key: keySet) {
                String tempValue = mapDictionary.get(key);
                String writeValue ="\n" + key + "`" + tempValue + "`" + dtf.format(now);
                file.write(writeValue);
            }
            file.close();   
        }catch(IOException e){
            System.out.println("An error occurred.") ;
            e.printStackTrace();
        }
    }
    
    public void saveCrrentSlang(TreeMap<String, String> treeSlang, String fileName) {
         try{
            int index = 0;
            FileWriter file = new FileWriter(fileName);
            
            Set<String> keySet = treeSlang.keySet();
            for(String key: keySet) {
                String tempValue = treeSlang.get(key);
                String writeValue = index == 0 ? (key + "`" + tempValue) : ("\n" + key + "`" + tempValue);
                file.write(writeValue);
                index++;
            }
            file.close();   
        }catch(IOException e){
            System.out.println("An error occurred.") ;
            e.printStackTrace();
        }
    }
    
    public void readHistory(String fileName) {
        try{
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
              String data = reader.nextLine();
              System.out.println(data);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
