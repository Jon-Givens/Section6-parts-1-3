public class CountChar_4_3 {

    public static void main(String[] args) {

        String str = "www.oracle.com";
        int i = 0;
        int max = str.length();
        int count = 0;

        while (i < max) {
            if (str.charAt(i) != 'w') {
                i++;
                continue;
            }
                count++;
                i++;
        }

        System.out.println("Counting w : " + count );
    }
}
    

