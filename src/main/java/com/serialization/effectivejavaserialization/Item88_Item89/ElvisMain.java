package com.serialization.effectivejavaserialization.Item88_Item89;

import java.io.*;

public class ElvisMain {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream oos ;

        try{

            oos = new ObjectOutputStream(os);
            oos.writeObject(Elvis.INSTANCE);
            oos.close();

            ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(is);

            Elvis e= (Elvis) ois.readObject();
            System.out.printf("Elvis is %s the one used before", e == Elvis.INSTANCE ? "-" : "not");
            ois.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

/*
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream out = null;
		try {
		  out = new ObjectOutputStream(bos);
		  out.writeObject(Elvis.INSTANCE);
		  out.flush();
		  byte[] yourBytes = bos.toByteArray();
		  System.out.println();
		} finally {
		  try {
		    bos.close();
		  } catch (IOException ex) {
		    // ignore close exception
		  }
		}

 */
    }




    }
