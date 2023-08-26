package io.github.iamantoo.antoplugin.data.repositories;

import java.util.UUID;

public interface Repository<T> {
    T create(T entity);
    T readById(UUID id);
    Iterable<T> readAll();
    T update(UUID id, T entity);
    T delete(UUID id);
}
