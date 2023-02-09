package com.fatihtoker.afspraak.repository;

import com.fatihtoker.afspraak.model.MeetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetRepository extends JpaRepository<MeetModel, Long> {
}
