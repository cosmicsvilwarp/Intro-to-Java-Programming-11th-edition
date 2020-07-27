class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	Faculty(String name, String address, String phone, String email, 
					int office, double salary, String officeHours, String rank){
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	//Accessors and mutators
	public String getOfficeHours(){
		return officeHours;
	}
	public String getRank(){
		return rank;
	}
	public void setOfficeHours(String officeHours){
		this.officeHours = officeHours;
	}
	public void setRank(String rank){
		this.rank = rank;
	}
	//toString method
	@Override
	public String toString(){
		return (super.toString()+ "\nOffice Hours: "+getOfficeHours()+"\nRank: "+getRank());
	}
}