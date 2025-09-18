package Tech_Rostrum;
public class SimpleCamelCase 
{
    
	public static void main(String[] args) 
	{
        String sentence = "heLLo woRLD to ThE cOmpanY";
        
        String[] words = sentence.split(" ");
        String result = "";
        
        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restLetters = word.substring(1).toLowerCase();
                result += firstLetter + restLetters + " ";
            }
        }
        
        System.out.println(result);
    }

    
}