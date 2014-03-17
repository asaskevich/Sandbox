import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// We annotated our class with AppName annotation
@AppName(name = "Example27", id = 123)
public class Example27 {
	public static void main(String[] args) {
		// Now we can get annotation with reflection
		Class<Example27> cl = Example27.class;
		AppName ann = (AppName) cl.getAnnotation(AppName.class);
		if (ann == null) System.out.println("There is no annotations");
		else System.out.println(ann.toString());
		// OUTPUT: @AppName(name=Example26, id=123)
	}
}

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface AppName {
	String name();

	int id();
}