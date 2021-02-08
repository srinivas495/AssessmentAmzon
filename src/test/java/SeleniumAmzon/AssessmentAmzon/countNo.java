package SeleniumAmzon.AssessmentAmzon;

public class countNo {

	public static void main(String[] args) 
	{
		
		int count = countCharacter("Proposal",'o');
		System.out.println(count);

	}

	private static int countCharacter(String word, char c) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=0; i<word.length(); i++) 
		{
			if(word.charAt(i)== c)
			{
				count++;
			}
		}
		return count;
	}
	
}
