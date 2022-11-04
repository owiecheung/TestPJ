package com.vtxlab.model.enums;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public enum PatientStatus {
  STAYING(1,"Stay in hospitial"),
  DISCHARGED(2,"Discharged from the hospitial"), 
  DEFAULT(3,"ERROR: Patient Status Unknow ")
  ;

  public static PatientStatus pCode;
  private int code;
  private String pStatus;

  private PatientStatus(int code,String pStatus){
    this.code = code;
    this.pStatus = pStatus;
  }

  public String getpStatus() {
    return this.pStatus;
  }
  public int getCode() {
    return this.code;
  }

  public static PatientStatus fromCode(int code){
    for(PatientStatus o : PatientStatus.values()){
       if ( o.code == code){
        return o;
      }
    }
    return PatientStatus.DEFAULT;
  }

  public static PatientStatus fromCode2(int code){  //OrderStatus.values() returns OrderStatus[]
    //stream
    ////OrderStatus.values() returns OrderStatus[]
    //Findfirst() -> return Optional
    //if not found
    //throw OrderStatus.DEFAULT
    //Optional.orElse
    return Arrays.stream(PatientStatus.values())
                 .filter(e -> e.code == code)
                 .findFirst().orElse(PatientStatus.DEFAULT);
  }

  public static Optional<PatientStatus> fromCode3(int code)  {  //OrderStatus.values() returns OrderStatus[]
    return Arrays.stream(PatientStatus.values())
                 .filter(e -> e.code == code)
                 .findFirst();//.orElseThrow(() -> new IllegalArgumentException());
  }

}

