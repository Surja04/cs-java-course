public class task13_demo{
    public static void main(String[]args){
        String str = "Abraca Dabra";
        String new_word =  ""+str.charAt(0);
        
        for(int i=1; i < str.length(); i++){
            char ch = str.charAt(i);
            boolean found = false;
            for(int j=0; j<new_word.length(); j++){
                
                if(ch==new_word.charAt(j)){
                    found = true;
                    break;
                }
                
            }
            if(!found){
                new_word += ch;
            } 
            
        }
        System.out.print(new_word); 
    }
}

