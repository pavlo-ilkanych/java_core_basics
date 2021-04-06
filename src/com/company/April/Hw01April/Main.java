package com.company.April.Hw01April;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Hw01April\\FieldsWithAnnotation.txt";
        writeFieldsWithAnnotationToFile(path);
    }

    private static void writeFieldsWithAnnotationToFile(String path)
    {
        Class animalSpecies = AnimalSpecies.class;
        for(Field field : animalSpecies.getDeclaredFields())
        {
            Habitat habitatAnnotation = (Habitat) field.getAnnotation(Habitat.class);
            if(habitatAnnotation != null)
            {
                System.out.println("Field name: " + field.getName());
                try(Writer writer = new FileWriter(path))
                {
                    writer.write(field.getName());
                    writer.flush();
                }catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }
}
