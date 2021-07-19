package maciek;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Methods {

    public void largest4NumbersMultiplier() {
        String numbersChain =
                "73167176531330624919225119674426574742355349194934" +
                        "96983520312774506326239578318016984801869478851843" +
                        "85861560789112949495459501737958331952853208805511" +
                        "12540698747158523863050715693290963295227443043557" +
                        "66896648950445244523161731856403098711121722383113" +
                        "62229893423380308135336276614282806444486645238749" +
                        "30358907296290491560440772390713810515859307960866" +
                        "70172427121883998797908792274921901699720888093776" +
                        "65727333001053367881220235421809751254540594752243" +
                        "52584907711670556013604839586446706324415722155397" +
                        "53697817977846174064955149290862569321978468622482" +
                        "83972241375657056057490261407972968652414535100474" +
                        "82166370484403199890008895243450658541227588666881" +
                        "16427171479924442928230863465674813919123162824586" +
                        "17866458359124566529476545682848912883142607690042" +
                        "24219022671055626321111109370544217506941658960408" +
                        "07198403850962455444362981230987879927244284909188" +
                        "84580156166097919133875499200524063689912560717606" +
                        "05886116467109405077541002256983155200055935729725" +
                        "71636269561882670428252483600823257530420752963450";

        int numbersArray[] = new int[1000];

        for (int i = 0; i < numbersChain.length(); i++) {
            numbersArray[i] = Integer.parseInt(
                    Character.toString(numbersChain.charAt(i))
            );
        }
        System.out.println(check4NumbersBigger(numbersArray));
    }

    public int check4NumbersBigger(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length - 4; i++) {
            if (array[i] < array[i + 4]) {
                int multiplierAmount = array[i + 1] * array[i + 2] * array[i + 3] * array[i + 4];
                if (multiplierAmount > result) {
                    result = multiplierAmount;
                }
            }
        }
        return result;
    }

    public void showPowerfulDigitCounts() {
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (String.valueOf(Math.pow(i, j)).length() == j + 2) {
                    System.out.println(i + "^" + j + " = " + Math.pow(i, j));
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public void fibonacci1000(long digits) {
        long n1 = 0;
        long n2 = 1;
        for (long i = 1; i < 99999999999L; i++) {
            long n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            String tmpString = String.valueOf(n1);
            if (tmpString.length() == digits) {
                System.out.println(i);
                break;
            }
        }
    }

    public void eightDigitPrime() {
        int counter = 0;
        for (int i = 56003; i <= 300000; i++) {
            String tmpStr = String.valueOf(i);
            char a = tmpStr.charAt(0);
            char b = tmpStr.charAt(1);
            char c = tmpStr.charAt(2);
            char d = tmpStr.charAt(3);
            char e = tmpStr.charAt(4);
            char f = tmpStr.charAt(5);
            if (e == '3' && c == d && isPrime(i)) {
                counter++;
                if (counter == 8) {
                    System.out.println(tmpStr);
                    break;
                }
            }
        }
    }

    public void fiveDigitPrime34() {
        int counter = 0;
        for (int i = 56003; i <= 56993; i++) {
            String tmpStr = String.valueOf(i);
            char c = tmpStr.charAt(2);
            char d = tmpStr.charAt(3);
            char e = tmpStr.charAt(4);
            if (e == '3' && c == d && isPrime(i)) {
                System.out.println(tmpStr);
                counter++;
            }
            ;
        }
        System.out.println(counter);
    }

    public void twoDigitPrime2() {
        for (int i = 13; i <= 93; i++) {
            String tmpStr = String.valueOf(i);
            char c = tmpStr.charAt(1);
            if (c == '3' && isPrime(i)) {
                System.out.println(tmpStr);
            }
        }
    }

    public void PythagoreanTripletSumToNumber(int number) {
        for (int i = 1; i < number / 2; i++) {
            for (int j = 0; j < number / 2; j++) {
                for (int k = 0; k < number / 2; k++) {
                    if (i < j && j < k) {
                        if (i * i + j * j == k * k && (i + j + k) == 1000) {
                            System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                            System.out.println("i^2 = " + i * i + ", j^2 = " + j * j + ", k^2 = " + k * k);
                            System.out.println("i * j * k = " + i * j * k);
                        }
                    }
                }
            }
        }
    }

    public void PythagoreanTriplet(int number) {
        for (int i = 1; i < number / 2; i++) {
            for (int j = 0; j < number / 2; j++) {
                for (int k = 0; k < number / 2; k++) {
                    if (i < j && j < k) {
                        if (i * i + j * j == k * k) {
                            System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                            System.out.println("i^2 = " + i * i + ", j^2 = " + j * j + ", k^2 = " + k * k);
                        }
                    }
                }
            }
        }
    }

    public void displayPrime(int number) {
        int counter = 0;
        for (int i = 2; i < 9999999; i++) {
            if (isPrime(i)) {
                counter++;
            }
            if (counter == number) {
                System.out.println(number + " - " + i);
                break;
            }
        }
    }

    public boolean isPrime(int number) {
        int counter = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            return true;
        }
        return false;
    }

    public void smallerModuloNr1to10() {
        for (long i = 1; i < 900000000; i++) {
            int counter = 0;
            for (int j = 2; j <= 20; j++) {
                if (restModulo(i, j)) {
                    counter++;
                    if (counter == 19) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }

    public boolean restModulo(long amount, int number) {
        if (amount % number == 0) {
            return true;
        }
        return false;
    }

    public int palindromicNumberOf999() {
        int result = 1;
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                if (isPalindrome(i * j)) {
                    result = Math.max(result, (i * j));
                }
            }
        }
        return result;
    }

    public int palindromicNumber2Of999() {
        int result = 1;
        for (int i = 999999; i > 99; i--) {

        }
        return result;
    }

    public boolean isPalindrome(int number) {
        String strNumber = String.valueOf(number);
        String tmpString = "";
        for (int i = strNumber.length() - 1; i >= 0; i--) {
            tmpString += strNumber.charAt(i);
        }
        if (tmpString.equals(strNumber) && number >= 10)
            return true;
        return false;
    }

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
            } else if (tab[i] > 0) {
                positiveNrSum += tab[i];
            }
        }
        System.out.println(arrayList);
        System.out.println(positiveNrSum);
    }

    //aaaaaaa
    public String StringChallenge(String str) {
        str = "dsfdsf";
        int counter = 1;
        int L = str.length();
        String tmpLetter = "";
        for (int i = 0; i < L - 1; i++) {
            if (i < L && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
                tmpLetter = String.valueOf(str.charAt(i));
            }

        }
        return str;
    }

    public static int Array(int[] arr) {
        boolean array[] = new boolean[arr.length];
        int firstStudent = arr[1];
        int secondStudent = arr[1];
        int L = array.length;
        array[firstStudent] = false;
        array[secondStudent] = false;
        for (int i = 0; i < L - 1; i++) {

        }
        return arr[0];
    }

    public void coinMachine(List<Integer> coins) {
        int count1PLN = 0;
        int count2PLN = 0;
        int count5PLN = 0;

        for (int coin : coins) {
            if (coin == 1) {
                count1PLN++;
                System.out.println("Not returning anything.");
            } else if (coin == 2) {
                count2PLN++;
                if (count1PLN >= 1) {
                    count1PLN--;
                    System.out.println("Returning 1 PLN.");
                } else System.out.println("Not returning anything.");
            } else if (coin == 5) {
                count5PLN++;
                if (count2PLN >= 2) {
                    count2PLN -= 2;
                    System.out.println("Returning 2x 2 PLN.");
                } else if (count2PLN >= 1 && count1PLN >= 2) {
                    count2PLN -= 1;
                    count1PLN -= 2;
                    System.out.println("Returning 1x 2 PLN & 2x 1 PLN.");
                } else if (count1PLN >= 4) {
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
