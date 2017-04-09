
public class Vocalist extends Performer {
	private String vocalkey;
	private int volume;

	// enum
	private enum KEYS {
		G, H, I, J
	};
	
	
	public Vocalist(int unionID, int vocalKeySelection, int vocalistVolume) {
		super(unionID);
		this.volume = vocalistVolume;
				switch (vocalKeySelection) {
		case 0:
 {
			vocalkey = String.format("%s", KEYS.G);
			break;
		}
		case 1:
 {
			vocalkey = String.format("%s", KEYS.H);
			break;
		}
		case 2:
 {
			vocalkey = String.format("%s", KEYS.I);

			break;
		}
		case 3:
 {
			vocalkey = String.format("%s", KEYS.J);
			break;
		}
		}
	}

//	public void displayVocalist() {
//		System.out.printf("%s - %s %n", "I sing in the key of", getVocalkey(),
//				getunionID());
//	}

	public void printPerformer()
	{
		
		System.out.println(displayVocalist());
	}
	public String displayVocalist() {
		return String.format("%s - %s - %s %s %s", "I sing in the key of",
				getVocalkey(), " at the volume ", this.volume, getunionID());
	}

	public String getVocalkey() {
		return vocalkey;
	}


}
