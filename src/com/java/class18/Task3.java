package com.java.class18;

public class Task3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
     */
public static void main (String[] args){
    mathTeacher math=new mathTeacher();
    math.name="Demir";
    math.teachMath();



}
}


class Teacher{
    String name;
    void teach(){
        System.out.println("Teachers teach subjects");

    }
}
class mathTeacher extends Teacher{

    void teachMath(){
        System.out.println("Teaches math");

    }
}
class chemistryTeacher extends Teacher{

    void teachChemistry(){
        System.out.println("Teaches chemistry");

    }
}
class pianoTeacher extends Teacher{

    void teachPiano(){
        System.out.println("Teaches Piano");

    }
}