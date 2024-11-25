
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    // replace this line with your constants

    public static String findTYPattern(String s)
    {
        // replace this line with your code
        String find ="";
        int start = s.toUpperCase().indexOf("T");
        int end = s.toUpperCase().indexOf("Y");
        for (int x = start; x < end+1; x++ ){
            find += s.charAt(x);
        }
        return find;
    }
}
