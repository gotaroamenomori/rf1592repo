import java.text.SimpleDateFormat;
import java.util.Date;

public class Rf1592{
    public static void main(String[] ags){
	System.out.println("Hello World");
	if(ags.length > 0){
	    System.out.println(kaijo(Integer.parseInt(ags[0])));
	}
	printToday();
    }

    public static int kaijo(int num){
	int ret=1;
	for(int i=0; i<num; i++){
	    ret = ret * (i+1);
	}
	return ret;
    }

    public static void printToday(){
	SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	System.out.println(fmt.format(new Date()));
    }
}
