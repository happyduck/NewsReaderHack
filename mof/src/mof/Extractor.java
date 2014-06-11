package mof;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class Extractor {
	ListMultimap<String, String> multimap = ArrayListMultimap.create();
	String[] subevent = {
"add", 
"fun",
"follow",
"fan",
"miss",
"visit",
"want",
"stand",
"believe",
"support",
"interest",
"enjoy",
"back",
"love",
"like",
"sponsor",
"welcome",
"likes",
"care",
"protect",
"grant",
"relation",
"desire",
"favour",
"value",
"thanks", };

	public static void main(String[] args){
		/*
		Charset charset = Charset.forName("utf-8");
		Path p = Paths.get("events_dataset2.csv");
		try (
				BufferedReader reader = Files.newBufferedReader(p, charset)) {
			    String line = null;
			    while ((line = reader.readLine()) != null) {
			        System.out.println(line);
			    }
			} catch (IOException x) {
			    System.err.format("IOException: %s%n", x);
		}*/
		InputStream in;
		try {
			in = new FileInputStream(new File("events_dataset.csv"));
			CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
			decoder.onMalformedInput(CodingErrorAction.IGNORE);
			Reader reader = new InputStreamReader(in, decoder);
			BufferedReader buffer = new BufferedReader(reader);
			
		    String line = null;
		    try {
				while ((line = buffer.readLine()) != null) {
//				    System.out.println(line);
					transform(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void transform(String line){
		String[] row = line.split(","); 
		
	}
	
	
}
