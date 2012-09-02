import java.io.IOException;
import java.util.StringTokenizer;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;


public class SentenceScorer 
{
	private TextStatistics ts;
	private Dictionary ssd;
	
	public SentenceScorer() {}
	
	public SentenceScorer(String filename) throws SAXException, IOException, ParserConfigurationException 
	{
		ts = new TextStatistics(filename);
		ssd = new Dictionary();
	}
	
	public float getSentenceScore(SentenceObj sent)
	{
		float score = 0;
		String word;
		String sentence = sent.getSentence();
		Stemmer s = new Stemmer();
		sentence = s.stemString(sentence);
		StringTokenizer st = new StringTokenizer(sentence);
		int no_of_tokens = st.countTokens();
		if(no_of_tokens == 0) 
			return 0;
		/* Centroid score of the sentence */
		while(st.hasMoreTokens())
		{
			word = st.nextToken();
			word = word.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "").replaceAll("-", "\n");
			
			if(ts.contains(word))
	    	{
	    		score+=ts.getWordCountOf(word);
	    		//System.out.println(word + " " + score + " \n");
	    	}
			if(ssd.isCuePhrase(word))
			{
				score += 200;
			}
		}
		if(sent.getSentence().contains(":"))
			score += 10;
		/* Extra score when sentence is the heading line */
		
		score = score / no_of_tokens;
		return score;
	}
	
}
