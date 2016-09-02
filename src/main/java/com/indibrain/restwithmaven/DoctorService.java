/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indibrain.restwithmaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class DoctorService {

   private Map<Long, Doctor> docs = TestDatabase.getDoctors();

   public DoctorService(){
      docs.put(1L, new Doctor(1L, "Amit", "Sharma",
         "Cardiac Surgeon"));
      docs.put(2L, new Doctor(2L, "Deepak", "Chopra",
         "Oncologist"));
      docs.put(3L, new Doctor(2L, "Sakshi", "Verma",
         "Neurologist"));
      docs.put(4L, new Doctor(2L, "Abhishek", "Tirki",
         "ENT"));
      docs.put(5L, new Doctor(2L, "Santanu", "Ahuja",
         "Dermatologist"));
      docs.put(6L, new Doctor(2L, "Binod", "Bansal",
         "Cardiac Surgeon"));
      docs.put(7L, new Doctor(2L, "Arup", "Sarkar",
         "Neurologist"));
   }


   public List<Doctor> getAllDoctors() {
      return new ArrayList<Doctor>(docs.values());
   }

   public Doctor getDoctor(long id) {
      return docs.get(id);
   }

   public Doctor addDoctor(Doctor doc) {
      doc.setId(docs.size() + 1);
      docs.put(doc.getId(), doc);
      return doc;
   }

   public Doctor updateDoctor(Doctor doc) {
      if (doc.getId() <= 0)
      return null;
      docs.put(doc.getId(), doc);
      return doc;
   }

   public Doctor removeDoctor(Doctor doc) {
      return docs.remove(doc.getId());
   }

}