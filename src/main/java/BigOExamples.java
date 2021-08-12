public class BigOExamples {

    public void bigoOf1(String name) {
        System.out.println(name);
    }

    public void bigOOfn(String [] names) {
        for(var i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }
    public void bigOoFN(String [] names) {

        //O(n)
        for(var i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        //O(n)
        //can be simplified to O(n)
        //linear
        for(var i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public void bigOOfN(String [] names, String [] numbers) {
        //O(n)
        for(var i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        //O(m) because it is different input
        //O(n) + O(m) = 0(n)(can be simplified)
        //linear
        for(var i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void bigOOfNSquareQuadratic(String [] names) {
        //O(n)
        for(var i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        //O(n^2) quadratic
        //As the input grows, it will get slower
        //O(n + n^2) = O(n^2) for two nested for loops
        //O(n^3) is for three nested loops
        for(String name: names) {
            for(String nameSecond: names) {
                System.out.println(nameSecond + name);
                for(String nameThird: names) {
                    System.out.println(nameSecond + name + nameThird);
                }
            }
        }
    }

    public void bigOOgLogN(String [] names) {
        //binary search

    }

    public void copyOperation(String[] names) {
        //space complexity O(n)
        String[] copy = new String[names.length];
    }





}
