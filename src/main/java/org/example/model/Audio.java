package org.example.model;

import lombok.Data;

@Data
public class Audio extends Archivo {
    private int duration;

    public Audio(int size, String path, int duration) {
        super(size, path);
        this.duration = duration;
    }

    public void open(){
        super.open();;
        System.out.println("DURACIÓN: " + duration);
    }
}
