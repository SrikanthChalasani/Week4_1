
public class Dancer extends Performer {
	private String style;	

	// enum
	private enum Styles {
		TAP, SALSA, HIPHOP, JAZZ
	};

	
	public Dancer(int unionID, int styleSelection) {
		super(unionID);	
		switch (styleSelection) {
		case 0:
 {	
			style = String.format("%s", Styles.TAP);
			break;
		}
		case 1:
 {
			style = String.format("%s", Styles.SALSA);
			break;
		}
		case 2:
 {
			style = String.format("%s", Styles.HIPHOP);

			break;
		}
		case 3:
 {
			style = String.format("%s", Styles.JAZZ);
			break;
		}
		}
	}

	public void printPerformer()
	{
		System.out.println(displayDancer());
		
	}

	public String displayDancer() {
		return String.format("%s -%s - %s", this.style, getunionID(),
				"dancer");
	}
}
