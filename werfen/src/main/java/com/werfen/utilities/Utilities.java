package com.werfen.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.util.ResourceUtils;

import com.werfen.entity.InputDoc;

/*Class Utilitties to parse html document*/
public class Utilities {
    public static Stream<InputDoc> parseFileToStream(String fileName) {
        File file = null;
        List <InputDoc> funciones = new ArrayList<InputDoc>();
		try {
			file = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + fileName);
		} catch (FileNotFoundException e) {
			 e.printStackTrace();
		}
      

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            InputDoc doc = null;
            while ((line = reader.readLine()) != null) {
            	doc = new InputDoc();
                String[] tokens = line.split(" ");
                doc.setFunction(tokens[0]);
                doc.setParamter(Integer.valueOf(tokens[1]));
                funciones.add(doc);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return funciones.stream();
    }
    
 
}





