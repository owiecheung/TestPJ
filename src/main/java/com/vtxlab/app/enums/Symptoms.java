package com.vtxlab.model.enums;

public enum Symptoms {
  COUGH(1,"Cough"),
  HEADACHE(2,"Headache"),
  FEVER(3,"Fever"),
  DIFFICULTY_BREATHING(4,"Difficulty Breathing")
  ;

  public static Symptoms sym;
  private int code;
  private String des;

  private Symptoms(int code,String des){
    this.code = code;
    this.des = des;
  }

  public int getCode() {
    return this.code;
  }
  public String getDes() {
    return this.des;
  }

}
