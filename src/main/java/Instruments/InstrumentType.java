package Instruments;

public enum InstrumentType {

    GUITAR ("guitar"),
    SAXOPHONE ("saxophone"),
    DRUMKIT ("drumkit"),
    KEYBOARD ("keyboard");

    final String type;

    InstrumentType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
