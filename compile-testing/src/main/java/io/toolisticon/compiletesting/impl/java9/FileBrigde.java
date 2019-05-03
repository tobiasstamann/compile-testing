package io.toolisticon.compiletesting.impl.java9;

import java.io.File;
import java.lang.reflect.Method;

/**
 * Brigde class to get path from file.
 */
public class FileBrigde {

    /**
     * the File.toPath() method.
     */
    private static final Method TO_PATH_METHOD = AbstractJava9BaseWrapper.getMethod(File.class, "toPath");


    /**
     * Get wrapped Path for file.
     *
     * @param file the file to get the path for.
     * @return the {@link PathWrapper} instance for the file
     */
    public static PathWrapper toPath(File file) {

        Object result = AbstractJava9BaseWrapper.invoke(TO_PATH_METHOD, file, Object.class);

        return new PathWrapper(result);

    }


}