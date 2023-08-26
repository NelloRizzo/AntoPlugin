package io.github.iamantoo.antoplugin.data.repositories;

import java.util.UUID;
import java.util.stream.Stream;

public interface Repository<T> {
    T create(T entity);
    T readById(UUID id);
    Stream<T> readAll();
    T update(UUID id, T entity);
    T delete(UUID id);
}
