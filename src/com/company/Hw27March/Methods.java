package com.company.Hw27March;

import java.io.*;

public class Methods {

    public static void serialize(Object obj, String path)
    {
        try (FileOutputStream outputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream))
        {
            objectOutputStream.writeObject(obj);
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static  <K> K deserialize(String path){

        K obj = null;
        try (FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            obj = (K) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return obj;
    }
}
