package Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJson {
    public void storeJson(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //filewrite genetate exeptions
        FileWriter wr = new FileWriter(address.cep() + ".json");
        wr.write(gson.toJson(address));
        wr.close();
    }
}
