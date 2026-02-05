// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package set;
public class SetUtils extends SimpleSet {


    /**
     *Union function between two groups
     */
    public static SimpleSet union(SimpleSet A, SimpleSet B) {
        SimpleSet union = new SimpleSet();


        for (int i = 0; i < A.size(); i++) {
            if(A.getElements()[i] !=null)
            union.add(A.getElements()[i]);
        }
        for (int i = 0; i < B.size(); i++) {
            if(B.getElements()[i] !=null)
            union.add(B.getElements()[i]);
        }

        return union;
    }

    /**
     *Intersection function between two groups
     */
    public static SimpleSet intersection(SimpleSet A, SimpleSet B) {
        SimpleSet intersection = new SimpleSet();
        SimpleSet C = null;
        int  count=0;

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.getElements()[i] == B.getElements()[j]) {
                    count++;
                }
            }
                if(count ==1){
                    intersection.add(A.getElements()[i]);
                    count=0;
                }
        }
        return intersection;
    }

    /**
     *Difference function between two groups
     */
    public static SimpleSet difference(SimpleSet A, SimpleSet B) {
        SimpleSet difference = new SimpleSet();
        int count=0;

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.getElements()[i]==B.getElements()[j]) {
                    count++;
                    break ;
                }
            }
            if(count==0)
            difference.add(A.getElements()[i]);
        }
        return difference;
    }

    /**
     *symmetric Difference function between two groups
     */
    public static SimpleSet symmetricDifference(SimpleSet A, SimpleSet B) {
        SimpleSet symmetricDifference = new SimpleSet();
        SimpleSet C = null;
        int index = 0, count1 = 0, count2=0;

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                if (A.getElements()[i] == B.getElements()[j]) {
                    count1++;
                }
            }
            if (count1 == 0) {
                symmetricDifference.add(A.getElements()[i]);
            }
            count1 = 0;
        }
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < A.size(); j++) {
                if (B.getElements()[i] == A.getElements()[j]) {
                    count2++;
                }
            }
                if (count2 == 0) {
                    symmetricDifference.add(B.getElements()[i]);
                }
                count2 = 0;
        }
        return symmetricDifference;
    }
    }












