public class ServerNameGenerator {
    static String[] adjectives = {"annoyed", "mad", "smelly", "tall", "scared", "furious", "energetic", "impatient", "jolly", "happy" };
    static String[] nouns = {"mom", "girl", "boy", "keyboard", "door", "house", "basketball", "cup", "fridge", "car"};

    public static String randomString(String[] array){
        long holder = Math.round(Math.random() * array.length);
        return array[(int) holder];
    }

    public static void main (String[] args){
        System.out.println("Here is your server name: " + randomString(adjectives) +  "-" + randomString(nouns));

    }
}

