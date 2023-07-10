package OOPS_1;

public class Polynomial {
	DynamicArray coffArray;
	DynamicArray degreeArray;
	int degreeValue;
	public Polynomial() {
		coffArray= new DynamicArray();
		degreeArray = new DynamicArray();
		degreeValue = 0;
	}
	public void setCoefficient(int degree, int coeff){ // deg = index pos
		
		if(degree>= coffArray.size()) {
			// need to increast the 0 in the array
			for(int i=coffArray.size();i<=degree+1;i++) {
				coffArray.add(0);
			}
		}
		if(coffArray.contain(degree,coeff) ) {
			//System.out.println(true);
			coffArray.set(coeff, degree);
			return;
		}
		coffArray.set(coeff,degree );
		this.degreeValue = degree;
		degreeArray.add(degree);
		//System.out.println(degreeValue);
	}
	public int getCoffieient(int deg) {
		
		return coffArray.get(deg);
		}
		public int degree() {
			return coffArray.size();
			
			}
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
		public void print(){
			
			for(int i=0;i<degreeArray.size();i++) {
				
				System.out.print(coffArray.get(degreeArray.get(i)) + "x^"+degreeArray.get(i)+" ");
			}
			System.out.println();
		}

		public Polynomial add(Polynomial p) {
			Polynomial ans = new Polynomial();
			Polynomial p2 = new Polynomial();
			p2=p;
			
			for(int i=0;i<this.coffArray.size();i++) {
				//System.out.println(this.getCoffieient(i) +" "+ p2.getCoffieient(i));
				if((this.getCoffieient(i)!=0 || p2.getCoffieient(i)!=0)) {
						int suncoff = this.getCoffieient(i) + p2.getCoffieient(i);
						//System.out.println(suncoff);
						ans.setCoefficient(i,suncoff);
					}
					
				}
			for(int i=0;i<p2.coffArray.size();i++) {
				//System.out.println(this.getCoffieient(i) +" "+ p2.getCoffieient(i));
				if((this.getCoffieient(i)!=0 || p2.getCoffieient(i)!=0)) {
					if(ans.getCoffieient(i)==0) {
						int suncoff = this.getCoffieient(i) + p2.getCoffieient(i);
					//	System.out.println(suncoff);
						ans.setCoefficient(i,suncoff);
					}
						
					}
					
				}
			
		
			return ans;
		}

//		// Subtracts two polynomials and returns a new polynomial which has result
		public Polynomial subtract(Polynomial p){
		
			Polynomial ans = new Polynomial();
			Polynomial p2 = new Polynomial();
			p2=p;
			for(int i=0;i<this.coffArray.size();i++) {
				System.out.println(this.getCoffieient(i) +" "+ p2.getCoffieient(i));
				if((this.getCoffieient(i)!=0 || p2.getCoffieient(i)!=0)) {
						int suncoff = this.getCoffieient(i) - p2.getCoffieient(i);
						if(suncoff!=0) {
							//System.out.println(suncoff);
							ans.setCoefficient(i,suncoff);
						}
					}
					
				}
			for(int i=0;i<p2.coffArray.size();i++) {
				//System.out.println(this.getCoffieient(i) +" "+ p2.getCoffieient(i));
				if((this.getCoffieient(i)!=0 || p2.getCoffieient(i)!=0)) {
					if(ans.getCoffieient(i)==0) {
						int suncoff = this.getCoffieient(i) - p2.getCoffieient(i);
						if(suncoff!=0) {
					//		System.out.println(suncoff);
							ans.setCoefficient(i,suncoff);
						}
						
					}
						
					}
					
				}
			
		
			return ans;
		}
/// Multiply two polynomials and returns a new polynomial which has result
		public Polynomial multiply(Polynomial p){
			Polynomial ans = new Polynomial();
//			Polynomial 
			for(int i=0;i<this.coffArray.size();i++) {
				//System.out.println(this.coffArray.get(i)+" "+ p.coffArray.get(i));
				int multiplier = this.coffArray.get(i);
				
				if(multiplier!=0) {
					
					for(int j=0;j<p.coffArray.size();j++) {
						//System.out.println("multiplier" + multiplier+" "+p.coffArray.get(j));
						//System.out.println("muld val->"+multiplier*p.coffArray.get(j));
						int multVal =  multiplier*p.coffArray.get(j);
						// checking if cofficient exist or not
						//System.out.println("multVal"+multVal);
						if(multVal!=0) {
							int elempos = (i+j);
							//System.out.println(elempos);
							if(ans.coffArray.get(elempos)!=0) {
								//System.out.println("asdas");
								int cofVal = ans.coffArray.get(elempos);
								ans.setCoefficient(elempos, cofVal+multVal);
						//		System.out.println("ans"+ ans.coffArray.get(j));
							}else {
								ans.setCoefficient(elempos, multVal);
							}
						}
						
					}
				}
				
			}
			return ans;
		}

}
