/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.TreeMap;

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
    
    public void addSlangItem(String key, String value){
        this.treeSlang.put(key, value);
    }
    
    public void editSalngItem(String key, String value) {
        this.treeSlang.put(key, value);
    }
    
    public void deleteSlangItem(String key) {
        this.treeSlang.remove(key);
    }
    
    
    
//    public String getSlangByKey(String key) {
//        this.treeSlang.containsValue(key);
//    }
}
