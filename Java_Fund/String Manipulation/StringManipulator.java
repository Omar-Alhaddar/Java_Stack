public class StringManipulator{

    public String trimAndConcat(String a, String b){
        String x = a.trim()+b.trim();
        return x;
    }

    public Integer getIndexOrNull(String x, char o){
        int r= x.indexOf(o);
        if (r == -1){
            return null;
        }
        else
            return x.indexOf(o);
    }

    public Integer getIndexOrNull(String y, String z){

        int r= y.indexOf(z);
        if (r == -1){
            return null;
        }
        else
            return y.indexOf(z);
    }

    public String concatSubstring(String a, int b, int c, String d){

        String x = a.substring(b,c);
        String h = x+d;
        return h;

    }
}