import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Collections;
class HelloWorld {
    public static boolean palindromeCheck(String s){
        if(s.length()>=1){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)==s.charAt(j)){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first paragraph");
        String paragraph1=sc.nextLine();
         paragraph1=paragraph1.replace(".","");
        paragraph1=paragraph1.replace(",","");
        paragraph1=paragraph1.replace("!","");
        String[] paraWords1 = paragraph1.split(" ");  
        ArrayList alForFirstPara=new ArrayList();
        alForFirstPara.addAll(Arrays.asList(paraWords1));
        System.out.println("first para "+alForFirstPara);
        
        
        System.out.println("Enter the second paragraph");
        String paragraph2=sc.nextLine();
        paragraph2=paragraph2.replace(".","");
        paragraph2=paragraph2.replace(",","");
        paragraph2=paragraph2.replace("!","");
        String[] paraWords2 = paragraph2.split(" ");  
        ArrayList alForSecondPara=new ArrayList();
        alForSecondPara.addAll(Arrays.asList(paraWords2));
        System.out.println("second para "+alForSecondPara);
        
        Iterator litr1=alForFirstPara.listIterator();
	    TreeMap<Integer,ArrayList<String>> treeMap1=new TreeMap<Integer,ArrayList<String>>(Collections.reverseOrder());
	    while(litr1.hasNext()){
	        String local=(String)litr1.next();
	         if(palindromeCheck(local)){
	             if(!treeMap1.containsKey(local.length())){
                 ArrayList localAl = new ArrayList();
                 localAl.add(local);
	             treeMap1.put(local.length(),localAl);
	             }
	             else{
	                 if(!treeMap1.get(local.length()).contains(local))
	                 treeMap1.get(local.length()).add(local);
	             }
	         }
	         
	    }
	    System.out.println("treeMap1 "+treeMap1);
	    
	    Iterator litr2=alForSecondPara.listIterator();
	    TreeMap<Integer,ArrayList<String>> treeMap2=new TreeMap<Integer,ArrayList<String>>(Collections.reverseOrder());
	    while(litr2.hasNext()){
	        String local=(String)litr2.next();
	         if(palindromeCheck(local)){
	             if(!treeMap2.containsKey(local.length())){
                 ArrayList localAl = new ArrayList();
                 localAl.add(local);
	             treeMap2.put(local.length(),localAl);
	             }
	             else{
	                  if(!treeMap2.get(local.length()).contains(local))
	                 treeMap2.get(local.length()).add(local);
	             }
	         }
	         
	    }
	    System.out.println("treeMap2 "+treeMap2);
	    if(treeMap1.size()>=1 && treeMap2.size()>=1){
	    if(treeMap1.firstKey()<treeMap2.firstKey()){
	       //start from treeMap1
	       Iterator mapOneIterator=treeMap1.keySet().iterator();
	       while(mapOneIterator.hasNext()){
	           int mapOneCurrentKey=(int)mapOneIterator.next();
	           if(treeMap2.containsKey(mapOneCurrentKey)){
	               var map2CurrentValues=treeMap2.get(mapOneCurrentKey);
	           Iterator map1Value=treeMap1.get(mapOneCurrentKey).iterator();
	           while(map1Value.hasNext()){
	               String tempMap1Value=(String)map1Value.next();
	               if(map2CurrentValues.contains(tempMap1Value)){
	               System.out.println("common palindrome 1 "+tempMap1Value);
	               break;
	               }
	           }
	           }
	       }
	       
	    }
	    else if(treeMap1.firstKey()>treeMap2.firstKey()){
	        //start from treeMap2
	        Iterator mapTwoIterator=treeMap2.keySet().iterator();
	       while(mapTwoIterator.hasNext()){
	           int mapTwoCurrentKey=(int)mapTwoIterator.next();
	           if(treeMap1.containsKey(mapTwoCurrentKey)){
	               var map1CurrentValues=treeMap1.get(mapTwoCurrentKey);
	           Iterator map2Value=treeMap2.get(mapTwoCurrentKey).iterator();
	           while(map2Value.hasNext()){
	               String tempMap2Value=(String)map2Value.next();
	               if(map1CurrentValues.contains(tempMap2Value)){
	               System.out.println("common palindrome 2 "+tempMap2Value);
	               break;
	               }
	           }
	           }
	       }
	        
	    }
	    else{
	        //start from treeMap1
	         Iterator mapOneIterator=treeMap1.keySet().iterator();
	       while(mapOneIterator.hasNext()){
	           int mapOneCurrentKey=(int)mapOneIterator.next();
	           if(treeMap2.containsKey(mapOneCurrentKey)){
	               var map2CurrentValues=treeMap2.get(mapOneCurrentKey);
	           Iterator map1Value=treeMap1.get(mapOneCurrentKey).iterator();
	           while(map1Value.hasNext()){
	               String tempMap1Value=(String)map1Value.next();
	               if(map2CurrentValues.contains(tempMap1Value)){
	               System.out.println("common palindrome 3 "+tempMap1Value);
	               break;
	               }
	           }
	           }
	       }
	    }
	    }
	    
       
        
      
    }
}
