class MergeSortedArray {
    public static final int NA = -1;

    public void merge2one(int A[], int B[], int n, int m) {
        int i,j,k;

        j = n+m-1;
        for (i=n+m-1; i>=0; i--) {
            if (A[i] != NA) {
                A[j] = A[i];
                j--;
            }
        }

        i = m;
        j = 0;
        k = 0;
        while (k < n+m) {
            if ((i < n+m && A[i] < B[j]) || j==m) {
                A[k] = A[i];
                k++;
                i++;
            } else {
                A[k] = B[j];
                k++;
                j++;
            }
        }
    }

    public static void main(String args[]) {
        MergeSortedArray msa = new MergeSortedArray();
        int A[] = {2,NA,4,6,8,NA,10,NA,NA,14};
        int n = 6;
        int B[] = {1,3,5,17};
        int m = 4;
        msa.merge2one(A,B,n,m);
        System.out.println("Merged Array ");
        for(int i=0; i< n+m; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
