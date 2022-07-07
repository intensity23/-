package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//HashSet 쓸거면 Hash랑 equals가 재정의 돼있어야 한다.
public class HashSetExample {
	public static void main(String[] args) {
		Set<Board> set = new HashSet<>();
		set.add(new Board("제목1", "내용1", "작성자1"));
		set.add(new Board("제목2", "내용2", "작성자2"));
		set.add(new Board("제목3", "내용3", "작성자3"));

		set.add(new Board("제목1", "내용1", "작성자1"));
		System.out.println(set.size());

		for (Board board : set) {
			System.out.println(board);
		}
		System.out.println();

		Iterator<Board> iterator = set.iterator();
		while (iterator.hasNext()) {
			Board board = iterator.next();
			System.out.println(board);

			set.remove(new Board("제목3", "내용3", "작성자3"));

		}

	}

}
