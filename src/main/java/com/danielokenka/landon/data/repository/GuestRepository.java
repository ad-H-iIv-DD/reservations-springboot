package com.danielokenka.landon.data.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.danielokenka.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}