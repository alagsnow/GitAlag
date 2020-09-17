package tool;

public class dbHashCode {
    public static void main(String[] args) {
        int hashCode = bkdrHash("AurogonTestSKU4487552689693052973") % 64;
        System.out.println(hashCode);
    }

    /**
     * 接口返回的 字段计算分表，返回表的后缀
     * @param str  需要计算的
     * @return  分表后缀
     */
    public static int bkdrHash(String str) {
        int seed = 131; // 31 131 1313 13131 131313 etc..
        int hash = 0;

        for (int i = 0; i < str.length(); i++) {
            hash = (hash * seed) + str.charAt(i);
        }

        return hash & 0x7FFFFFFF;
    }
}
