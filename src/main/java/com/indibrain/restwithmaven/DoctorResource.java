/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indibrain.restwithmaven;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/doctors")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DoctorResource {

   DoctorService doctorService=new DoctorService();

   @GET
   public List<Doctor> getDoctors(){
      return doctorService.getAllDoctors();
   }

   @GET
   @Path("/{doctorId}")
   public Doctor getDoctor(@PathParam("doctorId")
         long id){
      return doctorService.getDoctor(id);
   }

   @POST
   public Doctor addDoctor(Doctor doc){
      return doctorService.addDoctor(doc);
   }

   @PUT
   @Path("/{doctorId}")
   public Doctor updateDoctor(@PathParam("doctorId")
         long id, Doctor doc){
      doc.setId(id);
      return doctorService.updateDoctor(doc);
   }

   @DELETE
   @Path("/{doctorId}")
   public void removeDoctor(@PathParam("doctorId")
         long id){
      doctorService.removeDoctor(doctorService.getDoctor(id));
   }
}