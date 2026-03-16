public class ThirdCalc extends SecondCalc {
    public int pow(int n1, int n2) {
        int res = 1;
        for(int i = 1; i <= n2; i++) {
            res *= n1;
        }
        return res;
    }
}
