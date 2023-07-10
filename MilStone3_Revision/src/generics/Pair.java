package generics;

//public class Pair<T>{
//    private T first;
//    private T second;
//
//    public Pair(T first, T second){
//      this.first = first;
//      this.second = second;
//    }
//
//    public T getFirst(){
//        return first;
//    }
//
//    public void setFirst(T first){
//        this.first=first;
//    }
//
//    public T getSecond(){
//      return second;
//    }
//
//    public void setSecond(T second){
//      this.second= second;
//    }
//}

// 2nd type
public class Pair<T,S>{
    public Pair() {
		super();
		// TODO Auto-generated constructor stub
	}

	private T first;
    private S second;

    public Pair(T first, S second){
      this.first = first;
      this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public void setFirst(T first){
        this.first=first;
    }

    public S getSecond(){
      return second;
    }

    public void setSecond(S second){
      this.second= second;
    }
}
