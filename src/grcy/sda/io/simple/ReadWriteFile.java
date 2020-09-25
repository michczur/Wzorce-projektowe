package grcy.sda.io.simple;

import java.io.*;
import java.util.Scanner;

public class ReadWriteFile {

    public static void main(String[] args) {
        String fileName = "FirstFile";
        ReadWriteFile readWriteFile = new ReadWriteFile();
        readWriteFile.simpleWriteToFile(fileName);
        readWriteFile.simpleReadFile(fileName);

        readWriteFile.writeWithBuffer("SecondFile");
        readWriteFile.readWithBuffer("SecondFile");

    }

    //simple write znak po znaku
    public void simpleWriteToFile(String filename) {
        try {
            //uchwyt do pliku
            FileWriter writer = new FileWriter(filename);
            writer.write("Sample first line \n");
            writer.write("Sample second line \n");

            writer.close(); //wszelkie podpięte zasoby typu plik, connection należy zamknąć
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //simple read znak po znaku
    public void simpleReadFile(String filename) {
        //to poniżej to tzw try-with-resources, weszło w Javie 1.7
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            System.out.println("Reading file " + filename);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //buforowany zapis - najpierw do bufora a potem większa ilość do pliku
    public void writeWithBuffer(String filename) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
            bufferedWriter.write("First Line \n");
            bufferedWriter.write("Second line");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //buforowany odczyt - najpierw do bufora a potem większa ilość na ekran
    public void readWithBuffer(String filename) {
        String input;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading data from buffer:");
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
