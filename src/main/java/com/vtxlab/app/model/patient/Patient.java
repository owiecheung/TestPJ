package com.vtxlab.model.patient;

import com.vtxlab.model.enums.PatientStatus;
import com.vtxlab.model.enums.Symptoms;

public class Patient {
  private  String name;
  private  int age;
  private PatientStatus pCode;
  private Symptoms sym;


  public Patient(String name,int age,PatientStatus pCode,Symptoms sym){
    this.name = name;
    this.age = age;
    this.pCode = pCode;
    this.sym = sym;
  }

  //getter
  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }
  public PatientStatus getPcode() {
    return this.pCode;
  }
  public Symptoms getSym() {
    return this.sym;
  }



  //setter
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printAll(){
    System.out.println("NAME : " + this.name + ", AGE : " + this.age + ", STATUS : " + this.pCode+ ", SYMPTOMS : " + this.sym);
  }

  public static void printState(){
   return;
  }
}

  /* 
  @Override
  public String toString(){

  }

  }

*/
