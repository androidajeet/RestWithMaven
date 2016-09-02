/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indibrain.restwithmaven;

import java.util.HashMap;
import java.util.Map;



public class TestDatabase {

   private static Map<Long, Doctor> docs=new HashMap<>();

   public static Map<Long, Doctor> getDoctors(){
      return docs;
   }

}