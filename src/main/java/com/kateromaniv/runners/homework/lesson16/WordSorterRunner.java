package com.kateromaniv.runners.homework.lesson16;

import java.util.*;

/*Created by katr on 23.07.2017.
 */
public class WordSorterRunner {
    public static void main(String argz[]){
        String a;
        List<String> wordsArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write words you`d like to sort. " +
                "After each word press ENTER. To finish press ENTER 2 times");
        while (scanner.hasNextLine()) {
            a = scanner.nextLine();
            if (a.equals(""))
                break;
            wordsArray.add(a);
        }
        Collections.sort(wordsArray);
        System.out.println(wordsArray.toString().replace("[","").replace(",","")
                .replace("]","").replace(" ","\n"));
    }
}
