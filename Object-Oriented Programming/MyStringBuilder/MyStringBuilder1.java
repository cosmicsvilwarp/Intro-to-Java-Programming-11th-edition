class MyStringBuilder1{
	private String s;
	
	//Constructor Methods 
	MyStringBuilder1(String s){
		this.s = s;
	}
	
	public MyStringBuilder1 append(MyStringBuilder1 s){
		String newstr = this.s;
		newstr += s;
		return new MyStringBuilder1(newstr);
	}
	
	public MyStringBuilder1 append(int i){
		String newstr = this.s;
		newstr += i + "";
		return new MyStringBuilder1(newstr);
	}
	
	public int length(){
		return s.length();
	}
	
	public char charAt(int index){
		return s.charAt(index);
	}
	
	public MyStringBuilder1 toLowerCase(){
		String newstr = "";
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				newstr += (char)(s.charAt(i)+32) + "";
		}
		return new MyStringBuilder1(newstr);
	}
	
	public MyStringBuilder1 substring(int begin, int index){
		String newstr = "";
		for(int i = begin; i < index; i++){
			newstr += s.charAt(i);
		}
		return new MyStringBuilder1(newstr);
	}
	
	public String toString(){
		return s;
	}
}