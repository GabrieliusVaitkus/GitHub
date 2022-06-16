public static void main(String[] args) {
        int[] a = {4, 0, 9, 2, 1};
        int[] b = {6, 3, 2, 9, 0};
        for (int i = 0; i < a.length; i = i + 1) {
        if (i % 2 == 0) {
        a[i] -= b[i];
        } else {
        b[i] -= a[i];
        }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        }
