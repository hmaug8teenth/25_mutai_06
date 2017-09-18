package kadai1.問題2;

import java.util.Scanner;

public class ColLesson02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Word[]words = new Word[10];

		System.out.println("￼英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int index = 0;
		while (!input.equals("e")) {
						String [] tmp = new String[2];
						tmp = input.split(" ");
						Word wd = new Word(tmp[0], tmp[1]);
						words[index] = wd;
						index++;
						System.out.println("次の英単語と日本語を入力して下さい。\"e\"で終了します。");
						input = sc.nextLine();
		}
		for (int i = 0; i < index; i++) {
			System.out.println(words[i]);
		}
		System.out.println(index + "件、登録しました。");
	}
}


