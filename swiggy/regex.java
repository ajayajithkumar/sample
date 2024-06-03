package swiggy;

import java.util.regex.*;

public class regex{
	
public void reg() {
	String a="i am ajay.come from trichy!@}{";
	Pattern p=Pattern.compile("[^!@&*+=\\?/]",Pattern.CASE_INSENSITIVE);
	Matcher m=p.matcher(a);
	while(m.find()) {
		System.out.println(m.group()+"\t"+m.start());
	}
	
}
public static void main(String ar[]) {
	regex r=new regex();
	r.reg();
}
}
