package com.company.Hw27March;

import java.io.*;

public class Methods implements Serializable {

    public void serialize(Object obj) throws IOException
    {
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Hw27March\\serialize.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
    }

    public void deserialize(Object obj) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Twist3r\\IdeaProjects\\Homeworks\\src\\com\\company\\Hw27March\\serialize.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        obj = (Object) objectInputStream.readObject();
        System.out.println(obj);
    }
}
