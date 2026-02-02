package org.example.readers.random;

import lombok.AllArgsConstructor;
import org.example.model.Archivo;
import org.example.model.Audio;
import org.example.model.Image;
import org.example.model.Text;
import org.example.readers.Reader;

import java.util.Random;

public class RandomArchivoReader implements Reader<Archivo> {
    private final Random random;
    private Reader<Text> textReader;
    private Reader<Image> imageReader;
    private Reader<Audio> audioReader;

    public RandomArchivoReader(Random random, Reader<Text> textReader, Reader<Image> imageReader, Reader<Audio> audioReader) {
        this.random = random;
        this.textReader = textReader;
        this.imageReader = imageReader;
        this.audioReader = audioReader;
    }

    @Override
    public Archivo read(){
       var type = random.nextInt(1, 3);
       if (type == 1){
           return textReader.read();
       } else if (type == 2) {
           return imageReader.read();
       } else if (type == 3) {
           return audioReader.read();
       }
    }
}
