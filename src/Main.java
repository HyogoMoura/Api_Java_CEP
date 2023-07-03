import Model.Address;
import Model.CreateJson;
import Model.SearchAddress;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Scanner;

//API Consult, Exceptions treatment, File storage.

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        SearchAddress search01 = new SearchAddress();

        System.out.println("Type your ZipCode");
        var inCep = reader.next();

        try{
            Address newAddress = search01.searchAddress(inCep);
            System.out.println(newAddress);
            CreateJson generator = new CreateJson();
            generator.storeJson(newAddress);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("End of Application");

        }

    }
}