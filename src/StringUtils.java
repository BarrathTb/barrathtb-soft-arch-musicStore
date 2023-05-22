import java.util.List;

public class StringUtils {
    public static String normalize(String string, List<String[]> replacements) {
        String normalized = string.toLowerCase();
        for (String[] replacement : replacements) {
            normalized = normalized.replace(replacement[0], replacement[1]);
        }
        return normalized;
    }
}
