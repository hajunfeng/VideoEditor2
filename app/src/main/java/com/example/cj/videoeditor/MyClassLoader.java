package com.example.cj.videoeditor;

public class MyClassLoader extends ClassLoader{
    public MyClassLoader(){
        super();
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
