package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public abstract class Archivo{
    protected int size;
    protected String path;

    public void open(){
        System.out.println("NOMBRE: ");
        System.out.println("TAMAÑO: " + size);
        System.out.println("RUTA: " + path);
    }

    public void move(String newPath){
        if (path.equals(newPath)){
            System.out.println("No hay cambios.");
        } else {
            path = newPath;
            System.out.println("Se ha movido el fichero a " + newPath);
        }

    }
}
