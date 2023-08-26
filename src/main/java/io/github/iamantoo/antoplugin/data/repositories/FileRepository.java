package io.github.iamantoo.antoplugin.data.repositories;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;

public class FileRepository<T extends Serializable> implements Repository<T> {
    private final String fileName;

    private Set<T> items = null;

    public FileRepository(String fileName) {
        this.fileName = fileName;
        load();
    }

    protected void load() {
        try {
            try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName))){
                items = (HashSet<T>)is.readObject();
            }
        }catch (Exception ex) {
            System.err.println(ex);
        }
    }

    protected void save() {
        try {
            try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))){
                os.writeObject(items);
            }
        }catch (Exception ex) {
            System.err.println(ex);
        }
    }

    @Override
    public T create(T entity) {
        items.add(entity);
        save();
        return entity;
    }

    @Override
    public T readById(UUID id) {
        return null;
    }

    @Override
    public Stream<T> readAll() {
        return items.stream();
    }

    @Override
    public T update(UUID id, T entity) {
        return null;
    }

    @Override
    public T delete(UUID id) {
        return null;
    }
}
