package org.example;

import org.example.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Text text = new Text(100, "./home/docs", "LORE IPSUM");
        Image image = new Image(100, "./home/docs", 20, 90);
        Text text2 = new Text(250, "./home/docs/nota.txt", "Este es un ejemplo de texto");
        Image image2 = new Image(500, "./home/images/foto.png", 800, 600);
        Text text3 = new Text(150, "./home/docs/resumen.txt", "Resumen del proyecto");
        Audio audio1 = new Audio(3000, "./home/music/cancion.mp3", 180); // duración en segundos


        text.open();
        image.open();

        Text[] texts = new Text[3];
        texts[1] = text;
        texts[2] = text2;
        texts[3] = text3;

        Program program = new Program("Txt", texts);
        program.execute("./Home/Doc/Examen");
    }
}