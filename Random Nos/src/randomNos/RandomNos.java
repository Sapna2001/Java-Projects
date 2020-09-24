package randomNos;

import java.util.*;

public class RandomNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter;
		Random rnum = new Random();
		for(counter=1;counter<=7;counter++) {
			System.out.println(rnum.nextInt(270));
		}
	}

}
