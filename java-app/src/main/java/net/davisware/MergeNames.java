package net.davisware;

import java.util.ArrayList;
import java.util.List;

public class MergeNames {

        public static String[] uniqueNames(String[] names1, String[] names2) {
            List<String> namesList = new ArrayList();
            String[] totNames;

            for (int i = 0; i < names1.length; i++) {
                namesList.add(names1[i]);
            }

            for (int z = 0; z < names2.length; z++) {
                //System.out.println(names2[z]);
                if (namesList.contains(names2[z])) {
                    //System.out.println("Found a dup: " + names2[z]);
                    continue;
                }else {
                    namesList.add(names2[z]);
                }
            }

            totNames = new String[namesList.size()];
            totNames = namesList.toArray(totNames);

            return totNames;

        }

/*
        public static void main(String[] args) {
            String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
            String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
            System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
        }
*/
    }
