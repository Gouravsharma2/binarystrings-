public class binarystringss {
    public static void pbstring(int n,int lastplace,String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }
        if (lastplace ==0) {
            pbstring(n-1,0,str+"0");
            pbstring(n-1,1,str+"1");
        } else {
            pbstring(n-1,0,str+"0");
        }

    }
    public static void main (String args[]) {
        pbstring(3,0,"");
    }
}