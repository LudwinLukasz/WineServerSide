package pl.ll.wines.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by arabk on 07.02.2018.
 */
public interface WineCRUDRepository extends CrudRepository<Wine, Long> {
}
