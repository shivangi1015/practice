public class DrawingBookProblem {
    static int pageCount(int n, int p) {
        int startPage = 0;
        if(p == startPage) {
            return 1;
        }
        int pageTurn = 0;
        //check from starting
        for(int i = 1; i<= n; i++) {
            if(p <= i)
                break;
            pageTurn += 1;
        }

        //check from last
        //some problem here
        int pageFromLast = 0;
        for(int i = n; i > 1; i--) {
            if(p >= i-1)
                break;
            pageFromLast += 1;
        }

        System.out.println(pageTurn);
        System.out.println(pageFromLast);

        //compare turn from start and last
        if(pageTurn < pageFromLast)
            return pageTurn;
        else
            return pageFromLast;
    }

    public static void main(String[] args) {
        System.out.println(pageCount(7, 3));
    }
}
