/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indibrain.restwithmaven;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ELITEBOOK 8740P
 */

@XmlRootElement
public class Doctor {
   private long id;
   private String firstName;
   private String lastName;
   private String specializeIn;

   public Doctor() {
      super();
   }

   public Doctor(long id, String firstName,
         String lastName, String specializeIn) {
      super();
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.specializeIn = specializeIn;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getSpecializeIn() {
      return specializeIn;
   }

   public void setSpecializeIn(String specializeIn) {
      this.specializeIn = specializeIn;
   }
}