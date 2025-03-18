import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class strings {
    @Contract(pure = true)
    public static @NotNull String combineStrings(String str1, String str2) {
        return str1 + " " + str2;
    }
}


