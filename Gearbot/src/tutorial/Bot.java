package tutorial;

import org.jibble.pircbot.*;

public class Bot extends PircBot{
	
	public Bot(){
		this.setName("GearboxBot"); //Change this to my bots twitch-name
	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message){
		for(int i = 0; i < Config.swearWords.length; i++){
			if(message.contains(Config.swearWords[i])){
				
			}
		}	
	}
}
