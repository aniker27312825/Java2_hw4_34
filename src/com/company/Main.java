package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*a)  В задании нельзя использовать циклы for и for each. Только while и Iterator

b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.

c)  Затем программа должна отобразить этот список

d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает
 его в консоли

e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}

f)  После объединения отобразить в консоли список С

g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим
        количеством символов, и распечатать отсортированный список С.*/

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        while (listA.size() < 5) {
            String input = in.nextLine();
            listA.add(input);
        }

        System.out.println(listA);

        while (listB.size() < 5) {
            String input = in.nextLine();
            listB.add(input);
        }

        System.out.println(listB);

        Iterator<String> iterA = listA.iterator();
        Iterator<String> iterB = listB.iterator();

        boolean aAdded;

        while (iterA.hasNext()) {
            listC.add(iterA.next());
            aAdded = true;
            while (aAdded == true && iterB.hasNext()) {
                listC.add(iterB.next());
                aAdded = false;
            }
        }

        System.out.println(listC);

        boolean isSorted = false;
        String buf;
        int index = 0;

//        while (!isSorted) {
//            isSorted = true;
//            while (index < listC.size() - 1) {
//                index++;
//                if (listC.get(index).length() < listC.get(index + 1).length())
//                    isSorted = false;
//                buf = listC.get(index);
//                listC.set(index, listC.get(index + 1));
//                listC.set(index + 1, buf);
//            }
//        }

        System.out.println(listC);





    }
}
