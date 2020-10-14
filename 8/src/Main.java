import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
	public static void main(String[] args) throws IOException{
		
		System.out.println(exchangeRate("USD","EUR"));
		
	}
	
	public static double exchangeRate(String from,String to) throws IOException{
		
		double fromValue = 0,toValue=0;
		
		Document doc = Jsoup.connect("http://www.nbg.ge/rss.php").get();
		
		String html = doc.select("item").select("description").text();
		
		Document temp = Jsoup.parse(html);
		
		for(var t : temp.select("tr")) {
			
			String code = t.childNode(1).childNode(0).toString();
			double value = Double.parseDouble(t.childNode(5).childNode(0).toString());
			
			int count = Integer.parseInt(t.childNode(3).childNode(0).toString().split(" ")[0]);
			value /= count;
			
			if(code.equals(from)) {
				fromValue = value;
			}else if(code.equals(to)) {
				toValue = value;
			}
		}
		
		return fromValue/toValue;
	}
}