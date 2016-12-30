package test.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestList {
	@Test
	public void Test01(){
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		if (list.contains(1)){
			System.out.println("aaa");
		}
	}
}
