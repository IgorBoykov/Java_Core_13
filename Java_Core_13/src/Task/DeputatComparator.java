package Task;

import java.util.Comparator;

public class DeputatComparator implements Comparator<Deputat> {

	@Override
	public int compare(Deputat o1, Deputat o2) {
		if (o1.qhabar > o2.qhabar) {
			return -1;
		} else if (o1.qhabar < o2.qhabar) {
			return 1;
		}
		return 0;
	}

}
