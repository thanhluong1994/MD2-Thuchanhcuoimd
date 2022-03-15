package storage;

import model.Phonebook;

import java.io.*;
import java.util.ArrayList;

public class PhonebookFile {
        public static void writeFile(ArrayList<Phonebook> phoneBooksList) throws IOException {
            FileOutputStream fos = null;
            ObjectOutputStream oos=null;
            try {
                fos = new FileOutputStream("list5.luong");
                oos = new ObjectOutputStream(fos);
                oos.writeObject(phoneBooksList);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                oos.close();
                fos.close();
            }
        }

        public static ArrayList<Phonebook> readFile(){
            File file = new  File("list5.luong");
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object result = ois.readObject();
                ArrayList<Phonebook> phonebookList = (ArrayList<Phonebook>) result;
                ois.close();
                fis.close();
                return phonebookList;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return new ArrayList<>();
        }
}
