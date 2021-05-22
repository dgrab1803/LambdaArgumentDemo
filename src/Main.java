package academy.learnprogramming;

public class Main extends LambdaArgumentDemo{

    public static void main(String[] args) {
	    String inStr = "Wyrażenia lambda rozszerzają możliwości JAVY";
	    String outStr;

        System.out.println("łancuch wejsciowy " + inStr);
        
        StringFunc reverse = (str) -> {
            String result = "";
            
            for(int i = str.length()-1; i>=0; i--)
                result += str.charAt(i);
                
            return result;
        };
        
        outStr = changeStr(reverse, inStr);
        System.out.println("odwrocony łanuch znakowy: " + outStr);

        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("Lancuch z zamienionymi odstępami: " + outStr);

        outStr = changeStr((str) -> {
                String result = "";
                char ch;

                for(int i = 0; i<str.length(); i++){
                    ch = str.charAt(i);
                    if(Character.isUpperCase(ch))
                        result += Character.toLowerCase(ch);
                    else
                        result += Character.toUpperCase(ch);
                }
                return result;
        }, inStr);
        System.out.println("łancuch ze zmieniona wielkoscia liter" + outStr);
    }
}
