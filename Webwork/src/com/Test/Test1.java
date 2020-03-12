package com.Test;

import java.util.ArrayList;
import org.junit.Test;
import com.fxx.Card;
import com.fxx.Compare;
import com.fxx.Player;
import com.fxx.comp_Card;

public class Test1 {
	@Test
	public void test1() {
		Card card=new Card();
		ArrayList<String> card2 = card.getCard();
		comp_Card cc=new comp_Card(card2);
		ArrayList<String> card_list1 = cc.getCard_list1();
		ArrayList<String> card_list2 = cc.getCard_list2();
		Player Witle=new Player("Witle", card_list1);
		Player Black=new Player("Black", card_list2);
		Compare.find_Level(Witle);
		System.out.println(Witle.getName()+":"+Witle.getPcard());
		Compare.find_Level(Black);
		System.out.println(Black.getName()+":"+Black.getPcard());
		Compare.comp(Witle, Black);
	}
	@Test
	public void test2() {
		String ss="12345";
		System.out.println(ss.substring(1, ss.length()));
	}
	@Test
	public void test3() {
		ArrayList<Character> testlist = new ArrayList<Character>();
		for (int i = 2; i <10 ; i++) {
			testlist.add((char) (i+48));
        }
		System.out.println(testlist);
	}
	@Test
	public void test_Tie() {
		ArrayList<String> card_list1 = new ArrayList<String>();
		card_list1.add("H2");
		card_list1.add("D3");
		card_list1.add("S5");
		card_list1.add("C9");
		card_list1.add("DK");
		ArrayList<String> card_list2 = new ArrayList<String>();
		card_list2.add("H2");
		card_list2.add("D3");
		card_list2.add("S5");
		card_list2.add("C9");
		card_list2.add("DK");
		Player Witle=new Player("Witle", card_list1);
		Player Black=new Player("Black", card_list2);
		Compare.find_Level(Witle);
		System.out.println(Witle.getName()+":"+Witle.getPcard());
		Compare.find_Level(Black);
		System.out.println(Black.getName()+":"+Black.getPcard());
		Compare.comp(Witle, Black);
	}
	@Test
	public void test_Full_House() {
		ArrayList<String> card_list1 = new ArrayList<String>();
		card_list1.add("H2");
		card_list1.add("S4");
		card_list1.add("C4");
		card_list1.add("D2");
		card_list1.add("H4");
		ArrayList<String> card_list2 = new ArrayList<String>();
		card_list2.add("S2");
		card_list2.add("S8");
		card_list2.add("SA");
		card_list2.add("SQ");
		card_list2.add("S3");
		Player Witle=new Player("Witle", card_list1);
		Player Black=new Player("Black", card_list2);
		Compare.find_Level(Witle);
		System.out.println(Witle.getName()+":"+Witle.getPcard());
		Compare.find_Level(Black);
		System.out.println(Black.getName()+":"+Black.getPcard());
		Compare.comp(Witle, Black);
	}
}
