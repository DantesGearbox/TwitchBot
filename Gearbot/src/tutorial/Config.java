package tutorial;

public class Config {
	
	public static String currentGame = "GameName"; //Insert game name
	
	public static void main(String[] args) throws Exception{
		
		String channelName = "#"; //Insert channel name here
		
		//Define the bot
		Bot bot = new Bot();
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv", 6667, "oauth"); //Enter oauth code from twitch here
		bot.joinChannel(channelName); //Insert channel name here
		bot.getName();
	}
	
	public static String[] swearWords = {"Fuck", "Gipsy"};
}
