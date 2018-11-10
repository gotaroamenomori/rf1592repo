import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.BigInteger;

/**
 * GitHub練習用
 */
public class Rf1592{
    public static void main(String[] ags){
	System.out.println("Hello World");
	if(ags.length > 0){
	    System.out.println(kaijo(Integer.parseInt(ags[0])));
	}
	printToday();
	sayFusuryu();
    }

    public static BigInteger kaijo(long num){
	BigInteger ret=BigInteger.ONE;
	for(int i=0; i<num; i++){
	    ret = ret.multiply(BigInteger.valueOf(i+1));
	}
	return ret;
    }

    public static void printToday(){
	SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	System.out.println(fmt.format(new Date()));
    }

    public static void sayFusuryu(){
	System.out.println("We are Fukiko, Suou, Ryuna!!");
    }
}
