/**
 * Created by geralt on 17-6-20.
 */

import org.joda.time.LocalTime;

public class JavaMavenGitTest {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        System.out.println("hello world!");
        System.out.println("hello world again!");
	for(int i=0;i<args.length;i++)
	System.out.println("hello from args: "+args[i]);
    }

}
