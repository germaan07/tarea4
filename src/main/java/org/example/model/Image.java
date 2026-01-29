package org.example.model;

import lombok.Data;

@Data
public class Image extends Archivo{
    private int height;
    private int broad;

    public Image(int size, String path, int height, int broad) {
        super(size, path);
        this.height = height;
        this.broad = broad;
    }
}
