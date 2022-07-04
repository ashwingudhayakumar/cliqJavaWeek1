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
    
    public static ArrayList getPara(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  paragraph");
        String paragraph=sc.nextLine();
         paragraph=paragraph.replace(".","");
        paragraph=paragraph.replace(",","");
        paragraph=paragraph.replace("!","");
        String[] paraWords = paragraph.split(" ");  
        ArrayList alForPara=new ArrayList();
        alForPara.addAll(Arrays.asList(paraWords));
        return alForPara;
    }
    
    public static TreeMap treeGenerator(ArrayList alForPara){
        Iterator itr=alForPara.listIterator();
	    TreeMap<Integer,ArrayList<String>> treeMap=new TreeMap<Integer,ArrayList<String>>(Collections.reverseOrder());
	    while(itr.hasNext()){
	        String local=(String)itr.next();
	         if(palindromeCheck(local)){
	             if(!treeMap.containsKey(local.length())){
                 ArrayList localAl = new ArrayList();
                 localAl.add(local);
	             treeMap.put(local.length(),localAl);
	             }
	             else{
	                 if(!treeMap.get(local.length()).contains(local))
	                 treeMap.get(local.length()).add(local);
	             }
	         }
	         
	    }
	    return treeMap;
    }
    public static void showCommon( TreeMap<Integer,ArrayList<String>> treeMap1, TreeMap<Integer,ArrayList<String>> treeMap2){
         Iterator mapOneIterator=treeMap1.keySet().iterator();
         boolean once =true;
	       while(mapOneIterator.hasNext()){
	           int mapOneCurrentKey=(int)mapOneIterator.next();
	           if(treeMap2.containsKey(mapOneCurrentKey)){
	               var map2CurrentValues=treeMap2.get(mapOneCurrentKey);
	           Iterator map1Value=treeMap1.get(mapOneCurrentKey).iterator();
	           while(map1Value.hasNext() ){
	               String tempMap1Value=(String)map1Value.next();
	               if(map2CurrentValues.contains(tempMap1Value) && once){
	               System.out.println("common palindrome "+tempMap1Value);
	               once=false;
	               break;
	               }
	           }
	           }
	       }
    }
    public static void main(String[] args) {
         ArrayList alForFirstPara=getPara();
        System.out.println("first para "+alForFirstPara);
        
        ArrayList alForSecondPara=getPara();
        System.out.println("second para "+alForSecondPara);
        
        TreeMap<Integer,ArrayList<String>> treeMap1=treeGenerator(alForFirstPara);
	    System.out.println("treeMap1 "+treeMap1);
	    
	    TreeMap<Integer,ArrayList<String>> treeMap2=treeGenerator(alForSecondPara);
	    System.out.println("treeMap2 "+treeMap2);
  
	    if(treeMap1.size()>=1 && treeMap2.size()>=1){
	    if(treeMap1.firstKey()<treeMap2.firstKey()){
	   
	      showCommon(treeMap1,treeMap2);
	       
	    }
	    else if(treeMap1.firstKey()>treeMap2.firstKey()){
	      showCommon(treeMap2,treeMap1);     
	        
	    }
	    else{
	        showCommon(treeMap1,treeMap2);
	    }
	    }

    }
}
