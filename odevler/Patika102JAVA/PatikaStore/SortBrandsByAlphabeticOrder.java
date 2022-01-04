package PatikaStore;

import java.util.Comparator;

public class SortBrandsByAlphabeticOrder implements Comparator<Brand>{
	
	@Override
	public int compare(Brand b1,Brand b2) {
		return b1.getName().compareTo(b2.getName());
	}

}
