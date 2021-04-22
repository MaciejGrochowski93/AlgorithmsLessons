package maciek;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Methods {

    public void sortDescending(int tab[]) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j + 1] > tab[j]) {
                    int tmpNumber = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmpNumber;
                }
            }
        }
    }

    public void printNGE(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            int next = -1;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] > tab[i]) {
                    next = tab[j];
                    break;
                }
            }
            System.out.println(tab[i] + " --> " + next);
        }
    }

    public void fizzBuzz(int amount) {
        for (int i = 1; i < amount; i++) {
            String f = " fizz";
            String b = " buzz";
            String fb = " fizzbuzz";
            if (i % 5 == 0 && i % 3 == 0) System.out.println(i + fb);
            else if (i % 3 == 0) System.out.println(i + f);
            else if (i % 5 == 0) System.out.println(i + b);
            else
                System.out.println(i);
        }
    }

    public void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i < n; i++) {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println(n1);
        }
    }

    public void reverseWord(String word) {
        String tmpString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            tmpString += word.charAt(i);
        }
        System.out.println(tmpString);
    }

    public int lengthOfLongSubstr(String word) {
        if (word == null || word.length() == 0) {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int result = 1;
        int i = 0;
        for (int j = 0; j < word.length(); j++) {
            char c = word.charAt(j);
            if (!set.contains(c)) {
                set.add(c);
                result = Math.max(result, set.size());
            } else {
                while (j > i) {
                    if (word.charAt(i) == c) {
                        i++;
                        break;
                    }
                    set.remove(word.charAt(i));
                    i++;
                }
            }
        }
        return result;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int result = 1;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (!set.contains(c)) {
                set.add(c);
                result = Math.max(result, set.size());
            } else {
                while (i < j) {
                    if (s.charAt(i) == c) {
                        i++;
                        break;
                    }

                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return result;
    }

    public int countUniqueChars(String word) {
        HashSet<Character> set = new HashSet<>();
        if (word == null || word.length() == 0) {
            return 0;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            set.add(c);
        }
        return set.size();
    }

    public void setZeroes(int[][] matrix) {
        boolean rowZero = false;
        boolean columnZero = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                rowZero = true;
                break;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                columnZero = true;
                break;
            }
        }
        // 2 7 0 3
        // 4 3 5 8
        // 0 4 0 3
        // 6 2 5 7

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (rowZero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (columnZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public String reverseSentence(String word) {
        String tmpString = "";
        String[] actualValue = word.split(" ");
        for (int i = actualValue.length - 1; i >= 0; i--) {
            tmpString += actualValue[i] + " ";
        }
        return tmpString;
    }

    public void showNegativeElemAmount(int tab[]) {
        ArrayList arrayList = new ArrayList();
        int positiveNrSum = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                arrayList.add(tab[i]);
            } else if (tab[i] > 0){
                positiveNrSum += tab[i];
            }
        }
        System.out.println(arrayList);
        System.out.println(positiveNrSum);
    }

    public void coinMachine(List<Integer> coins){
        int count1PLN = 0;
        int count2PLN = 0;
        int count5PLN = 0;

        for (int coin : coins){
            if (coin == 1){
                count1PLN++;
                System.out.println("Not returning anything.");
            }
            else if (coin == 2){
                count2PLN++;
                if (count1PLN >= 1){
                    count1PLN--;
                    System.out.println("Returning 1 PLN.");
                } else System.out.println("Not returning anything.");
            }
            else if (coin == 5){
                count5PLN++;
                if (count2PLN >= 2){
                    count2PLN -= 2;
                    System.out.println("Returning 2x 2 PLN.");
                } else if (count2PLN >= 1 && count1PLN >= 2){
                    count2PLN -= 1;
                    count1PLN -= 2;
                    System.out.println("Returning 1x 2 PLN & 2x 1 PLN.");
                } else if (count1PLN >= 4){
                    count1PLN -= 4;
                } else System.out.println("Not returning anything.");
            }
        }
        System.out.println("1 PLN amount = " + count1PLN);
        System.out.println("2 PLN amount = " + count2PLN);
        System.out.println("5 PLN amount = " + count5PLN);
        System.out.println("Total PLN sum = " + (count1PLN * 1 + count2PLN * 2 + count5PLN * 5));
    }


//        int result = 1;
//        int i=0;
//        for(int j=0; j<s.length(); j++){
//            char c = s.charAt(j);
//            if(!set.contains(c)){
//                set.add(c);
//                result = Math.max(result, set.size());
//            }else{
//                while(i<j){
//                    if(s.charAt(i)==c){
//                        i++;
//                        break;
//                    }
//
//                    set.remove(s.charAt(i));
//                    i++;
//                }
//            }
//        }
//
//        return result;

}
