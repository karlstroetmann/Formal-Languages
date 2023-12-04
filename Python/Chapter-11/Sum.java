public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(6 * 6));
    }

    static int sum(int n) {
	int s = 0;
	for (int i = 0; i <= n; ++i) {
	    s += i;
	}
	return s;
    }
}
