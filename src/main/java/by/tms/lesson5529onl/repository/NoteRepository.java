package by.tms.lesson5529onl.repository;

import by.tms.lesson5529onl.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author simonpirko
 * Created on 17.10.24
 */

public interface NoteRepository extends JpaRepository<Note, Long> {
}
