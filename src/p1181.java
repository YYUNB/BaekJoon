import java.util.ArrayList;
import java.util.Scanner;

public class p1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> beforeArr = new ArrayList<>();

        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            String word = sc.next();
            if(!beforeArr.contains(word)) beforeArr.add(word);  // 입력 단어가 없을 때 배열에 추가
        }

        int wordNumber = beforeArr.size();
        ArrayList<String> afterArr = new ArrayList<>();

        while(afterArr.size() != wordNumber){
            int min = 51;
            for (int i = 0; i < beforeArr.size(); i++) {
                if (beforeArr.get(i).length() < min) min = beforeArr.get(i).length();
            }

            ArrayList<String> dictSortArr = new ArrayList<>();
            for (int i = 0; i < beforeArr.size(); i++) {
                if(beforeArr.get(i).length() == min) {
                    dictSortArr.add(beforeArr.get(i));
                    beforeArr.remove(beforeArr.get(i));
                }
            }

            // 글자 수 같은 경우 사전적 정의
            String word1 = "";
            String word2 = "";
            for (int i = 0; i < dictSortArr.size()-1 ; i++) {
                for (int j = 0; j < min-1; j++) {
                    if (dictSortArr.get(i).charAt(j) > dictSortArr.get(i+1).charAt(j)) {
                        word1 = dictSortArr.get(i);
                        word2 = dictSortArr.get(i + 1);

                        dictSortArr.set(i, word2);
                        dictSortArr.set(i + 1, word1);
                    } else if (dictSortArr.get(i).charAt(j) == dictSortArr.get(i+1).charAt(j)) {
                        if (dictSortArr.get(i).charAt(j+1) > dictSortArr.get(i+1).charAt(j+1)) {
                            word1 = dictSortArr.get(i);
                            word2 = dictSortArr.get(i + 1);

                            dictSortArr.set(i, word2);
                            dictSortArr.set(i + 1, word1);
                        }
                    }


                }
            }


            System.out.print("[사전 정렬] : ");
            for (int i = 0; i < dictSortArr.size(); i++) {
                afterArr.add(dictSortArr.get(i));
                System.out.print(dictSortArr.get(i) + " ");
            }

            System.out.println();
            dictSortArr.clear();
        }

        System.out.println("\n결과");
        for (int i = 0; i < afterArr.size() ; i++) {
            System.out.println(afterArr.get(i));
        }
    }
}
