package com.company.Hw13March;

public class SomeClass implements Comparable<SomeClass>{

    private String someField;
    private int someNumField;

    public SomeClass(String someField, int someNumField) {
        this.someField = someField;
        this.someNumField = someNumField;
    }

    public String getSomeField() {
        return someField;
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    public int getSomeNumField() {
        return someNumField;
    }

    public void setSomeNumField(int someNumField) {
        this.someNumField = someNumField;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "someField='" + someField + '\'' +
                ", someNumField=" + someNumField +
                '}';
    }

    @Override
    public int compareTo(SomeClass o) {
        int result = this.someField.compareTo(o.getSomeField());
        if(result == 0){
            if(this.someNumField > o.getSomeNumField()){
                result = 1;
            } else if(this.someNumField < o.getSomeNumField()){
                result = -1;
            }else {
                result = 0;
            }
        }
        return result;
    }
}
