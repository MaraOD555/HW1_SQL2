package ru.hogwarts.school.HW1_SQL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.HW1_SQL2.model.Avatar;
import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> { //расширяет PagingAndSortingRepository
     Optional<Avatar> findAvatarByStudentId (long studentId);
}
