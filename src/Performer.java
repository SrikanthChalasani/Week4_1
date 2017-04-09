public class Performer implements IPerformer {
	private final String unionID;

	// constructor
	public Performer(int unionID) {
		this.unionID = String.format("ID-%s", unionID);
	}	

	public String getunionID() {
		return this.unionID;
	}

//	public void DisplayPerformerID() {
//		System.out.printf("%s - %s%n", this.unionID, "performer");
//	}
	
	public void printPerformer()
	{
		System.out.printf("%s - %s", this.unionID, "performer");
	}
}
