// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.Iterator;
class HelloWorld {
    
    public static ArrayList search(String searchValue,int option){
        
         ArrayList<String> al=new ArrayList<>();
        al.add("ashwin l");
        al.add("godwin");
        
        
        
        
        ArrayList<String> returnableAl=new ArrayList<>();
        if(option==1){
             Iterator itr=al.iterator();
        
          while(itr.hasNext()){
            String temp=(String)itr.next();
            if(temp.startsWith(searchValue)){
               returnableAl.add(temp);
            }
          }
          return returnableAl;
        }
        else if(option==2){
            
            Iterator itr2=al.iterator();
        
        while(itr2.hasNext()){
            String temp=(String)itr2.next();
            if(temp.endsWith(searchValue)){
                 returnableAl.add(temp);
            }
        }
          return returnableAl;  
        }
        else{
            
            Iterator itr3=al.iterator();
        
        while(itr3.hasNext()){
            String temp=(String)itr3.next();
            if(temp.contains(searchValue)){
                 returnableAl.add(temp);
            }
        }
        return returnableAl;
        }
    }
    public static void main(String[] args) {
       
        System.out.println(search("wi",3));
        
       
        
        
        
        
    }
}
