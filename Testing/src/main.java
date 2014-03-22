import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.commons.io.IOUtils;



public class main {

	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		/*
		InputStream is = 
                main.class.getResourceAsStream( "test.txt");
	       String jsonTxt = IOUtils.toString( is );
	        */
	       BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ryan\\Desktop\\test.txt"));
	       
	       
	       
	       List<Players> players= gson.fromJson(br,new com.google
                   .gson
                   .reflect
                   .TypeToken<List<Players>>(){}.getType());
	       
	       for(Players player:players)
	       {
	        System.out.println(Integer.toString(player.getP_id()));
	       }
	       
	       /*
	        JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt ); 

	        Type listOfPlayersType = new TypeToken<List<Players>>() {}.getType();
	        List<Players> books = gson.fromJson(json, listOfPlayersType);
	        */
	        
	}
}
