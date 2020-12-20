package gameClient;

import java.util.Comparator;
import java.util.List;

public class List_Sort implements Comparator<List>{

	@Override
	public int compare(List o1, List o2) {
		if(o1.size() > o2.size()) return 1;
		if(o1.size() < o2.size()) return -1;
		return 0;
	}

}
