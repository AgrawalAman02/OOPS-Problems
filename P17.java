/*
 * Define an Exception NoMatchFoundException that is thrown when Kolkata is not found from the following set of strings.
 *  city name ={ Kolkata, Chennai, Mumbai, Delhi, Bangalore, Amedabad}
 */


 class NoMatchFoundException extends Exception{
    public NoMatchFoundException(String string){
        super(string);

    }
 }

public class P17 {
    public static void main(String[] args) {
        String [] cityName = { "Chennai", "Mumbai", "Delhi", "Bangalore", "Amedabad"};
        boolean flag = false;
        try{
            for(int i = 0 ; i<cityName.length;i++){
                if(cityName[i].equals("Kolkata")) {
                    flag = true;
                    break;
                }
            }

            if(!flag) throw new NoMatchFoundException("Kolkata is not in the array");
            else System.out.println("Kolkata is found...");
            
        }
        catch(NoMatchFoundException e){
            System.out.println("ERROR : "+ e.getMessage());
        }
    }
}
