class AsmCmd {
    protected int mCode;

	public AsmCmd(int op, int x, int y, int z, int u) {
		if (op == 0) {
			mCode = x;
			mCode = (mCode << 8) | y;
			mCode = (mCode << 8) | z;
			mCode = (mCode << 8) | u;
		} else if (op == 9) {
			mCode  = op << 27;
			mCode |= (x << 22);
			mCode |= (y & 4194303);
		} else {
			mCode  = op << 27;
			mCode |= (x << 22);
			mCode |= (y << 17);
			mCode |= (z << 12);
		}
    }
    public void writeCode() {
		int b0   = (mCode >>  0) & 255;
		int b1   = (mCode >>  8) & 255;
		int b2   = (mCode >> 16) & 255;
		int b3   = (mCode >> 24) & 255;
		System.out.write(b0);
		System.out.write(b1);
		System.out.write(b2);
		System.out.write(b3);
    }    
}
