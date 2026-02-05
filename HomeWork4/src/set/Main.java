// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package set;
public class Main {
    public static void main(String[] args ){
        /**
         * Creating an instance
         */
        SimpleSet <Integer> Agrope=new SimpleSet<>();
        SimpleSet <Integer> Bgrope=new SimpleSet<>();
        /**
         * Adding members to the instance with the add function
         */
        Agrope.add(1);
        Agrope.add(2);
        Agrope.add(3);
        Agrope.add(4);
        Agrope.add(5);
        Agrope.add(6);

        Bgrope.add(3);
        Bgrope.add(4);
        Bgrope.add(5);
        Bgrope.add(6);
        Bgrope.add(7);

        /**
         * Creating the shows and printing them
         */
        SimpleSet<Integer> union = SetUtils.union(Agrope, Bgrope);
        System.out.println("union: "+union);

        SimpleSet<Integer> intersection = SetUtils.intersection(Agrope, Bgrope);
        System.out.println("intersection: "+intersection);

        SimpleSet<Integer> difference = SetUtils.difference(Agrope, Bgrope);
        System.out.println("difference: "+difference);

        SimpleSet<Integer> symmetricDifference = SetUtils.symmetricDifference(Agrope, Bgrope);
        System.out.println("symmetric Difference: "+symmetricDifference);

    }
}
