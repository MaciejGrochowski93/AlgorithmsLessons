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

        System.out.println("---");

        int tab3[] = new int[]{3, -2, 5, -11, 4};

//        methods.printNGE(tab3);


        System.out.println("---");

//        methods.fizzBuzz(100);
//        methods.fibonacci(20);

        methods.reverseWord("Maciek");

        System.out.println(methods.lengthOfLongestSubstring2("HowLongIsTheSubstring?"));

        int matrix[][] = new int[2][4]; // ilość X/ilość Y

        int matrix2[][] = {
                {2, 4, 5, 6},
                {2, 3, 4, 5}
        };
        System.out.println(matrix2.length); // ilość X
        System.out.println(matrix2[0].length);

        System.out.println(methods.reverseSentence("Do you want to build a snowman?"));

        System.out.println(Character.BYTES); // 2
        System.out.println(Integer.BYTES); // 4
        System.out.println(Long.BYTES); // 8
        System.out.println(Double.BYTES); // 8

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


//        System.out.println(methods.lengthOfLongSubstr("Maciek"));
//        System.out.println(methods.lengthOfLongestSubstring2("Maciek"));
//        System.out.println("--");
//        System.out.println(methods.lengthOfLongSubstr("hahahahaha"));
//        System.out.println(methods.lengthOfLongestSubstring2("hahahahaha"));
//        System.out.println("--");
//        System.out.println(methods.lengthOfLongestSubstring2("hdgfhdfhdgfhd"));
//        System.out.println("--");
//        System.out.println(methods.lengthOfLongSubstr("sarfojiagfegojiewgore"));
//        System.out.println(methods.lengthOfLongestSubstring2("sarfojiagfegojiewgore"));
//        System.out.println("--");
    }
}


