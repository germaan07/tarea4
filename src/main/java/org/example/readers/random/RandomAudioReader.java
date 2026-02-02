package org.example.readers.random;

import org.example.model.Audio;
import org.example.model.Image;

import java.util.Random;

public class RandomAudioReader {
    private Random random;

    public RandomAudioReader(Random random) {
        this.random = random;
    }

    @Override
    public Audio read(){
        String[] BASICS = {
                "home", "user", "users", "data", "mnt", "opt", "var"
        };

        String[] FOLDERS = {
                "docs", "documents", "texts", "notes", "reports", "images", "pictures", "photos", "screenshots", "music",
                "audio", "mp3", "wav", "podcasts", "videos", "movies", "series", "downloads", "desktop", "projects", "java",
                "python", "resources", "assets", "src", "bin", "lib", "config", "settings", "temp", "cache", "logs",
                "backups", "old", "archive", "shared", "public", "private", "work", "school", "uni", "personal", "test",
                "debug"
        };

        String path = "./";

        String originFolder = BASICS[random.nextInt(BASICS.length)];
        path = path + originFolder;

        var numFolders = random.nextInt(2, 8);

        String[] folders = new String[numFolders];

        for (int i = 0; i < numFolders; i++){
            Boolean correctFold = false;

            while (!correctFold){
                String folder = FOLDERS[random.nextInt(FOLDERS.length)];

                correctFold = true;

                for (String f : folders){
                    if (f.equals(folder) && f != null){
                        correctFold = false;
                    }
                    if (correctFold){
                        path  = path + "/" + folder;
                        folders[i] = folder;
                    }
                }
            }
        }

        int size = random.nextInt(1, 1000000);

        int duration = random.nextInt(1, 20000);

        return new Audio(size, path, duration);
    }
}
