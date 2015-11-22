public class JPA01 { 
  
    public static int adder (int skill, int action, int excitement) { 
        return skill + action + excitement;                                    
    } 
   
    public static int gameRating (int s, int a, int e) { 
        return adder(s, a, e);                                      
    } 
  
    public static void main (String argv[]) { 
        int skill = 6, action = 9, excitment = 8, result; 
        result = gameRating(skill, action, excitment); 
        System.out.print("The rating of the game is "); 
        System.out.println(result);                        
    } 
} 
