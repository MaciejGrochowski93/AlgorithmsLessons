package maciek;

import java.util.Arrays;

public class main {
    public static void main(String args[]) {

        Methods methods = new Methods();

        int tab1[] = {2, 5, 67, 11, -3, 4, 56};
        Arrays.sort(tab1);

//        for (int numbers : tab1) {
//            System.out.println(numbers);
//        }
//        System.out.println("---");
//
//        methods.sortDescending(tab1);
//
//        for (int numbers : tab1) {
//            System.out.println(numbers);
//        }
//
//        System.out.println("---- Human comparator ----");
//
//        Human h1 = new Human("male", "Maciek", 700);
//        Human h2 = new Human("female", "Agata", 300);
//        Human h3 = new Human("male", "Marcin", 300);
//        Human h4 = new Human("female", "Kasia", 500);
//        Human tab2[] = new Human[]{h1, h2, h3, h4};

//        SalaryComparator salaryComparator = new SalaryComparator();
//        Arrays.sort(tab2, salaryComparator);

//        for (Human hum : tab2) {
//            System.out.println(hum);
//        }
//
//        System.out.println("---");
//
//        int tab3[] = new int[]{3, -2, 5, -11, 4};

//        methods.printNGE(tab3);


//        System.out.println("---");

//        methods.fizzBuzz(100);
//        methods.fibonacci(20);

//        methods.reverseWord("Maciek");
//
//        System.out.println(methods.lengthOfLongestSubstring2("HowLongIsTheSubstring?"));
//
//        int matrix[][] = new int[2][4]; // ilość X/ilość Y
//
//        int matrix2[][] = {
//                {2, 4, 5, 6},
//                {2, 3, 4, 5}
//        };
//        System.out.println(matrix2.length); // ilość X
//        System.out.println(matrix2[0].length);
//
//        System.out.println(methods.reverseSentence("Do you want to build a snowman?"));

//        System.out.println(Character.BYTES); // 2
//        System.out.println(Integer.BYTES); // 4
//        System.out.println(Long.BYTES); // 8
//        System.out.println(Double.BYTES); // 8

//        System.out.println(methods.StringChallenge("wwwwaaww"));

//        System.out.println("Negative elements + sum of positive");
//        int tab4[] = new int[]{33, -352, 225, -21, 434};
//        methods.showNegativeElemAmount(tab4);
//
//        methods.coinMachine(List.of(1, 2, 2, 2, 5));
//        System.out.println("---");
//        methods.coinMachine(List.of(2, 5, 1, 2, 5, 2, 2, 1, 1, 2, 5));
//


//        String a = "Maciek";
//        String b = "Maciek";
//        System.out.println(a.equals(b));
//        char c = 'f';
//        char d = 'f';
//        System.out.println(c == d);
//        System.out.println(methods.lengthOfLongSubstr("sarfojiagfegojiewgore"));
//        System.out.println(methods.lengthOfLongSubstr("mamanmtreama"));
//        System.out.println(methods.countUniqueChars("mamanmtreama"));
//        System.out.println(methods.countUniqueChars("abcabcbb"));
//        System.out.println(methods.countUniqueChars("bbbb"));
//        System.out.println(methods.countUniqueChars("sarfojiagfegojiewgore"));
//        System.out.println(methods.lengthOfLongestSubstring2("sarfojiagfegojiewgore"));

//        System.out.println(methods.isPalindrome(88988));
//        System.out.println(methods.palindromicNumberOf999());
//        methods.smallerModuloNr1to10();

//        methods.displayPrime(10001);
//        methods.isPhytagorean(1000);
//        methods.PythagoreanTripletSumToNumber(1000);
//        methods.fiveDigitPrime34();

//        methods.fibonacci1000(1000);
//        double a = 5.3;
//        int b = 33;
//        a = b + a;
//        System.out.println(a);
//        // Słowo kluczowe continue pozwalaja na kontynuowanie pętli od następnej wartości z pominięciem kodu, który występuje w tej pętli za Continue.
//        // Idea ich działania polega na umieszczeniu wszystkich obiektów w grafie, przejściu całego grafu i oznaczeniu obiektów, do których udało nam się dotrzeć.
//
//        String s = "fd";
//        String s1 = "fgfg";
//        String s2 = "gf";
//        System.out.println(s1);
//        System.out.println(s2);
//
//        System.out.println(s1.compareTo(s));
//        System.out.println(s2.compareTo(s));
//        System.out.println(s2.compareTo(s1));
//        int x = 2;
//        int y = x = 3;
//        System.out.println(x);
//        System.out.println(y);
//
//        System.out.println("---");
//        byte c = 23;
//        System.out.println(c);
//
//        double sa = 2;
//        int se = 2;
//        System.out.println(sa >= se);
//
//        try {
//            System.out.println(5 / 0);
//        }
//        catch(Exception e) {
//            System.err.println("gfgfg");
//        }
//        System.out.println(5/0);
//
//        System.out.println("hehe");
//        System.out.println("hehe");
//        System.out.println("hehe");
//

//        Scanner scanner = new Scanner(System.in);
//        int scannerNumber;
//        int tab[] = new int[5];
//
//        for (int i = 0; i < tab.length; i++) {
//            System.out.println("Tell me number " + (i + 1));    // tablica liczy od 0, więc
//            scannerNumber = scanner.nextInt();
//            if (methods.isPrime(scannerNumber)) {
//                tab[i] = scannerNumber;
//            }
//        }
//        for (int i = 0; i < tab.length; i++) {
//            if (tab[i] != 0) {
//                System.out.println(tab[i]);
//            }
//        }

//        methods.showPowerfulDigitCounts();

        methods.largest4NumbersMultiplier();

//        int nineteen[] = new int[]{
//                0,
//                "one".length(),
//                "three".length(),
//                "four".length(),
//                "five".length(),
//                "six".length(),
//                "seven".length(),
//                "eight".length(),
//                "nine".length(),
//                "ten".length(),
//                "eleven".length(),
//                "twelve".length(),
//                "thirteen".length(),
//                "fourteen".length(),
//                "fifteen".length(),
//                "sixteen".length(),
//                "seventeen".length(),
//                "eighteen".length(),
//                "nineteen".length()
//        };
//
//        int tenMultiplies[] = new int[]{
//                "twenty".length(),
//                "thirty".length(),
//                "fourty".length(),
//                "fifty".length(),
//                "sixty".length(),
//                "seventy".length(),
//                "eighty".length(),
//                "ninety".length()
//        };
//
//        int hundredMultiplier = "hundred".length() + "and".length();
//
//        int numberLengthCounter = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if (i < 20) {
//                numberLengthCounter += nineteen[i];
//            }
//            if (i < 100 && i > 19) {
//                for (int TEN : tenMultiplies) {
//                    numberLengthCounter += TEN;
//                }
//            }
//
//        }

    }
}