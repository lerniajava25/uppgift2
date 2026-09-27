package di.lab.part2;

import java.lang.reflect.Constructor;

public class SimpleContainer {

    public <T> T get(Class<T> type) {
        try {
            Constructor<?> constructor = type.getDeclaredConstructors()[0];

            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] parameters = new Object[parameterTypes.length];

            for (int i = 0; i < parameterTypes.length; i++) {
                parameters[i] = get(parameterTypes[i]);
            }

            @SuppressWarnings("unchecked")
            T instance = (T) constructor.newInstance(parameters);
            return instance;

        } catch (Exception e) {
            throw new RuntimeException("Could not create instance of " + type.getName(), e);
        }
    }
}
