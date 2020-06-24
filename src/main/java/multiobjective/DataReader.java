package multiobjective;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DataReader {
	
	public static int TOTAL_PLAYERS;
	public static final HashMap<Integer , Player> PLAYERS = new HashMap<Integer , Player>();
		
	public static void generatePlayers()throws IOException {
		
		String csvFile = "/home/fancyarrow/Documents/data.csv";
        String line = "";      
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            int index = 0;
            while ((line = br.readLine()) != null) {
            	PLAYERS.put(index , new Player(index , line));
            	index++;
            }
            TOTAL_PLAYERS = PLAYERS.size();	            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
}
