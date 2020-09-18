package grcy.sda.io.simple;

import java.io.*;
import java.util.Scanner;

public class ReadWriteToFile {
    public static void main(String[] args) {
        String fileName = "FirstFile";
        ReadWriteToFile readWriteToFile = new ReadWriteToFile();
        readWriteToFile.simpleWriteToFile(fileName);
        readWriteToFile.simpleReadFile(fileName);

        readWriteToFile.writeWithBuffer("SecondFile");
        readWriteToFile.readWithBuffer("SecondFile");
    }

    public void simpleWriteToFile(String filename) {
        try {
            //uchwyt do pliku
            FileWriter writer = new FileWriter(filename);
            writer.write("simple first line \n");
            writer.write("simple second line \n");
            writer.close();// wszelkie podpiete zasoby typu plik, connection nalezy zamknac

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //simple read znak po znaku
    public void simpleReadFile(String filename) {
        //to ponizej to tzw try-with-resources, weszło w javie 1.7
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            System.out.println("reading file " + filename);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //bufforowany zapis
    public void writeWithBuffer(String filename){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
            bufferedWriter.write("First line \n");
            bufferedWriter.write("Second line");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //bufforowany odczyt
    public void readWithBuffer(String filename){
        String input;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            System.out.println("reading data from buffer");
            while ((input = bufferedReader.readLine()) != null)
            {
                System.out.println(input);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
