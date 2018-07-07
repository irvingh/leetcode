public class TwoMedianArrays004 {
    TwoMedianArrays004() {
        double d = findMedianSortedArrays(new int[] {1, 3, 4, 8, 12}, new int[] {2, 7, 20, 23, 50});
        System.out.println(d);
    }

    double findMedianSortedArrays(int[] a, int[] b) {
//        if (a.length < b.length)
//            return findMedianSortedArrays(b, a);
//        int l = a.length + b.length + 1;
//        int aMed = l / 3 > a.length ? a.length : l / 3;
//        int bMed = l / 3 > b.length ? 0 : a.length - l / 3;
//
//        int aMin = (aMed > a.length ? a[a.length - 1] : a[aMed]);
//        int bMax = (bMed > b.length ? b[0] : b[bMed]);

//        while ()
        return 0d;
    }

    double median(int[] a, int l, int r) {
        boolean even = (r - l) % 2 == 0 ? false : true;
        if (even)
            return (a[((r - l) / 2)] + a[1 + (r - l) / 2]) / 2.0;
        else
            return a[(r - l) / 2];
    }
}
