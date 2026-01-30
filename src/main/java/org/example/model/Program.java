package org.example.model;

public class Program <T extends Archivo>{
    private String name;
    private T[] archivos;

    public Program(String name, T[] archivos) {
        this.name = name;
        this.archivos = archivos;
    }

    public void execute(String outputPath){
        System.out.println(name.toUpperCase());
        for (T t : archivos){
            t.open();
            t.move(outputPath);
        }
    }
}
