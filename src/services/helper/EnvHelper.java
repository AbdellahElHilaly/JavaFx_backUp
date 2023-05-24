package services.helper;

// red and write from .env file using i/o stream (reader and writer)

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PrimitiveIterator;


public class EnvHelper {

  private FileReader envFileReader;
  private FileWriter envFileWriter;
  private String envFilePath = "src/.env";
  private String oldData;




  public EnvHelper() {
    try {
      this.envFileReader = new FileReader(this.envFilePath);
      this.envFileWriter = new FileWriter(this.envFilePath, true);
      this.oldData = this.read();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
  

  public String getValue(String key) {
    return this.oldData.split(key + "=")[1].split("\n")[0];
  }


  public void setValue(String key, String value) {

    String oldLine = key + "=" + this.getValue(key);
    String newLine = key + "=" + value;
    String newData = this.oldData.replace(oldLine, newLine);
    
    this.write(newData);
    this.oldData = newData;


  }




  private void write(String data) {
    try {
      this.envFileWriter = new FileWriter(this.envFilePath);
      this.envFileWriter.write(data);
      this.envFileWriter.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private String read() {
    String data = "";
    try {
      int i;
      while ((i = this.envFileReader.read()) != -1) {
        data += (char) i;
      }
      this.envFileReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return data;
  }
  





  





  



  





  
}

