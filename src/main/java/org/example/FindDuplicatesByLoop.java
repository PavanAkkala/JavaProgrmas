package org.example;

public class FindDuplicatesByLoop {

    public static void main(String[] args) {

        String[] arr = {"java", "python", "csharp","php", "java", "csharp"};

        boolean flag = false;

        for(int i=0; i< arr.length; i++) {

            for (int j=i+1; j< arr.length; j++) {

                if(arr[i].equals(arr[j])) {

                    System.out.println("Duplicates found "+arr[i]);
                     flag = true;
                }
            }
        }

        if(!flag) {

            System.out.println("NO Duplicates found");
        }
    }
}
