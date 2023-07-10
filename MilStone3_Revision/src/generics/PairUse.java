package generics;


/*
 * here we cannot use premitive class like int char,double we have to use non premitive like INTEGRE,STRING etc adn this Intereg are called wrapper class
 */
public class PairUse{
    public static void main(String[] args){
//    	Pair p = new Pair(10, 20);
//       Pair<String> ps = new Pair<String>("aa","bb");
//       System.out.println(ps.getFirst() + " "+ ps.getSecond());
//       Pair<Integer> pI = new Pair<Integer>(10,20);
//       System.out.println(pI.getFirst() + " " + pI.getSecond());
    	
    	//Pair p = new Pair(10, 20);
        Pair<String,Integer> ps = new Pair<String,Integer>("aa",1);
        Pair<Pair<String,Integer>,String> ppp = new Pair<>();
        Pair<String,Integer> ps2 = new Pair<String,Integer>("rahul" , 2);	
        ppp.setFirst(ps2);
        ppp.setSecond("xingj yadav");
        System.out.println(ppp.getFirst().getFirst() + " "+ ppp.getFirst().getSecond()+" "+ ppp.getSecond());
      
    }
}
