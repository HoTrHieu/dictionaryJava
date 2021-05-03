/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileWriter;
import java.io.IOException;
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
    //public void saveCloneFile
//    public String getSlangByKey(String key) {
//        this.treeSlang.containsValue(key);
//    }
}
