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
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author HO TRUNG HIEU
 */
public class SlangsManage {
    TreeMap<String, String> treeSlang = new TreeMap<String, String>();
 
    public TreeMap<String, String> getSlang() {
        return treeSlang;
    }

    public void setSlang(TreeMap<String, String> tree) {
        this.treeSlang = tree;
    }
    
    public boolean addSlangItem(String key, String value){
        if(this.treeSlang.containsKey(key)){
            return false;
        }else {
            this.treeSlang.put(key, value);
            return true;
        }
    }
    
    public void editSalngItem(String key, String value) {
        this.treeSlang.put(key, value);
    }
    
    public void deleteSlangItem(String key) {
        this.treeSlang.remove(key);
    }
    
    public boolean addSlangSave(String key, String value){
        if(this.treeSlang.containsKey(key)){
            return false;
        }else {
            this.treeSlang.put(key, value);
            saveItemSlang(key, value);
            return true;
        }
    }
    
    public void saveItemSlang(String key, String value) {
        try{
            FileWriter file = new FileWriter("slang.txt", true);
            String writeValue ="\n" + key + "`" + value;
            file.write(writeValue);
            file.close();  
        }catch(IOException e){
            System.out.println("An error occurred.") ;
            e.printStackTrace();
        }
    }
    
    public void resetSlang() throws IOException {
        this.treeSlang.clear();
        try {            
            FileWriter fileSave = new FileWriter("slang.txt");
           
            File file = new File("backup.txt");
            Scanner myReader = new Scanner(file);
            int count = 0;
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();
              String[] arrItem = line.split("`");   
              
              if(arrItem.length == 2){
                if(this.treeSlang.containsKey(arrItem[0])){
                    System.out.println(arrItem[0]);     
                }
                this.addSlangItem(arrItem[0], arrItem[1]);
              }
              if(arrItem.length == 1){
                  this.addSlangItem("null" + count , arrItem[0]);
                  count++;
              }
              
              fileSave.write(line + "\n");
            }
            myReader.close();
            fileSave.close();  
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //public void saveCloneFile
//    public String getSlangByKey(String key) {
//        this.treeSlang.containsValue(key);
//    }
}
