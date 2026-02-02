package org.example;

import org.example.model.*;
import org.example.readers.Reader;
import org.example.readers.random.RandomArchivoReader;
import org.example.readers.random.RandomAudioReader;
import org.example.readers.random.RandomImageReader;
import org.example.readers.random.RandomTextReader;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        RandomAudioReader randomAudioReader = new RandomAudioReader(random);
        RandomImageReader randomImageReader = new RandomImageReader(random);
        RandomTextReader randomTextReader = new RandomTextReader(random);

}