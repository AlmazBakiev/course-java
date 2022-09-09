package ru.gb.javalvl3.almazbakiev;

import java.lang.reflect.*;

public class TestExecutor {
    public static void start(Class<?> testClass) {

        int countBeforeAfterSuite = 0;
        for (Method declaredMethod : testClass.getDeclaredMethods()) {
            if (declaredMethod.isAnnotationPresent(BeforeSuite.class) || declaredMethod.isAnnotationPresent(AfterSuite.class)) {
                countBeforeAfterSuite++;
            }
            if (countBeforeAfterSuite > 2) {
                throw new RuntimeException();
            }
        }

        Constructor<?> constructor;
        Object o = null;
        try {
            constructor = testClass.getConstructor();
            o = constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        for (Method declaredMethod : testClass.getDeclaredMethods()) {
            if (declaredMethod.getAnnotation(BeforeSuite.class) != null) {
                try {
                    declaredMethod.invoke(o);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i = 10; i > 0; i--) {
            for (Method declaredMethod : testClass.getDeclaredMethods()) {
                if (declaredMethod.getAnnotation(Test.class) != null && declaredMethod.getAnnotation(Test.class).order() == i) {
                    int modifiers = declaredMethod.getModifiers();
                    if (Modifier.isPrivate(modifiers)) {
                        declaredMethod.setAccessible(true);
                    }
                    try {
                        declaredMethod.invoke(o);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        for (Method declaredMethod : testClass.getDeclaredMethods()) {
            if (declaredMethod.getAnnotation(AfterSuite.class) != null) {
                try {
                    declaredMethod.invoke(o);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
