package com.anucana.utils;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUtils {

	public static <T> Collection<T> addToNewList(T... ts ){
		Collection<T> list = new ArrayList<T>();
		if(ts != null){
			for(T t : ts ){
				list.add(t);
			}
		}
		return list;
	}

	
}
