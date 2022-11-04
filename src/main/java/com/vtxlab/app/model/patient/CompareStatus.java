package com.vtxlab.model.patient;

import java.util.Comparator;

import com.vtxlab.model.enums.PatientStatus;

public class CompareStatus implements Comparator<PatientStatus> { 

  @Override
	public int compare(PatientStatus a, PatientStatus b) { 
        if(a.getCode() > b.getCode()){
            return 1;
        }else if (a.getCode() == b.getCode()) {
            return 0;
        }else if (a.getCode() < b.getCode()){
            return -1;
        }
        return -1;
	} 
}