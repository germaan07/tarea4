package org.example.model;

import lombok.Data;

@Data
public class Image extends Archivo{
    private int width;
    private int height;

    public Image(int size, String path, int width, int height) {
        super(size, path);
        this.width = width;
        this.height = height;
    }

    public void open(){
        super.open();
        System.out.println("ALTURA: " + width);
        System.out.println("ANCHURA: " + height);
    }
}
