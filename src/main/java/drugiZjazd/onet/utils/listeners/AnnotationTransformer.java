package drugiZjazd.onet.utils.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {


  public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,
                        Method method) {
    annotation.setRetryAnalyzer(Retry.class);

  }
}
