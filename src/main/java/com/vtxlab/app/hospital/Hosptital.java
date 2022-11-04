package com.vtxlab.app.hospital;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vtxlab.app.enums.PatientStatus;
import com.vtxlab.app.enums.Symptoms;
import com.vtxlab.app.model.patient.Patient;

public class Hosptital {
  public static void main(String[] args) {
    List<Patient> room1 = Arrays.asList(new Patient("John", 20,PatientStatus.STAYING,Symptoms.FEVER),new Patient("May", 20,PatientStatus.STAYING,Symptoms.DIFFICULTY_BREATHING));
    //Patient("John", 20,PatientStatus.STAYING,Symptoms.FEVER);
    //System.out.println(p1.getAge());
    
    List<Patient> room2 = Arrays.asList(new Patient("Ksw", 60,PatientStatus.DISCHARGED,Symptoms.HEADACHE),new Patient("Ho", 16,PatientStatus.STAYING,Symptoms.DIFFICULTY_BREATHING));
    List<Patient> room3 = Arrays.asList(new Patient("Tew", 40,PatientStatus.DISCHARGED,Symptoms.COUGH),new Patient("Gec", 24,PatientStatus.DISCHARGED,Symptoms.DIFFICULTY_BREATHING));

    Map<Integer , List<Patient>> floor1 = new HashMap<>();
    floor1.put(1, room1);
    floor1.put(2, room2);
    floor1.put(3, room3);

    System.out.println("\n----------------------");
    for ( Map.Entry<Integer, List<Patient>> m : floor1.entrySet()){
      for(Patient s :  m.getValue()){
        s.printAll();
      }
    }

    
    
   // System.out.println(floor1);
   // floor1.forEach(e -> System.out.println("NAME : " + e.getName()+ ", AGE : " +e.getAge()+ ", STATUS : " +e.getPcode()+ ", SYMPTOMS : " + e.getSym()));

    //allPatient.forEach(e -> System.out.println("NAME : " + e.getName()+ ", AGE : " +e.getAge()+ ", STATUS : " +e.getPcode()+ ", SYMPTOMS : " + e.getSym()));
  }
}
