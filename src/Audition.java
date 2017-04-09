import java.util.ArrayList;
import java.util.List;

public class Audition {

	// main method
	public static void main(String[] args) {

		int unionID = 400;

		List<Performer> performers = new ArrayList<>();
		performers.add(new Performer(++unionID));
		performers.add(new Performer(++unionID));
		performers.add(new Performer(++unionID));
		performers.add(new Performer(++unionID));
		performers.add(new Dancer(++unionID, 1));
		performers.add(new Dancer(++unionID, 3));
		performers.add(new Vocalist(++unionID, 2, 5));

		for (Performer performer : performers) {
			performer.printPerformer();
			System.out.println();

		}
	}
}
