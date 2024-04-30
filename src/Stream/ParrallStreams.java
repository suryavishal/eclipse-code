package Stream;

import java.util.Arrays;
import java.util.List;

class students{
	String name;
	int Score;
	
	public students(String name, int score) {
		this.name = name;
		Score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return Score;
	}
	
}

public class ParrallStreams {

	public static void main(String[] args) {
		
		List<students> list =Arrays.asList(new students("ram", 88),
				new students("ravan", 98),
				new students("radhika", 78),
				new students("aradhya", 99),
				new students("hirdhya", 89),
				new students("roshani", 87));
		//using Stream()		
		list.stream().filter(s->s.Score>80).limit(4)
		          .forEach(stu->System.out.print("  "+stu.getName()+"--->"+stu.getScore()));
        //parallel Stream();
	    list.parallelStream().filter(s->s.getScore()>80).limit(4).
	                forEach(Stu-> System.out.print("  "+Stu.getName()+"  ---- "+Stu.getScore()));
	
		//Stream converted into paralle Stream va parrall() method		
		list.stream().parallel().filter(s->s.Score>80).limit(4)
		          .forEach(stu->System.out.print("  "+stu.getName()+"--->"+stu.getScore()));
	
	}
	
	

}
