package org.example.model;

import lombok.Data;

@Data

public class Text extends Archivo{
    private String text;

    public Text(int size, String path, String text) {
        super(size, path);
        this.text = text;
    }

    public void open(){
        super.open();
        System.out.println("TEXTO: " + text);
    }
}
